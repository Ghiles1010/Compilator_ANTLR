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
	/**
	 * Enter a parse tree produced by {@link LangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(LangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(LangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#list_id}.
	 * @param ctx the parse tree
	 */
	void enterList_id(LangParser.List_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#list_id}.
	 * @param ctx the parse tree
	 */
	void exitList_id(LangParser.List_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(LangParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(LangParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(LangParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(LangParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#formule}.
	 * @param ctx the parse tree
	 */
	void enterFormule(LangParser.FormuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#formule}.
	 * @param ctx the parse tree
	 */
	void exitFormule(LangParser.FormuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#formule_pf}.
	 * @param ctx the parse tree
	 */
	void enterFormule_pf(LangParser.Formule_pfContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#formule_pf}.
	 * @param ctx the parse tree
	 */
	void exitFormule_pf(LangParser.Formule_pfContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#affectation}.
	 * @param ctx the parse tree
	 */
	void enterAffectation(LangParser.AffectationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#affectation}.
	 * @param ctx the parse tree
	 */
	void exitAffectation(LangParser.AffectationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(LangParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(LangParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(LangParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(LangParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#if_}.
	 * @param ctx the parse tree
	 */
	void enterIf_(LangParser.If_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#if_}.
	 * @param ctx the parse tree
	 */
	void exitIf_(LangParser.If_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#else_}.
	 * @param ctx the parse tree
	 */
	void enterElse_(LangParser.Else_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#else_}.
	 * @param ctx the parse tree
	 */
	void exitElse_(LangParser.Else_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#do_}.
	 * @param ctx the parse tree
	 */
	void enterDo_(LangParser.Do_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#do_}.
	 * @param ctx the parse tree
	 */
	void exitDo_(LangParser.Do_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(LangParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(LangParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(LangParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(LangParser.BodyContext ctx);
}