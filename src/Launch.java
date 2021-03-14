import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Launch {


    public static void main(String[] args) throws IOException {

        String source = "tests/test.txt";
        CharStream cs = CharStreams.fromFileName(source);
        LangLexer lexer = new LangLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        LangParser parser = new LangParser(token);
        ParseTree tree = parser.root();

        Visitors visitors = new Visitors();
        visitors.visit(tree);


    }


}
