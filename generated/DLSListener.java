// Generated from DLS.e4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DLSParser}.
 */
public interface DLSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DLSParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(DLSParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DLSParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(DLSParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link DLSParser#loadfile}.
	 * @param ctx the parse tree
	 */
	void enterLoadfile(DLSParser.LoadfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link DLSParser#loadfile}.
	 * @param ctx the parse tree
	 */
	void exitLoadfile(DLSParser.LoadfileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoadConfig}
	 * labeled alternative in {@link DLSParser#load}.
	 * @param ctx the parse tree
	 */
	void enterLoadConfig(DLSParser.LoadConfigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoadConfig}
	 * labeled alternative in {@link DLSParser#load}.
	 * @param ctx the parse tree
	 */
	void exitLoadConfig(DLSParser.LoadConfigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoadWithOptions}
	 * labeled alternative in {@link DLSParser#load}.
	 * @param ctx the parse tree
	 */
	void enterLoadWithOptions(DLSParser.LoadWithOptionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoadWithOptions}
	 * labeled alternative in {@link DLSParser#load}.
	 * @param ctx the parse tree
	 */
	void exitLoadWithOptions(DLSParser.LoadWithOptionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoadSpecificConfigs}
	 * labeled alternative in {@link DLSParser#load}.
	 * @param ctx the parse tree
	 */
	void enterLoadSpecificConfigs(DLSParser.LoadSpecificConfigsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoadSpecificConfigs}
	 * labeled alternative in {@link DLSParser#load}.
	 * @param ctx the parse tree
	 */
	void exitLoadSpecificConfigs(DLSParser.LoadSpecificConfigsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DLSParser#options}.
	 * @param ctx the parse tree
	 */
	void enterOptions(DLSParser.OptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DLSParser#options}.
	 * @param ctx the parse tree
	 */
	void exitOptions(DLSParser.OptionsContext ctx);
}