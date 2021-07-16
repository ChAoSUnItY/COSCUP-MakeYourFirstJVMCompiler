package io.github.chaosunity.antlr;// Generated from COSCUP.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link COSCUPParser}.
 */
public interface COSCUPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link COSCUPParser#context}.
	 * @param ctx the parse tree
	 */
	void enterContext(COSCUPParser.ContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link COSCUPParser#context}.
	 * @param ctx the parse tree
	 */
	void exitContext(COSCUPParser.ContextContext ctx);
	/**
	 * Enter a parse tree produced by {@link COSCUPParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(COSCUPParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link COSCUPParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(COSCUPParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link COSCUPParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(COSCUPParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link COSCUPParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(COSCUPParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link COSCUPParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(COSCUPParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link COSCUPParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(COSCUPParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link COSCUPParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(COSCUPParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link COSCUPParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(COSCUPParser.NumberContext ctx);
}