// Generated from src/antlr/C/Function.g4 by ANTLR 4.5

	package antlr.C;


  import java.util.Stack;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunctionParser}.
 */
public interface FunctionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunctionParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(FunctionParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(FunctionParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FunctionParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FunctionParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#pre_opener}.
	 * @param ctx the parse tree
	 */
	void enterPre_opener(FunctionParser.Pre_openerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#pre_opener}.
	 * @param ctx the parse tree
	 */
	void exitPre_opener(FunctionParser.Pre_openerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#pre_else}.
	 * @param ctx the parse tree
	 */
	void enterPre_else(FunctionParser.Pre_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#pre_else}.
	 * @param ctx the parse tree
	 */
	void exitPre_else(FunctionParser.Pre_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#pre_closer}.
	 * @param ctx the parse tree
	 */
	void enterPre_closer(FunctionParser.Pre_closerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#pre_closer}.
	 * @param ctx the parse tree
	 */
	void exitPre_closer(FunctionParser.Pre_closerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#opening_curly}.
	 * @param ctx the parse tree
	 */
	void enterOpening_curly(FunctionParser.Opening_curlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#opening_curly}.
	 * @param ctx the parse tree
	 */
	void exitOpening_curly(FunctionParser.Opening_curlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#closing_curly}.
	 * @param ctx the parse tree
	 */
	void enterClosing_curly(FunctionParser.Closing_curlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#closing_curly}.
	 * @param ctx the parse tree
	 */
	void exitClosing_curly(FunctionParser.Closing_curlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#block_starter}.
	 * @param ctx the parse tree
	 */
	void enterBlock_starter(FunctionParser.Block_starterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#block_starter}.
	 * @param ctx the parse tree
	 */
	void exitBlock_starter(FunctionParser.Block_starterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Try_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void enterTry_statement(FunctionParser.Try_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Try_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void exitTry_statement(FunctionParser.Try_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Catch_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void enterCatch_statement(FunctionParser.Catch_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Catch_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void exitCatch_statement(FunctionParser.Catch_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(FunctionParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(FunctionParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Else_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(FunctionParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Else_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(FunctionParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Switch_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(FunctionParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Switch_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(FunctionParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code For_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(FunctionParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code For_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(FunctionParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Do_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void enterDo_statement(FunctionParser.Do_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Do_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void exitDo_statement(FunctionParser.Do_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(FunctionParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(FunctionParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#do_statement1}.
	 * @param ctx the parse tree
	 */
	void enterDo_statement1(FunctionParser.Do_statement1Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#do_statement1}.
	 * @param ctx the parse tree
	 */
	void exitDo_statement1(FunctionParser.Do_statement1Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#for_init_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_init_statement(FunctionParser.For_init_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#for_init_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_init_statement(FunctionParser.For_init_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link FunctionParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(FunctionParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link FunctionParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(FunctionParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link FunctionParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(FunctionParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link FunctionParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(FunctionParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gotoStatement}
	 * labeled alternative in {@link FunctionParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(FunctionParser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gotoStatement}
	 * labeled alternative in {@link FunctionParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(FunctionParser.GotoStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link FunctionParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(FunctionParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link FunctionParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(FunctionParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(FunctionParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(FunctionParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#expr_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpr_statement(FunctionParser.Expr_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#expr_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpr_statement(FunctionParser.Expr_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(FunctionParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(FunctionParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(FunctionParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(FunctionParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operator(FunctionParser.Relational_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operator(FunctionParser.Relational_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(FunctionParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(FunctionParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#function_decl_specifiers}.
	 * @param ctx the parse tree
	 */
	void enterFunction_decl_specifiers(FunctionParser.Function_decl_specifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#function_decl_specifiers}.
	 * @param ctx the parse tree
	 */
	void exitFunction_decl_specifiers(FunctionParser.Function_decl_specifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#ptr_operator}.
	 * @param ctx the parse tree
	 */
	void enterPtr_operator(FunctionParser.Ptr_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#ptr_operator}.
	 * @param ctx the parse tree
	 */
	void exitPtr_operator(FunctionParser.Ptr_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#access_specifier}.
	 * @param ctx the parse tree
	 */
	void enterAccess_specifier(FunctionParser.Access_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#access_specifier}.
	 * @param ctx the parse tree
	 */
	void exitAccess_specifier(FunctionParser.Access_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(FunctionParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(FunctionParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(FunctionParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(FunctionParser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#equality_operator}.
	 * @param ctx the parse tree
	 */
	void enterEquality_operator(FunctionParser.Equality_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#equality_operator}.
	 * @param ctx the parse tree
	 */
	void exitEquality_operator(FunctionParser.Equality_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#template_decl_start}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_decl_start(FunctionParser.Template_decl_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#template_decl_start}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_decl_start(FunctionParser.Template_decl_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#template_param_list}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_param_list(FunctionParser.Template_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#template_param_list}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_param_list(FunctionParser.Template_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#no_brackets}.
	 * @param ctx the parse tree
	 */
	void enterNo_brackets(FunctionParser.No_bracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#no_brackets}.
	 * @param ctx the parse tree
	 */
	void exitNo_brackets(FunctionParser.No_bracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#no_brackets_curlies_or_squares}.
	 * @param ctx the parse tree
	 */
	void enterNo_brackets_curlies_or_squares(FunctionParser.No_brackets_curlies_or_squaresContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#no_brackets_curlies_or_squares}.
	 * @param ctx the parse tree
	 */
	void exitNo_brackets_curlies_or_squares(FunctionParser.No_brackets_curlies_or_squaresContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#no_brackets_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterNo_brackets_or_semicolon(FunctionParser.No_brackets_or_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#no_brackets_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitNo_brackets_or_semicolon(FunctionParser.No_brackets_or_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#no_angle_brackets_or_brackets}.
	 * @param ctx the parse tree
	 */
	void enterNo_angle_brackets_or_brackets(FunctionParser.No_angle_brackets_or_bracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#no_angle_brackets_or_brackets}.
	 * @param ctx the parse tree
	 */
	void exitNo_angle_brackets_or_brackets(FunctionParser.No_angle_brackets_or_bracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#no_curlies}.
	 * @param ctx the parse tree
	 */
	void enterNo_curlies(FunctionParser.No_curliesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#no_curlies}.
	 * @param ctx the parse tree
	 */
	void exitNo_curlies(FunctionParser.No_curliesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#no_squares}.
	 * @param ctx the parse tree
	 */
	void enterNo_squares(FunctionParser.No_squaresContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#no_squares}.
	 * @param ctx the parse tree
	 */
	void exitNo_squares(FunctionParser.No_squaresContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#no_squares_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterNo_squares_or_semicolon(FunctionParser.No_squares_or_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#no_squares_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitNo_squares_or_semicolon(FunctionParser.No_squares_or_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#no_comma_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterNo_comma_or_semicolon(FunctionParser.No_comma_or_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#no_comma_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitNo_comma_or_semicolon(FunctionParser.No_comma_or_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#assign_water}.
	 * @param ctx the parse tree
	 */
	void enterAssign_water(FunctionParser.Assign_waterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#assign_water}.
	 * @param ctx the parse tree
	 */
	void exitAssign_water(FunctionParser.Assign_waterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#assign_water_l2}.
	 * @param ctx the parse tree
	 */
	void enterAssign_water_l2(FunctionParser.Assign_water_l2Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#assign_water_l2}.
	 * @param ctx the parse tree
	 */
	void exitAssign_water_l2(FunctionParser.Assign_water_l2Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#water}.
	 * @param ctx the parse tree
	 */
	void enterWater(FunctionParser.WaterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#water}.
	 * @param ctx the parse tree
	 */
	void exitWater(FunctionParser.WaterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(FunctionParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(FunctionParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr(FunctionParser.Assign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr(FunctionParser.Assign_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normOr}
	 * labeled alternative in {@link FunctionParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterNormOr(FunctionParser.NormOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normOr}
	 * labeled alternative in {@link FunctionParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitNormOr(FunctionParser.NormOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cndExpr}
	 * labeled alternative in {@link FunctionParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterCndExpr(FunctionParser.CndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cndExpr}
	 * labeled alternative in {@link FunctionParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitCndExpr(FunctionParser.CndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void enterOr_expression(FunctionParser.Or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void exitOr_expression(FunctionParser.Or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(FunctionParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(FunctionParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterInclusive_or_expression(FunctionParser.Inclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitInclusive_or_expression(FunctionParser.Inclusive_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterExclusive_or_expression(FunctionParser.Exclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitExclusive_or_expression(FunctionParser.Exclusive_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#bit_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterBit_and_expression(FunctionParser.Bit_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#bit_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitBit_and_expression(FunctionParser.Bit_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(FunctionParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(FunctionParser.Equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(FunctionParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(FunctionParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(FunctionParser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(FunctionParser.Shift_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(FunctionParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(FunctionParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(FunctionParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(FunctionParser.Multiplicative_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void enterCast_expression(FunctionParser.Cast_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void exitCast_expression(FunctionParser.Cast_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#cast_target}.
	 * @param ctx the parse tree
	 */
	void enterCast_target(FunctionParser.Cast_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#cast_target}.
	 * @param ctx the parse tree
	 */
	void exitCast_target(FunctionParser.Cast_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(FunctionParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(FunctionParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#new_expression}.
	 * @param ctx the parse tree
	 */
	void enterNew_expression(FunctionParser.New_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#new_expression}.
	 * @param ctx the parse tree
	 */
	void exitNew_expression(FunctionParser.New_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#unary_op_and_cast_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_op_and_cast_expr(FunctionParser.Unary_op_and_cast_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#unary_op_and_cast_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_op_and_cast_expr(FunctionParser.Unary_op_and_cast_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#sizeof_expression}.
	 * @param ctx the parse tree
	 */
	void enterSizeof_expression(FunctionParser.Sizeof_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#sizeof_expression}.
	 * @param ctx the parse tree
	 */
	void exitSizeof_expression(FunctionParser.Sizeof_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#sizeof}.
	 * @param ctx the parse tree
	 */
	void enterSizeof(FunctionParser.SizeofContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#sizeof}.
	 * @param ctx the parse tree
	 */
	void exitSizeof(FunctionParser.SizeofContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#sizeof_operand}.
	 * @param ctx the parse tree
	 */
	void enterSizeof_operand(FunctionParser.Sizeof_operandContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#sizeof_operand}.
	 * @param ctx the parse tree
	 */
	void exitSizeof_operand(FunctionParser.Sizeof_operandContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#sizeof_operand2}.
	 * @param ctx the parse tree
	 */
	void enterSizeof_operand2(FunctionParser.Sizeof_operand2Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#sizeof_operand2}.
	 * @param ctx the parse tree
	 */
	void exitSizeof_operand2(FunctionParser.Sizeof_operand2Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#inc_dec}.
	 * @param ctx the parse tree
	 */
	void enterInc_dec(FunctionParser.Inc_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#inc_dec}.
	 * @param ctx the parse tree
	 */
	void exitInc_dec(FunctionParser.Inc_decContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryOnly}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryOnly(FunctionParser.PrimaryOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryOnly}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryOnly(FunctionParser.PrimaryOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ptrMemberAccess}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPtrMemberAccess(FunctionParser.PtrMemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ptrMemberAccess}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPtrMemberAccess(FunctionParser.PtrMemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayIndexing}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndexing(FunctionParser.ArrayIndexingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayIndexing}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndexing(FunctionParser.ArrayIndexingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incDecOp}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterIncDecOp(FunctionParser.IncDecOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incDecOp}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitIncDecOp(FunctionParser.IncDecOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(FunctionParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(FunctionParser.MemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(FunctionParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(FunctionParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#function_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument_list(FunctionParser.Function_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#function_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument_list(FunctionParser.Function_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#function_argument}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument(FunctionParser.Function_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#function_argument}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument(FunctionParser.Function_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(FunctionParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(FunctionParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initDeclWithCall}
	 * labeled alternative in {@link FunctionParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclWithCall(FunctionParser.InitDeclWithCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initDeclWithCall}
	 * labeled alternative in {@link FunctionParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclWithCall(FunctionParser.InitDeclWithCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initDeclWithAssign}
	 * labeled alternative in {@link FunctionParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclWithAssign(FunctionParser.InitDeclWithAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initDeclWithAssign}
	 * labeled alternative in {@link FunctionParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclWithAssign(FunctionParser.InitDeclWithAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initDeclSimple}
	 * labeled alternative in {@link FunctionParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclSimple(FunctionParser.InitDeclSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initDeclSimple}
	 * labeled alternative in {@link FunctionParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclSimple(FunctionParser.InitDeclSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(FunctionParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(FunctionParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#type_suffix}.
	 * @param ctx the parse tree
	 */
	void enterType_suffix(FunctionParser.Type_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#type_suffix}.
	 * @param ctx the parse tree
	 */
	void exitType_suffix(FunctionParser.Type_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#simple_decl}.
	 * @param ctx the parse tree
	 */
	void enterSimple_decl(FunctionParser.Simple_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#simple_decl}.
	 * @param ctx the parse tree
	 */
	void exitSimple_decl(FunctionParser.Simple_declContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declByClass}
	 * labeled alternative in {@link FunctionParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterDeclByClass(FunctionParser.DeclByClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declByClass}
	 * labeled alternative in {@link FunctionParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitDeclByClass(FunctionParser.DeclByClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declByType}
	 * labeled alternative in {@link FunctionParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterDeclByType(FunctionParser.DeclByTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declByType}
	 * labeled alternative in {@link FunctionParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitDeclByType(FunctionParser.DeclByTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarator_list(FunctionParser.Init_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarator_list(FunctionParser.Init_declarator_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(FunctionParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(FunctionParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_list(FunctionParser.Initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_list(FunctionParser.Initializer_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#class_def}.
	 * @param ctx the parse tree
	 */
	void enterClass_def(FunctionParser.Class_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#class_def}.
	 * @param ctx the parse tree
	 */
	void exitClass_def(FunctionParser.Class_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#class_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_name(FunctionParser.Class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#class_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_name(FunctionParser.Class_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#base_classes}.
	 * @param ctx the parse tree
	 */
	void enterBase_classes(FunctionParser.Base_classesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#base_classes}.
	 * @param ctx the parse tree
	 */
	void exitBase_classes(FunctionParser.Base_classesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#base_class}.
	 * @param ctx the parse tree
	 */
	void enterBase_class(FunctionParser.Base_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#base_class}.
	 * @param ctx the parse tree
	 */
	void exitBase_class(FunctionParser.Base_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(FunctionParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(FunctionParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#base_type}.
	 * @param ctx the parse tree
	 */
	void enterBase_type(FunctionParser.Base_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#base_type}.
	 * @param ctx the parse tree
	 */
	void exitBase_type(FunctionParser.Base_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#param_decl_specifiers}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl_specifiers(FunctionParser.Param_decl_specifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#param_decl_specifiers}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl_specifiers(FunctionParser.Param_decl_specifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterParameter_name(FunctionParser.Parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitParameter_name(FunctionParser.Parameter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#param_type_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_type_list(FunctionParser.Param_type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#param_type_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_type_list(FunctionParser.Param_type_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#param_type}.
	 * @param ctx the parse tree
	 */
	void enterParam_type(FunctionParser.Param_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#param_type}.
	 * @param ctx the parse tree
	 */
	void exitParam_type(FunctionParser.Param_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#param_type_id}.
	 * @param ctx the parse tree
	 */
	void enterParam_type_id(FunctionParser.Param_type_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#param_type_id}.
	 * @param ctx the parse tree
	 */
	void exitParam_type_id(FunctionParser.Param_type_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(FunctionParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(FunctionParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(FunctionParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(FunctionParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#ptrs}.
	 * @param ctx the parse tree
	 */
	void enterPtrs(FunctionParser.PtrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#ptrs}.
	 * @param ctx the parse tree
	 */
	void exitPtrs(FunctionParser.PtrsContext ctx);
}