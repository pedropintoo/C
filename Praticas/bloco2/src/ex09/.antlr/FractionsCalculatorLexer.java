// Generated from /home/pedro/Documents/Universidade/2ano/2semestre/C/Praticas/bloco2/src/ex09/FractionsCalculator.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FractionsCalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, Sentence=14, ID=15, Integer=16, 
		WS=17, LINE_COMMENT=18, COMMENT=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "Sentence", "ESC", "ID", "LETTER", 
			"DIGIT", "Integer", "WS", "LINE_COMMENT", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'print'", "'->'", "'*'", "':'", "'+'", "'-'", "'('", "')'", 
			"'^'", "'/'", "'read'", "'reduce'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "Sentence", "ID", "Integer", "WS", "LINE_COMMENT", "COMMENT"
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


	public FractionsCalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FractionsCalculator.g4"; }

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
		"\u0004\u0000\u0013\u0097\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\rX\b\r\n\r\f\r[\t\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000ec\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000fh\b\u000f\n\u000f\f\u000f"+
		"k\t\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0004\u0012r\b\u0012\u000b\u0012\f\u0012s\u0001\u0013\u0004\u0013w\b"+
		"\u0013\u000b\u0013\f\u0013x\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0081\b\u0014\n\u0014\f\u0014"+
		"\u0084\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u008e\b\u0015\n\u0015"+
		"\f\u0015\u0091\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003Y\u0082\u008f\u0000\u0016\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u0000\u001f\u000f!\u0000"+
		"#\u0000%\u0010\'\u0011)\u0012+\u0013\u0001\u0000\u0003\u0003\u0000AZ_"+
		"_az\u0001\u000009\u0003\u0000\t\n\r\r  \u009c\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001"+
		"\u0000\u0000\u0000\u0003/\u0001\u0000\u0000\u0000\u00055\u0001\u0000\u0000"+
		"\u0000\u00078\u0001\u0000\u0000\u0000\t:\u0001\u0000\u0000\u0000\u000b"+
		"<\u0001\u0000\u0000\u0000\r>\u0001\u0000\u0000\u0000\u000f@\u0001\u0000"+
		"\u0000\u0000\u0011B\u0001\u0000\u0000\u0000\u0013D\u0001\u0000\u0000\u0000"+
		"\u0015F\u0001\u0000\u0000\u0000\u0017H\u0001\u0000\u0000\u0000\u0019M"+
		"\u0001\u0000\u0000\u0000\u001bT\u0001\u0000\u0000\u0000\u001db\u0001\u0000"+
		"\u0000\u0000\u001fd\u0001\u0000\u0000\u0000!l\u0001\u0000\u0000\u0000"+
		"#n\u0001\u0000\u0000\u0000%q\u0001\u0000\u0000\u0000\'v\u0001\u0000\u0000"+
		"\u0000)|\u0001\u0000\u0000\u0000+\u0089\u0001\u0000\u0000\u0000-.\u0005"+
		";\u0000\u0000.\u0002\u0001\u0000\u0000\u0000/0\u0005p\u0000\u000001\u0005"+
		"r\u0000\u000012\u0005i\u0000\u000023\u0005n\u0000\u000034\u0005t\u0000"+
		"\u00004\u0004\u0001\u0000\u0000\u000056\u0005-\u0000\u000067\u0005>\u0000"+
		"\u00007\u0006\u0001\u0000\u0000\u000089\u0005*\u0000\u00009\b\u0001\u0000"+
		"\u0000\u0000:;\u0005:\u0000\u0000;\n\u0001\u0000\u0000\u0000<=\u0005+"+
		"\u0000\u0000=\f\u0001\u0000\u0000\u0000>?\u0005-\u0000\u0000?\u000e\u0001"+
		"\u0000\u0000\u0000@A\u0005(\u0000\u0000A\u0010\u0001\u0000\u0000\u0000"+
		"BC\u0005)\u0000\u0000C\u0012\u0001\u0000\u0000\u0000DE\u0005^\u0000\u0000"+
		"E\u0014\u0001\u0000\u0000\u0000FG\u0005/\u0000\u0000G\u0016\u0001\u0000"+
		"\u0000\u0000HI\u0005r\u0000\u0000IJ\u0005e\u0000\u0000JK\u0005a\u0000"+
		"\u0000KL\u0005d\u0000\u0000L\u0018\u0001\u0000\u0000\u0000MN\u0005r\u0000"+
		"\u0000NO\u0005e\u0000\u0000OP\u0005d\u0000\u0000PQ\u0005u\u0000\u0000"+
		"QR\u0005c\u0000\u0000RS\u0005e\u0000\u0000S\u001a\u0001\u0000\u0000\u0000"+
		"TY\u0005\"\u0000\u0000UX\u0003\u001d\u000e\u0000VX\t\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000"+
		"\u0000YZ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z\\\u0001\u0000"+
		"\u0000\u0000[Y\u0001\u0000\u0000\u0000\\]\u0005\"\u0000\u0000]\u001c\u0001"+
		"\u0000\u0000\u0000^_\u0005\\\u0000\u0000_c\u0005\"\u0000\u0000`a\u0005"+
		"\\\u0000\u0000ac\u0005\\\u0000\u0000b^\u0001\u0000\u0000\u0000b`\u0001"+
		"\u0000\u0000\u0000c\u001e\u0001\u0000\u0000\u0000di\u0003!\u0010\u0000"+
		"eh\u0003!\u0010\u0000fh\u0003#\u0011\u0000ge\u0001\u0000\u0000\u0000g"+
		"f\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000"+
		"\u0000ij\u0001\u0000\u0000\u0000j \u0001\u0000\u0000\u0000ki\u0001\u0000"+
		"\u0000\u0000lm\u0007\u0000\u0000\u0000m\"\u0001\u0000\u0000\u0000no\u0007"+
		"\u0001\u0000\u0000o$\u0001\u0000\u0000\u0000pr\u0003#\u0011\u0000qp\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000t&\u0001\u0000\u0000\u0000uw\u0007\u0002\u0000"+
		"\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0006"+
		"\u0013\u0000\u0000{(\u0001\u0000\u0000\u0000|}\u0005/\u0000\u0000}~\u0005"+
		"/\u0000\u0000~\u0082\u0001\u0000\u0000\u0000\u007f\u0081\t\u0000\u0000"+
		"\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000"+
		"\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0005\n\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0006\u0014\u0000\u0000\u0088*\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005/\u0000\u0000\u008a\u008b\u0005*\u0000\u0000\u008b\u008f\u0001"+
		"\u0000\u0000\u0000\u008c\u008e\t\u0000\u0000\u0000\u008d\u008c\u0001\u0000"+
		"\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000"+
		"\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000"+
		"\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0093\u0005*\u0000"+
		"\u0000\u0093\u0094\u0005/\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0006\u0015\u0000\u0000\u0096,\u0001\u0000\u0000\u0000\n"+
		"\u0000WYbgisx\u0082\u008f\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}