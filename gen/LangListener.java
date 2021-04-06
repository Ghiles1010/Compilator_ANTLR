// Generated from /home/souad/Documents/Master/cloneCompil/Compilator_ANTLR/src/Lang.g4 by ANTLR 4.9.1
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
	 * Enter a parse tree produced by the {@code declare}
	 * labeled alternative in {@link LangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(LangParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declare}
	 * labeled alternative in {@link LangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(LangParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declare_empty}
	 * labeled alternative in {@link LangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_empty(LangParser.Declare_emptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declare_empty}
	 * labeled alternative in {@link LangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_empty(LangParser.Declare_emptyContext ctx);
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
	 * Enter a parse tree produced by the {@code list_id_next}
	 * labeled alternative in {@link LangParser#list_id}.
	 * @param ctx the parse tree
	 */
	void enterList_id_next(LangParser.List_id_nextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code list_id_next}
	 * labeled alternative in {@link LangParser#list_id}.
	 * @param ctx the parse tree
	 */
	void exitList_id_next(LangParser.List_id_nextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code list_id_final}
	 * labeled alternative in {@link LangParser#list_id}.
	 * @param ctx the parse tree
	 */
	void enterList_id_final(LangParser.List_id_finalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code list_id_final}
	 * labeled alternative in {@link LangParser#list_id}.
	 * @param ctx the parse tree
	 */
	void exitList_id_final(LangParser.List_id_finalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code entier}
	 * labeled alternative in {@link LangParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterEntier(LangParser.EntierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code entier}
	 * labeled alternative in {@link LangParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitEntier(LangParser.EntierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code reel}
	 * labeled alternative in {@link LangParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterReel(LangParser.ReelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code reel}
	 * labeled alternative in {@link LangParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitReel(LangParser.ReelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chaine}
	 * labeled alternative in {@link LangParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterChaine(LangParser.ChaineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chaine}
	 * labeled alternative in {@link LangParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitChaine(LangParser.ChaineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idt}
	 * labeled alternative in {@link LangParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterIdt(LangParser.IdtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idt}
	 * labeled alternative in {@link LangParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitIdt(LangParser.IdtContext ctx);
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
	 * Enter a parse tree produced by the {@code formule_operand}
	 * labeled alternative in {@link LangParser#formule}.
	 * @param ctx the parse tree
	 */
	void enterFormule_operand(LangParser.Formule_operandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formule_operand}
	 * labeled alternative in {@link LangParser#formule}.
	 * @param ctx the parse tree
	 */
	void exitFormule_operand(LangParser.Formule_operandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formule_parenthesis}
	 * labeled alternative in {@link LangParser#formule}.
	 * @param ctx the parse tree
	 */
	void enterFormule_parenthesis(LangParser.Formule_parenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formule_parenthesis}
	 * labeled alternative in {@link LangParser#formule}.
	 * @param ctx the parse tree
	 */
	void exitFormule_parenthesis(LangParser.Formule_parenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formule_operator}
	 * labeled alternative in {@link LangParser#formule_next}.
	 * @param ctx the parse tree
	 */
	void enterFormule_operator(LangParser.Formule_operatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formule_operator}
	 * labeled alternative in {@link LangParser#formule_next}.
	 * @param ctx the parse tree
	 */
	void exitFormule_operator(LangParser.Formule_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formule_empty}
	 * labeled alternative in {@link LangParser#formule_next}.
	 * @param ctx the parse tree
	 */
	void enterFormule_empty(LangParser.Formule_emptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formule_empty}
	 * labeled alternative in {@link LangParser#formule_next}.
	 * @param ctx the parse tree
	 */
	void exitFormule_empty(LangParser.Formule_emptyContext ctx);
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
	 * Enter a parse tree produced by {@link LangParser#read_}.
	 * @param ctx the parse tree
	 */
	void enterRead_(LangParser.Read_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#read_}.
	 * @param ctx the parse tree
	 */
	void exitRead_(LangParser.Read_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#print_}.
	 * @param ctx the parse tree
	 */
	void enterPrint_(LangParser.Print_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#print_}.
	 * @param ctx the parse tree
	 */
	void exitPrint_(LangParser.Print_Context ctx);
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