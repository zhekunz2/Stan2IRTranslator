// Generated from Stan.g4 by ANTLR 4.7.1
package translator;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StanParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StanVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StanParser#arrays}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrays(StanParser.ArraysContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(StanParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#inbuilt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInbuilt(StanParser.InbuiltContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#dim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDim(StanParser.DimContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(StanParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#limits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimits(StanParser.LimitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(StanParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(StanParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(StanParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#function_call_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_stmt(StanParser.Function_call_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(StanParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#array_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_access(StanParser.Array_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(StanParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(StanParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#range_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_exp(StanParser.Range_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#for_loop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop_stmt(StanParser.For_loop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#target_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_stmt(StanParser.Target_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divop}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivop(StanParser.DivopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(StanParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addop}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddop(StanParser.AddopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lt}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt(StanParser.LtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(StanParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(StanParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulop}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulop(StanParser.MulopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(StanParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id_access}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_access(StanParser.Id_accessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(StanParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(StanParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ge}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGe(StanParser.GeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array_decl}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_decl(StanParser.Array_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(StanParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exponop}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponop(StanParser.ExponopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(StanParser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusop}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusop(StanParser.MinusopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eq}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(StanParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gt}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGt(StanParser.GtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code brackets}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(StanParser.BracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condition}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(StanParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ne}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNe(StanParser.NeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code le}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLe(StanParser.LeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code transpose}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranspose(StanParser.TransposeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternary_if}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernary_if(StanParser.Ternary_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#distribution_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistribution_exp(StanParser.Distribution_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#sample}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample(StanParser.SampleContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#return_or_param_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_or_param_type(StanParser.Return_or_param_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(StanParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#function_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_decl(StanParser.Function_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(StanParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(StanParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#datablk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatablk(StanParser.DatablkContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#paramblk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamblk(StanParser.ParamblkContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#modelblk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelblk(StanParser.ModelblkContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#transformed_param_blk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformed_param_blk(StanParser.Transformed_param_blkContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#transformed_data_blk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformed_data_blk(StanParser.Transformed_data_blkContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#generated_quantities_blk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerated_quantities_blk(StanParser.Generated_quantities_blkContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#functions_blk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions_blk(StanParser.Functions_blkContext ctx);
	/**
	 * Visit a parse tree produced by {@link StanParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(StanParser.ProgramContext ctx);
}