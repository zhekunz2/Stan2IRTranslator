// Generated from Stan.g4 by ANTLR 4.7.1
package translator;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StanParser}.
 */
public interface StanListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StanParser#arrays}.
	 * @param ctx the parse tree
	 */
	void enterArrays(StanParser.ArraysContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#arrays}.
	 * @param ctx the parse tree
	 */
	void exitArrays(StanParser.ArraysContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(StanParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(StanParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#inbuilt}.
	 * @param ctx the parse tree
	 */
	void enterInbuilt(StanParser.InbuiltContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#inbuilt}.
	 * @param ctx the parse tree
	 */
	void exitInbuilt(StanParser.InbuiltContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#dim}.
	 * @param ctx the parse tree
	 */
	void enterDim(StanParser.DimContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#dim}.
	 * @param ctx the parse tree
	 */
	void exitDim(StanParser.DimContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(StanParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(StanParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#limits}.
	 * @param ctx the parse tree
	 */
	void enterLimits(StanParser.LimitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#limits}.
	 * @param ctx the parse tree
	 */
	void exitLimits(StanParser.LimitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(StanParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(StanParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(StanParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(StanParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(StanParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(StanParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#function_call_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_stmt(StanParser.Function_call_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#function_call_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_stmt(StanParser.Function_call_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(StanParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(StanParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#array_access}.
	 * @param ctx the parse tree
	 */
	void enterArray_access(StanParser.Array_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#array_access}.
	 * @param ctx the parse tree
	 */
	void exitArray_access(StanParser.Array_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(StanParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(StanParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(StanParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(StanParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#range_exp}.
	 * @param ctx the parse tree
	 */
	void enterRange_exp(StanParser.Range_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#range_exp}.
	 * @param ctx the parse tree
	 */
	void exitRange_exp(StanParser.Range_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#for_loop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop_stmt(StanParser.For_loop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#for_loop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop_stmt(StanParser.For_loop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#target_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTarget_stmt(StanParser.Target_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#target_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTarget_stmt(StanParser.Target_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divop}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivop(StanParser.DivopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divop}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivop(StanParser.DivopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterString(StanParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitString(StanParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addop}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddop(StanParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addop}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddop(StanParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lt}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLt(StanParser.LtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lt}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLt(StanParser.LtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary(StanParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary(StanParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integer}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInteger(StanParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInteger(StanParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulop}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulop(StanParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulop}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulop(StanParser.MulopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArray(StanParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArray(StanParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id_access}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterId_access(StanParser.Id_accessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id_access}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitId_access(StanParser.Id_accessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd(StanParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd(StanParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunction(StanParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunction(StanParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ge}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGe(StanParser.GeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ge}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGe(StanParser.GeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array_decl}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArray_decl(StanParser.Array_declContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array_decl}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArray_decl(StanParser.Array_declContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOr(StanParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOr(StanParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exponop}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExponop(StanParser.ExponopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exponop}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExponop(StanParser.ExponopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDouble(StanParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDouble(StanParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusop}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinusop(StanParser.MinusopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusop}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinusop(StanParser.MinusopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eq}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEq(StanParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eq}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEq(StanParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gt}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGt(StanParser.GtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gt}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGt(StanParser.GtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code brackets}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBrackets(StanParser.BracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code brackets}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBrackets(StanParser.BracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condition}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCondition(StanParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condition}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCondition(StanParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ne}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNe(StanParser.NeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ne}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNe(StanParser.NeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code le}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLe(StanParser.LeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code le}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLe(StanParser.LeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code transpose}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTranspose(StanParser.TransposeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code transpose}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTranspose(StanParser.TransposeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternary_if}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernary_if(StanParser.Ternary_ifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternary_if}
	 * labeled alternative in {@link StanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernary_if(StanParser.Ternary_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#distribution_exp}.
	 * @param ctx the parse tree
	 */
	void enterDistribution_exp(StanParser.Distribution_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#distribution_exp}.
	 * @param ctx the parse tree
	 */
	void exitDistribution_exp(StanParser.Distribution_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#sample}.
	 * @param ctx the parse tree
	 */
	void enterSample(StanParser.SampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#sample}.
	 * @param ctx the parse tree
	 */
	void exitSample(StanParser.SampleContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#return_or_param_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_or_param_type(StanParser.Return_or_param_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#return_or_param_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_or_param_type(StanParser.Return_or_param_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(StanParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(StanParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#function_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunction_decl(StanParser.Function_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#function_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunction_decl(StanParser.Function_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(StanParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(StanParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(StanParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(StanParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#datablk}.
	 * @param ctx the parse tree
	 */
	void enterDatablk(StanParser.DatablkContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#datablk}.
	 * @param ctx the parse tree
	 */
	void exitDatablk(StanParser.DatablkContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#paramblk}.
	 * @param ctx the parse tree
	 */
	void enterParamblk(StanParser.ParamblkContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#paramblk}.
	 * @param ctx the parse tree
	 */
	void exitParamblk(StanParser.ParamblkContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#modelblk}.
	 * @param ctx the parse tree
	 */
	void enterModelblk(StanParser.ModelblkContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#modelblk}.
	 * @param ctx the parse tree
	 */
	void exitModelblk(StanParser.ModelblkContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#transformed_param_blk}.
	 * @param ctx the parse tree
	 */
	void enterTransformed_param_blk(StanParser.Transformed_param_blkContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#transformed_param_blk}.
	 * @param ctx the parse tree
	 */
	void exitTransformed_param_blk(StanParser.Transformed_param_blkContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#transformed_data_blk}.
	 * @param ctx the parse tree
	 */
	void enterTransformed_data_blk(StanParser.Transformed_data_blkContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#transformed_data_blk}.
	 * @param ctx the parse tree
	 */
	void exitTransformed_data_blk(StanParser.Transformed_data_blkContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#generated_quantities_blk}.
	 * @param ctx the parse tree
	 */
	void enterGenerated_quantities_blk(StanParser.Generated_quantities_blkContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#generated_quantities_blk}.
	 * @param ctx the parse tree
	 */
	void exitGenerated_quantities_blk(StanParser.Generated_quantities_blkContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#functions_blk}.
	 * @param ctx the parse tree
	 */
	void enterFunctions_blk(StanParser.Functions_blkContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#functions_blk}.
	 * @param ctx the parse tree
	 */
	void exitFunctions_blk(StanParser.Functions_blkContext ctx);
	/**
	 * Enter a parse tree produced by {@link StanParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(StanParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link StanParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(StanParser.ProgramContext ctx);
}