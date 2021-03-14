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
	 * Visit a parse tree produced by the {@code declare}
	 * labeled alternative in {@link LangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(LangParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declare_empty}
	 * labeled alternative in {@link LangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_empty(LangParser.Declare_emptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LangParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code list_id_next}
	 * labeled alternative in {@link LangParser#list_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_id_next(LangParser.List_id_nextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code list_id_final}
	 * labeled alternative in {@link LangParser#list_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_id_final(LangParser.List_id_finalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code entier}
	 * labeled alternative in {@link LangParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntier(LangParser.EntierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code reel}
	 * labeled alternative in {@link LangParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReel(LangParser.ReelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code chaine}
	 * labeled alternative in {@link LangParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChaine(LangParser.ChaineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idt}
	 * labeled alternative in {@link LangParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdt(LangParser.IdtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(LangParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formule_operand}
	 * labeled alternative in {@link LangParser#formule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormule_operand(LangParser.Formule_operandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formule_parenthesis}
	 * labeled alternative in {@link LangParser#formule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormule_parenthesis(LangParser.Formule_parenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formule_operator}
	 * labeled alternative in {@link LangParser#formule_next}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormule_operator(LangParser.Formule_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formule_empty}
	 * labeled alternative in {@link LangParser#formule_next}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormule_empty(LangParser.Formule_emptyContext ctx);
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