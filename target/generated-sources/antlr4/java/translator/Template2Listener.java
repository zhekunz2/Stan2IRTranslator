// Generated from Template2.g4 by ANTLR 4.7.1
package translator;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Template2Parser}.
 */
public interface Template2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Template2Parser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive(Template2Parser.PrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive(Template2Parser.PrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(Template2Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(Template2Parser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#dtype}.
	 * @param ctx the parse tree
	 */
	void enterDtype(Template2Parser.DtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#dtype}.
	 * @param ctx the parse tree
	 */
	void exitDtype(Template2Parser.DtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(Template2Parser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(Template2Parser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(Template2Parser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(Template2Parser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(Template2Parser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(Template2Parser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#vectorDIMS}.
	 * @param ctx the parse tree
	 */
	void enterVectorDIMS(Template2Parser.VectorDIMSContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#vectorDIMS}.
	 * @param ctx the parse tree
	 */
	void exitVectorDIMS(Template2Parser.VectorDIMSContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(Template2Parser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(Template2Parser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#limits}.
	 * @param ctx the parse tree
	 */
	void enterLimits(Template2Parser.LimitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#limits}.
	 * @param ctx the parse tree
	 */
	void exitLimits(Template2Parser.LimitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(Template2Parser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(Template2Parser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#prior}.
	 * @param ctx the parse tree
	 */
	void enterPrior(Template2Parser.PriorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#prior}.
	 * @param ctx the parse tree
	 */
	void exitPrior(Template2Parser.PriorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(Template2Parser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(Template2Parser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(Template2Parser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(Template2Parser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#distexpr}.
	 * @param ctx the parse tree
	 */
	void enterDistexpr(Template2Parser.DistexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#distexpr}.
	 * @param ctx the parse tree
	 */
	void exitDistexpr(Template2Parser.DistexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#loopcomp}.
	 * @param ctx the parse tree
	 */
	void enterLoopcomp(Template2Parser.LoopcompContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#loopcomp}.
	 * @param ctx the parse tree
	 */
	void exitLoopcomp(Template2Parser.LoopcompContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(Template2Parser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(Template2Parser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(Template2Parser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(Template2Parser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#else_blk}.
	 * @param ctx the parse tree
	 */
	void enterElse_blk(Template2Parser.Else_blkContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#else_blk}.
	 * @param ctx the parse tree
	 */
	void exitElse_blk(Template2Parser.Else_blkContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(Template2Parser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(Template2Parser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#fparam}.
	 * @param ctx the parse tree
	 */
	void enterFparam(Template2Parser.FparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#fparam}.
	 * @param ctx the parse tree
	 */
	void exitFparam(Template2Parser.FparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#fparams}.
	 * @param ctx the parse tree
	 */
	void enterFparams(Template2Parser.FparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#fparams}.
	 * @param ctx the parse tree
	 */
	void exitFparams(Template2Parser.FparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#return_or_param_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_or_param_type(Template2Parser.Return_or_param_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#return_or_param_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_or_param_type(Template2Parser.Return_or_param_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#function_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunction_decl(Template2Parser.Function_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#function_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunction_decl(Template2Parser.Function_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Template2Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Template2Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#transformedparam}.
	 * @param ctx the parse tree
	 */
	void enterTransformedparam(Template2Parser.TransformedparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#transformedparam}.
	 * @param ctx the parse tree
	 */
	void exitTransformedparam(Template2Parser.TransformedparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#transformeddata}.
	 * @param ctx the parse tree
	 */
	void enterTransformeddata(Template2Parser.TransformeddataContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#transformeddata}.
	 * @param ctx the parse tree
	 */
	void exitTransformeddata(Template2Parser.TransformeddataContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#generatedquantities}.
	 * @param ctx the parse tree
	 */
	void enterGeneratedquantities(Template2Parser.GeneratedquantitiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#generatedquantities}.
	 * @param ctx the parse tree
	 */
	void exitGeneratedquantities(Template2Parser.GeneratedquantitiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(Template2Parser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(Template2Parser.FunctionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code val}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVal(Template2Parser.ValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code val}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVal(Template2Parser.ValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divop}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivop(Template2Parser.DivopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divop}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivop(Template2Parser.DivopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(Template2Parser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(Template2Parser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exponop}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExponop(Template2Parser.ExponopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exponop}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExponop(Template2Parser.ExponopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array_access}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArray_access(Template2Parser.Array_accessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array_access}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArray_access(Template2Parser.Array_accessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addop}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddop(Template2Parser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addop}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddop(Template2Parser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusop}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinusop(Template2Parser.MinusopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusop}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinusop(Template2Parser.MinusopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lt}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLt(Template2Parser.LtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lt}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLt(Template2Parser.LtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary(Template2Parser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary(Template2Parser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eq}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEq(Template2Parser.EqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eq}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEq(Template2Parser.EqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gt}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGt(Template2Parser.GtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gt}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGt(Template2Parser.GtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code brackets}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBrackets(Template2Parser.BracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code brackets}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBrackets(Template2Parser.BracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ref}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRef(Template2Parser.RefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ref}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRef(Template2Parser.RefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code geq}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGeq(Template2Parser.GeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code geq}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGeq(Template2Parser.GeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulop}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulop(Template2Parser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulop}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulop(Template2Parser.MulopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(Template2Parser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(Template2Parser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunction(Template2Parser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunction(Template2Parser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vecmulop}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVecmulop(Template2Parser.VecmulopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vecmulop}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVecmulop(Template2Parser.VecmulopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ne}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNe(Template2Parser.NeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ne}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNe(Template2Parser.NeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leq}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLeq(Template2Parser.LeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leq}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLeq(Template2Parser.LeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code transpose}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTranspose(Template2Parser.TransposeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code transpose}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTranspose(Template2Parser.TransposeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vecdivop}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVecdivop(Template2Parser.VecdivopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vecdivop}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVecdivop(Template2Parser.VecdivopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternary}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTernary(Template2Parser.TernaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternary}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTernary(Template2Parser.TernaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subset}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubset(Template2Parser.SubsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subset}
	 * labeled alternative in {@link Template2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubset(Template2Parser.SubsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(Template2Parser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(Template2Parser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#observe}.
	 * @param ctx the parse tree
	 */
	void enterObserve(Template2Parser.ObserveContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#observe}.
	 * @param ctx the parse tree
	 */
	void exitObserve(Template2Parser.ObserveContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Template2Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Template2Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(Template2Parser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(Template2Parser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Template2Parser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(Template2Parser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Template2Parser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(Template2Parser.TemplateContext ctx);
}