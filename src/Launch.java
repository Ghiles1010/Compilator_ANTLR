import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import semantic.Program;
import java.io.IOException;

public class Launch {
    public static void main(String[] args) throws IOException {

        String source = "tests/test.txt";
        CharStream cs = CharStreams.fromFileName(source);
        LangLexer lexer = new LangLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        LangParser parser = new LangParser(token);
        ParseTree tree = parser.root();


        if (parser.getNumberOfSyntaxErrors() == 0){

            Visitors visitors = new Visitors();

            Program program = (Program) visitors.visit(tree);

            program.getError_table().print();
            program.getSymbol_table().print();
            program.getQuad_table().print();
            program.getCode().print();

        }

    }
}
