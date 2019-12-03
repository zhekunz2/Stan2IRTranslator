// Generated from Data.g4 by ANTLR 4.7.1
package translator;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DataParser}.
 */
public interface DataListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DataParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive(DataParser.PrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive(DataParser.PrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataParser#dim}.
	 * @param ctx the parse tree
	 */
	void enterDim(DataParser.DimContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataParser#dim}.
	 * @param ctx the parse tree
	 */
	void exitDim(DataParser.DimContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataParser#structure}.
	 * @param ctx the parse tree
	 */
	void enterStructure(DataParser.StructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataParser#structure}.
	 * @param ctx the parse tree
	 */
	void exitStructure(DataParser.StructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(DataParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(DataParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataParser#dt}.
	 * @param ctx the parse tree
	 */
	void enterDt(DataParser.DtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataParser#dt}.
	 * @param ctx the parse tree
	 */
	void exitDt(DataParser.DtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(DataParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(DataParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataParser#datafile}.
	 * @param ctx the parse tree
	 */
	void enterDatafile(DataParser.DatafileContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataParser#datafile}.
	 * @param ctx the parse tree
	 */
	void exitDatafile(DataParser.DatafileContext ctx);
}