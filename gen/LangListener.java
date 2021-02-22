// Generated from C:/Personnal/M1/compil/tp/Projet Compil/Compilateur/src\Lang.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangParser}.
 */
public interface LangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(LangParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(LangParser.RootContext ctx);
}