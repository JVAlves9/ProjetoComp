// Generated from DSL.e4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DSLParser}.
 */
public interface DSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DSLParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(DSLParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(DSLParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#loadfile}.
	 * @param ctx the parse tree
	 */
	void enterLoadfile(DSLParser.LoadfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#loadfile}.
	 * @param ctx the parse tree
	 */
	void exitLoadfile(DSLParser.LoadfileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoadConfig}
	 * labeled alternative in {@link DSLParser#load}.
	 * @param ctx the parse tree
	 */
	void enterLoadConfig(DSLParser.LoadConfigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoadConfig}
	 * labeled alternative in {@link DSLParser#load}.
	 * @param ctx the parse tree
	 */
	void exitLoadConfig(DSLParser.LoadConfigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoadWithOptions}
	 * labeled alternative in {@link DSLParser#load}.
	 * @param ctx the parse tree
	 */
	void enterLoadWithOptions(DSLParser.LoadWithOptionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoadWithOptions}
	 * labeled alternative in {@link DSLParser#load}.
	 * @param ctx the parse tree
	 */
	void exitLoadWithOptions(DSLParser.LoadWithOptionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoadSpecificConfigs}
	 * labeled alternative in {@link DSLParser#load}.
	 * @param ctx the parse tree
	 */
	void enterLoadSpecificConfigs(DSLParser.LoadSpecificConfigsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoadSpecificConfigs}
	 * labeled alternative in {@link DSLParser#load}.
	 * @param ctx the parse tree
	 */
	void exitLoadSpecificConfigs(DSLParser.LoadSpecificConfigsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#options}.
	 * @param ctx the parse tree
	 */
	void enterOptions(DSLParser.OptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#options}.
	 * @param ctx the parse tree
	 */
	void exitOptions(DSLParser.OptionsContext ctx);
}