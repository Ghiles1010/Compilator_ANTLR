import semantic.*;
import semantic.Errors.Error;
import semantic.Errors.Error_Duplicate;
import semantic.Errors.Error_Table;
import semantic.Errors.Error_Undeclared;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class Visitors extends LangBaseVisitor {


    private Symbol_Table symbol_table;
    private ArrayList<Error> semantic_errors;
    private Map<String, Integer> priority;
    private ArrayList<Quadruplet> quadruplets;
    private Stack<String> postfix;

    //this is used to check types
    private String current_type;

    private int t_counter;

    Stack<String> operators;

    public Visitors() {

        t_counter = 0;

        this.symbol_table= new Symbol_Table();
        this.semantic_errors = new ArrayList<>();

        this.operators = new Stack<>();
        this.postfix = new Stack<>();

        this.quadruplets = new ArrayList<>();


        this.priority = new HashMap<>() {{
            put("+", 0); put("-", 0); put("*", 1); put("/", 1);
        }};
    }

    private boolean Higher_priority(String op1, String op2){

        return priority.get(op1) > priority.get(op2);
    }

    private boolean Compatible_type(String t1, String t2){

        if(t1.equals("stringCompil") && !t2.equals("stringCompil")){
                return false; }

        if(!t2.equals("floatCompil") && !t2.equals("intCompil")){
            return false; }

        return true;
    }





    @Override
    public Object visitRoot(LangParser.RootContext ctx) {

        visitChildren(ctx);

        Quadruplet_Table quadruplet_table = new Quadruplet_Table(quadruplets);
        Error_Table error_table = new Error_Table(semantic_errors);

        return new Program(quadruplet_table, error_table);
    }



    @Override
    public Object visitDeclare(LangParser.DeclareContext ctx) {

        Id_Info list_id = (Id_Info) visit(ctx.list_id());

        while (list_id != null){

            String id = list_id.getId();

            if(symbol_table.symbol_exists(id)){

                Error err = new Error_Duplicate(list_id.getLine(), id);
                semantic_errors.add(err);

            }else{

                Symbol symbol = new Symbol();
                symbol.setId(id);
                symbol.setType(ctx.type().getText());

                symbol_table.add(symbol);
            }

            list_id = list_id.getNext();
        }

        return  visit(ctx.declaration());

    }


    @Override
    public Object visitList_id_next(LangParser.List_id_nextContext ctx) {

        String id = ctx.ID().getText();
        int line = ctx.ID().getSymbol().getLine();

        return new Id_Info(id, line, (Id_Info) visit(ctx.list_id()));
    }

    @Override
    public Object visitList_id_final(LangParser.List_id_finalContext ctx) {

        String id = ctx.ID().getText();
        int line = ctx.ID().getSymbol().getLine();

        return new Id_Info(id, line, null);
    }



    @Override
    public Object visitFormule_operand(LangParser.Formule_operandContext ctx) {

        postfix.push(ctx.operand().getText());
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

        return super.visitFormule_empty(ctx);
    }

    private void Generate_arithmetic_Quad(String operator){
        t_counter++;
        String temporary = "T" + t_counter;

        String op2 = postfix.pop();
        String op1 = postfix.pop();

        Quadruplet quad = new Quadruplet(op1, op2, operator, temporary);
        quadruplets.add(quad);

        postfix.push(temporary);
    }


    @Override
    public Object visitAffectation(LangParser.AffectationContext ctx) {

        String id = ctx.ID().getText();

        if(! symbol_table.symbol_exists(id)){

            Error err = new Error_Undeclared(ctx.ID().getSymbol().getLine(), id);
            semantic_errors.add(err);
        }else {

            current_type = symbol_table.getType(id);
        }

        visit(ctx.formule());

        String temp = postfix.empty() ? "T" + t_counter : postfix.pop();

        Quadruplet quad = new Quadruplet("=", temp, null, id);
        quadruplets.add(quad);


        return null;
    }

    @Override
    public Object visitIdt(LangParser.IdtContext ctx) {

        String id = ctx.ID().getText();

        if(! symbol_table.symbol_exists(id)){

            Error err = new Error_Undeclared(ctx.ID().getSymbol().getLine(), id);
            semantic_errors.add(err);
        }


        return null;
    }

    @Override
    public Object visitIf_(LangParser.If_Context ctx) {

        Quadruplet quad= (Quadruplet) visit(ctx.condition());
        //convertir le comparateur en branchement
        quad.setQ1(conversionCompBranch(quad.getQ1(), 0));
        quadruplets.add(quad);
        int position= quadruplets.size();
        visit(ctx.body());
        String q2= (String) visit(ctx.else_());
        quad.setQ2(q2);

        return null;
    }

    public String conversionCompBranch(String comparator, int i){
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

        visit(ctx.formule(0));
        System.out.println();postfix.firstElement();
        String temp1 = postfix.empty() ? "T" + t_counter : postfix.pop();

        visit(ctx.formule(1));
        String temp2 = postfix.empty() ? "T" + t_counter : postfix.pop();

        String comp = ctx.comparator().getText();
        return new Quadruplet(comp, null, temp1, temp2);

    }


    @Override
    public Object visitElse_(LangParser.Else_Context ctx) {
        if(ctx.getText()== "")
          { return String.valueOf(quadruplets.size());
          }
        else{
             Quadruplet quad= new Quadruplet("BR",null,null,null);
             quadruplets.add(quad);
             int posBr= quadruplets.size();
             super.visitChildren(ctx);
             quad.setQ2(String.valueOf(quadruplets.size()));
             return String.valueOf(posBr) ;
        }

    }

    @Override
    public Object visitDo_(LangParser.Do_Context ctx) {
      /*if(ctx.body().getText() != "") {*/
          //garder la position de la premiere inst de la boucle
          int posDo = quadruplets.size();

          visit(ctx.body());

          Quadruplet quad = (Quadruplet) visit(ctx.condition());
          quad.setQ2(String.valueOf(posDo));
          quad.setQ1(conversionCompBranch(quad.getQ1(), 1));

        quadruplets.add(quad);

      return null;
    }




}
