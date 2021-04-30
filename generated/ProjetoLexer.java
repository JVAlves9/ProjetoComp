// Generated from Projeto.e4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProjetoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, NAMES=6, VNUM=7, BLANK=8, COMMENT=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "NAMES", "VNUM", "BLANK", "COMMENT", 
			"SPECIAL_CHARS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'\n'", "'='", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "NAMES", "VNUM", "BLANK", "COMMENT"
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


	public ProjetoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Projeto.e4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13N\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\5\7#\n\7\3\7\3\7\5\7\'"+
		"\n\7\6\7)\n\7\r\7\16\7*\3\b\6\b.\n\b\r\b\16\b/\3\t\6\t\63\n\t\r\t\16\t"+
		"\64\3\t\3\t\3\n\3\n\7\n;\n\n\f\n\16\n>\13\n\3\n\3\n\3\n\7\nC\n\n\f\n\16"+
		"\nF\13\n\3\n\5\nI\n\n\3\n\3\n\3\13\3\13\4<D\2\f\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\2\3\2\6\5\2\62;C\\c|\3\2\62;\4\2\13\13\"\"\n\2$"+
		"$&(/\61<<BB^^aa\u0080\u0080\2T\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\3\27\3\2\2\2\5\31\3\2\2\2\7\33\3\2\2\2\t\35\3\2\2\2\13\37\3\2\2\2\r"+
		"(\3\2\2\2\17-\3\2\2\2\21\62\3\2\2\2\23H\3\2\2\2\25L\3\2\2\2\27\30\7]\2"+
		"\2\30\4\3\2\2\2\31\32\7_\2\2\32\6\3\2\2\2\33\34\7\f\2\2\34\b\3\2\2\2\35"+
		"\36\7?\2\2\36\n\3\2\2\2\37 \7.\2\2 \f\3\2\2\2!#\5\25\13\2\"!\3\2\2\2\""+
		"#\3\2\2\2#$\3\2\2\2$&\t\2\2\2%\'\5\25\13\2&%\3\2\2\2&\'\3\2\2\2\')\3\2"+
		"\2\2(\"\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\16\3\2\2\2,.\t\3\2\2-,"+
		"\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\20\3\2\2\2\61\63\t\4\2\2\62"+
		"\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66"+
		"\67\b\t\2\2\67\22\3\2\2\28<\7%\2\29;\13\2\2\2:9\3\2\2\2;>\3\2\2\2<=\3"+
		"\2\2\2<:\3\2\2\2=?\3\2\2\2><\3\2\2\2?I\7\f\2\2@D\7=\2\2AC\13\2\2\2BA\3"+
		"\2\2\2CF\3\2\2\2DE\3\2\2\2DB\3\2\2\2EG\3\2\2\2FD\3\2\2\2GI\7\f\2\2H8\3"+
		"\2\2\2H@\3\2\2\2IJ\3\2\2\2JK\b\n\2\2K\24\3\2\2\2LM\t\5\2\2M\26\3\2\2\2"+
		"\13\2\"&*/\64<DH\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}