// Generated from Projeto.e4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProjetoParser}.
 */
public interface ProjetoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProjetoParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ProjetoParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjetoParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ProjetoParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeviceConfig}
	 * labeled alternative in {@link ProjetoParser#config}.
	 * @param ctx the parse tree
	 */
	void enterDeviceConfig(ProjetoParser.DeviceConfigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeviceConfig}
	 * labeled alternative in {@link ProjetoParser#config}.
	 * @param ctx the parse tree
	 */
	void exitDeviceConfig(ProjetoParser.DeviceConfigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Atribuicao}
	 * labeled alternative in {@link ProjetoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(ProjetoParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Atribuicao}
	 * labeled alternative in {@link ProjetoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(ProjetoParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtribuicaoLista}
	 * labeled alternative in {@link ProjetoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaoLista(ProjetoParser.AtribuicaoListaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtribuicaoLista}
	 * labeled alternative in {@link ProjetoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaoLista(ProjetoParser.AtribuicaoListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjetoParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(ProjetoParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjetoParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(ProjetoParser.ValorContext ctx);
}