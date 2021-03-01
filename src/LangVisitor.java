// Generated from C:/Personnal/M1/compil/tp/Projet Compil/Compilateur/src\Lang.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LangParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(LangParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(LangParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LangParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#list_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_id(LangParser.List_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(LangParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(LangParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#formule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormule(LangParser.FormuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#formule_pf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormule_pf(LangParser.Formule_pfContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#affectation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectation(LangParser.AffectationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(LangParser.ComparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(LangParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#if_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_(LangParser.If_Context ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#else_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_(LangParser.Else_Context ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#do_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_(LangParser.Do_Context ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(LangParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(LangParser.BodyContext ctx);
}