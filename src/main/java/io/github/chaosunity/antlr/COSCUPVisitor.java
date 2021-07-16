package io.github.chaosunity.antlr;// Generated from COSCUP.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link COSCUPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface COSCUPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link COSCUPParser#context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContext(COSCUPParser.ContextContext ctx);
	/**
	 * Visit a parse tree produced by {@link COSCUPParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(COSCUPParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link COSCUPParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(COSCUPParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link COSCUPParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(COSCUPParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link COSCUPParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(COSCUPParser.NumberContext ctx);
}