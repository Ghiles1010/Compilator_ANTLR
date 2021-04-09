import org.antlr.v4.runtime.tree.TerminalNode;
import semantic.*;
import semantic.Errors.*;
import semantic.Errors.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class Visitors extends LangBaseVisitor {

    private Symbol_Table symbol_table;
    private Map<String, Integer> priority;
    private Quadruplet_Table quadruplet_table;
    private Error_Table error_table;
    private Stack<String> postfix;

    //this is used to check types
    private String current_type;

    private int t_counter;

    Stack<String> operators;

    public Visitors() {

        t_counter = 0;
        current_type = "";

        this.operators = new Stack<>();
        this.postfix = new Stack<>();

        this.symbol_table= new Symbol_Table();
        this.quadruplet_table = new Quadruplet_Table();
        this.error_table = new Error_Table();

        this.priority = new HashMap<>() {{
            put("+", 0); put("-", 0); put("*", 1); put("/", 1);
        }};
    }

    private boolean Higher_priority(String op1, String op2){

        return priority.get(op1) > priority.get(op2);
    }

    private boolean Compatible_type(String t1, String t2){

        if(t1.equals(t2))
            return true;

        if(t1.equals("stringCompil"))
                return false;

        return t2.equals("floatCompil") || t2.equals("intCompil");
    }

    private void Compatible_check(int line, String type1 ,String type2){

        if(! Compatible_type(type1, type2)) {

            Error err = new Error_Type(line, type1, type2);
            error_table.add(err);
        }
    }




    @Override
    public Object visitRoot(LangParser.RootContext ctx) {

        visitChildren(ctx);
        return new Program(symbol_table, quadruplet_table, error_table);
    }


    @Override
    public Object visitId(LangParser.IdContext ctx) {

        return ctx.ID_MAJ() == null ? ctx.ID_MIN() : ctx.ID_MAJ();
    }

    @Override
    public Object visitDeclare(LangParser.DeclareContext ctx) {

        current_type = ctx.type().getText();
        Id_Info list_id = (Id_Info) visit(ctx.list_id());

        while (list_id != null){

            String id = list_id.getId();
            String value = list_id.getValue();

            if(symbol_table.symbol_exists(id)){

                Error err = new Error_Duplicate(list_id.getLine(), id);
                error_table.add(err);

            }else{

                Symbol symbol = new Symbol(id, ctx.type().getText(), value);
                symbol_table.add(symbol);
            }

            list_id = list_id.getNext();
        }

        return  visit(ctx.declaration());

    }


    @Override
    public Object visitDeclare_empty(LangParser.Declare_emptyContext ctx) {
        current_type = "";
        return null;
    }

    @Override
    public Object visitList_id(LangParser.List_idContext ctx) {

        TerminalNode node = (TerminalNode) visit(ctx.id());
        String id = ctx.id().getText();
        int line = node.getSymbol().getLine();
        String value = (String) visit(ctx.initialisation());

        return new Id_Info(id, value, line, (Id_Info) visit(ctx.list_id_next()));
    }

    @Override
    public Object visitInit(LangParser.InitContext ctx) {

        visit(ctx.constant());
        return ctx.constant().getText();
    }

    @Override
    public Object visitNot_init(LangParser.Not_initContext ctx) {
        return null;
    }

    @Override
    public Object visitList_id_nxt(LangParser.List_id_nxtContext ctx) {

        return visit(ctx.list_id());
    }

    @Override
    public Object visitList_id_final(LangParser.List_id_finalContext ctx) {
        return null;
    }




    @Override
    public Object visitFormule_operand(LangParser.Formule_operandContext ctx) {

        String id = ctx.operand().getText();

        postfix.push(id);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFormule_parenthesis(LangParser.Formule_parenthesisContext ctx) {


        operators.push(ctx.PO().getText());

        visit(ctx.formule());

        operators.pop();

        return visit(ctx.formule_next());
    }

    @Override
    public Object visitFormule_operator(LangParser.Formule_operatorContext ctx) {


        String op = ctx.operator().getText();

        while (!operators.empty() && !operators.peek().equals("(") && ! Higher_priority(op, operators.peek())) {

            Generate_arithmetic_Quad(operators.pop());
        }

        operators.push(op);

        return super.visitFormule_operator(ctx);
    }

    @Override
    public Object visitFormule_empty(LangParser.Formule_emptyContext ctx) {

        while (!operators.empty() && ! operators.peek().equals("(")){

            Generate_arithmetic_Quad(operators.pop());
        }

        current_type = "";
        return super.visitFormule_empty(ctx);
    }

    private void Generate_arithmetic_Quad(String operator){
        t_counter++;
        String temporary = "T" + t_counter;

        String op2 = postfix.pop();
        String op1 = postfix.pop();

        Quadruplet quad = new Quadruplet(operator, op1, op2, temporary);
        quadruplet_table.add(quad);

        postfix.push(temporary);
    }


    @Override
    public Object visitAffectation(LangParser.AffectationContext ctx) {

        String id = ctx.id().getText();

        if(! symbol_table.symbol_exists(id)){

            TerminalNode node = (TerminalNode) visit(ctx.id());
            Error err = new Error_Undeclared(node.getSymbol().getLine(), id);
            error_table.add(err);

            Symbol symbol = new Symbol(id, null, null, false);
            symbol_table.add(symbol);
        }else {

            current_type = symbol_table.getType(id);
        }

        visit(ctx.formule());

        String temp = postfix.empty() ? "T" + t_counter : postfix.pop();

        Quadruplet quad = new Quadruplet("=", temp, null, id);
        quadruplet_table.add(quad);


        return null;
    }




    @Override
    public Object visitIf_(LangParser.If_Context ctx) {

        Quadruplet quad= (Quadruplet) visit(ctx.condition());

        //convertir le comparateur en branchement
        quad.setQ1(conversionCompBranch(quad.getQ1(), 0));
        quadruplet_table.add(quad);
        visit(ctx.body());
        String q2= (String) visit(ctx.else_());
        quad.setQ2(q2);

        return null;
    }

    private String conversionCompBranch(String comparator, int i){
        if(i ==0 ){ // pour if branchement si condition fausse
            switch (comparator){
                case "==": return "BNE";
                case "!=": return "BE";
                case "<": return "BGE";
                case ">": return "BLE";
                default: return null;
            }
        }
        else{ // pour la boucle Do..While, branchement si condition vraie
            switch (comparator){
                case "==": return "BE";
                case "!=": return "BNE";
                case "<": return "BL";
                case ">": return "BG";
                default: return null;
            }

        }
    }
    @Override
    public Object visitCondition(LangParser.ConditionContext ctx) {
        //bricolage
        current_type= "intCompil";
        visit(ctx.formule(0));
        System.out.println();
        postfix.firstElement();
        String temp1 = postfix.empty() ? "T" + t_counter : postfix.pop();

        visit(ctx.formule(1));
        String temp2 = postfix.empty() ? "T" + t_counter : postfix.pop();

        String comp = ctx.comparator().getText();
        return new Quadruplet(comp, null, temp1, temp2);

    }


    @Override
    public Object visitElse_(LangParser.Else_Context ctx) {
        if(ctx.getText().isEmpty())
          { return String.valueOf(quadruplet_table.getSize());
          }
        else{
             Quadruplet quad= new Quadruplet("BR", null, null, null);
             quadruplet_table.add(quad);
             int posBr= quadruplet_table.getSize();
             super.visitChildren(ctx);
             quad.setQ2(String.valueOf(quadruplet_table.getSize()));
             return String.valueOf(posBr) ;
        }

    }

    @Override
    public Object visitDo_(LangParser.Do_Context ctx) {

          //garder la position de la premiere inst de la boucle
          int posDo = quadruplet_table.getSize();

          visit(ctx.body());

          Quadruplet quad = (Quadruplet) visit(ctx.condition());
          quad.setQ2(String.valueOf(posDo));
          quad.setQ1(conversionCompBranch(quad.getQ1(), 1));

        quadruplet_table.getSize();

      return null;
    }

    @Override
    public Object visitRead_(LangParser.Read_Context ctx) {


        String id = ctx.id().getText();
        quadruplet_table.add(new Quadruplet("READ", id, null, null));

        return null;
    }

    @Override
    public Object visitPrint_(LangParser.Print_Context ctx) {

        String id = ctx.content().getText();
        quadruplet_table.add(new Quadruplet("PRINT", id, null, null));
        return null;
    }

    @Override
    public Object visitIdt(LangParser.IdtContext ctx) {

        String id = ctx.id().getText();

        if(! symbol_table.symbol_exists(id)){

            TerminalNode node = (TerminalNode) visit(ctx.id());
            Error err = new Error_Undeclared(node.getSymbol().getLine(), id);
            error_table.add(err);
        }else{

            int line;

            try {
                line = ctx.id().ID_MAJ().getSymbol().getLine();
            }catch (Exception e){
                
                line = ctx.id().ID_MIN().getSymbol().getLine();
            }

            String type = symbol_table.getType(id);
            Compatible_check(line, current_type, type);
        }

        return null;
    }

    @Override
    public Object visitEntier(LangParser.EntierContext ctx) {

        int line = ctx.ENTIER().getSymbol().getLine();
        Compatible_check(line, current_type, "intCompil");

        return null;
    }


    @Override
    public Object visitReel(LangParser.ReelContext ctx) {

        int line = ctx.REEL().getSymbol().getLine();
        Compatible_check(line, current_type, "floatCompil");
        return super.visitReel(ctx);
    }

    @Override
    public Object visitChaine(LangParser.ChaineContext ctx) {

        int line = ctx.CHAINE().getSymbol().getLine();
        Compatible_check(line, current_type, "stringCompil");
        return super.visitChaine(ctx);
    }
}
