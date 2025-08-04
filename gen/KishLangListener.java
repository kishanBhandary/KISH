// Generated from grammar/KishLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KishLangParser}.
 */
public interface KishLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KishLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(KishLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link KishLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(KishLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link KishLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(KishLangParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link KishLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(KishLangParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link KishLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(KishLangParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link KishLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(KishLangParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link KishLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(KishLangParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link KishLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(KishLangParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link KishLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(KishLangParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link KishLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(KishLangParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link KishLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(KishLangParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link KishLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(KishLangParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link KishLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(KishLangParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link KishLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(KishLangParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link KishLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(KishLangParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link KishLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(KishLangParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link KishLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(KishLangParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link KishLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(KishLangParser.IntContext ctx);
}