// Generated from DLS.e4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DLSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, NAME=5, BLANK=6;
	public static final int
		RULE_start = 0, RULE_loadfile = 1, RULE_load = 2, RULE_options = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "loadfile", "load", "options"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'from'", "' '", "'load'", "'in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "NAME", "BLANK"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DLS.e4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DLSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public LoadfileContext loadfile() {
			return getRuleContext(LoadfileContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DLSParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DLSListener ) ((DLSListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DLSListener ) ((DLSListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			loadfile();
			setState(9);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoadfileContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DLSParser.NAME, 0); }
		public LoadContext load() {
			return getRuleContext(LoadContext.class,0);
		}
		public LoadfileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loadfile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DLSListener ) ((DLSListener)listener).enterLoadfile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DLSListener ) ((DLSListener)listener).exitLoadfile(this);
		}
	}

	public final LoadfileContext loadfile() throws RecognitionException {
		LoadfileContext _localctx = new LoadfileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_loadfile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			match(T__0);
			setState(12);
			match(T__1);
			setState(13);
			match(NAME);
			setState(14);
			match(T__1);
			setState(15);
			load();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoadContext extends ParserRuleContext {
		public LoadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_load; }
	 
		public LoadContext() { }
		public void copyFrom(LoadContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoadSpecificConfigsContext extends LoadContext {
		public OptionsContext options() {
			return getRuleContext(OptionsContext.class,0);
		}
		public LoadSpecificConfigsContext(LoadContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DLSListener ) ((DLSListener)listener).enterLoadSpecificConfigs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DLSListener ) ((DLSListener)listener).exitLoadSpecificConfigs(this);
		}
	}
	public static class LoadConfigContext extends LoadContext {
		public LoadConfigContext(LoadContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DLSListener ) ((DLSListener)listener).enterLoadConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DLSListener ) ((DLSListener)listener).exitLoadConfig(this);
		}
	}
	public static class LoadWithOptionsContext extends LoadContext {
		public TerminalNode NAME() { return getToken(DLSParser.NAME, 0); }
		public OptionsContext options() {
			return getRuleContext(OptionsContext.class,0);
		}
		public LoadWithOptionsContext(LoadContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DLSListener ) ((DLSListener)listener).enterLoadWithOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DLSListener ) ((DLSListener)listener).exitLoadWithOptions(this);
		}
	}

	public final LoadContext load() throws RecognitionException {
		LoadContext _localctx = new LoadContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_load);
		try {
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new LoadConfigContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new LoadWithOptionsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				match(T__3);
				setState(19);
				match(T__1);
				setState(20);
				match(NAME);
				setState(21);
				match(T__1);
				setState(22);
				match(T__2);
				setState(23);
				match(T__1);
				setState(24);
				options();
				}
				break;
			case 3:
				_localctx = new LoadSpecificConfigsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				match(T__3);
				setState(26);
				match(T__1);
				setState(27);
				options();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionsContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(DLSParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(DLSParser.NAME, i);
		}
		public OptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DLSListener ) ((DLSListener)listener).enterOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DLSListener ) ((DLSListener)listener).exitOptions(this);
		}
	}

	public final OptionsContext options() throws RecognitionException {
		OptionsContext _localctx = new OptionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					match(NAME);
					setState(31);
					match(T__1);
					}
					} 
				}
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(37);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b*\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\37\n\4\3\5\3\5\7\5#\n\5\f\5\16\5&\13"+
		"\5\3\5\3\5\3\5\2\2\6\2\4\6\b\2\2\2(\2\n\3\2\2\2\4\r\3\2\2\2\6\36\3\2\2"+
		"\2\b$\3\2\2\2\n\13\5\4\3\2\13\f\7\2\2\3\f\3\3\2\2\2\r\16\7\3\2\2\16\17"+
		"\7\4\2\2\17\20\7\7\2\2\20\21\7\4\2\2\21\22\5\6\4\2\22\5\3\2\2\2\23\37"+
		"\7\5\2\2\24\25\7\6\2\2\25\26\7\4\2\2\26\27\7\7\2\2\27\30\7\4\2\2\30\31"+
		"\7\5\2\2\31\32\7\4\2\2\32\37\5\b\5\2\33\34\7\6\2\2\34\35\7\4\2\2\35\37"+
		"\5\b\5\2\36\23\3\2\2\2\36\24\3\2\2\2\36\33\3\2\2\2\37\7\3\2\2\2 !\7\7"+
		"\2\2!#\7\4\2\2\" \3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$"+
		"\3\2\2\2\'(\7\7\2\2(\t\3\2\2\2\4\36$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}