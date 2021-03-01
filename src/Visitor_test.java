public class Visitor_test extends LangBaseVisitor {

    @Override
    public Object visitRoot(LangParser.RootContext ctx) {



        return super.visitRoot(ctx);
    }


    @Override
    public Object visitDeclaration(LangParser.DeclarationContext ctx) {

        if(ctx.getChild(1)!=null)
            System.out.println(ctx.getChild(1).getText());
        return super.visitDeclaration(ctx);
    }
}
