// Generated from c:\Users\u005Cusuario\Desktop\u005Cubp\5to\TC\BaseCompiladores\src\main\java\compiladores\compiladores.g4 by ANTLR 4.8
 
    package compiladores;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class alLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PA=2, PC=3, LA=4, LC=5, CA=6, CC=7, PYC=8, EQ=9, COMA=10, INT=11, 
		CHAR=12, DOUBLE=13, FLOAT=14, STRING=15, VOID=16, FOR=17, IF=18, ELSE=19, 
		WHILE=20, SUM=21, RESTA=22, MULT=23, DIV=24, RESTO=25, LOGIC=26, COMP=27, 
		INC_DEC=28, TIPO_FUNC=29, HORA=30, FECHA=31, EMAIL=32, NUMERO=33, FLOTANTE=34, 
		ID=35, WS=36, OTRO=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "LETRA", "DIGITO", "PA", "PC", "LA", "LC", "CA", "CC", "PYC", 
			"EQ", "COMA", "INT", "CHAR", "DOUBLE", "FLOAT", "STRING", "VOID", "FOR", 
			"IF", "ELSE", "WHILE", "SUM", "RESTA", "MULT", "DIV", "RESTO", "LOGIC", 
			"COMP", "INC_DEC", "TIPO_FUNC", "HORA", "FECHA", "EMAIL", "NUMERO", "FLOTANTE", 
			"ID", "WS", "OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'return'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "'='", 
			"','", "'int'", "'char'", "'double'", "'float'", "'string'", "'void'", 
			"'for'", "'if'", "'else'", "'while'", "'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PA", "PC", "LA", "LC", "CA", "CC", "PYC", "EQ", "COMA", 
			"INT", "CHAR", "DOUBLE", "FLOAT", "STRING", "VOID", "FOR", "IF", "ELSE", 
			"WHILE", "SUM", "RESTA", "MULT", "DIV", "RESTO", "LOGIC", "COMP", "INC_DEC", 
			"TIPO_FUNC", "HORA", "FECHA", "EMAIL", "NUMERO", "FLOTANTE", "ID", "WS", 
			"OTRO"
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


	public alLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "compiladores.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u011c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\5\35\u00b4\n\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u00bc\n\36\3\37\3\37\3\37\3\37\5\37\u00c2\n\37\3 \3 \3 \3 \3 \3"+
		" \3 \5 \u00cb\n \3!\3!\3!\3!\3!\3!\5!\u00d3\n!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\5\"\u00e1\n\"\3\"\3\"\3\"\3\"\3\"\5\"\u00e8\n\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3#\3#\5#\u00f2\n#\3#\3#\3#\3#\3#\3#\3#\3$\6$\u00fc"+
		"\n$\r$\16$\u00fd\3%\6%\u0101\n%\r%\16%\u0102\3%\3%\6%\u0107\n%\r%\16%"+
		"\u0108\3&\3&\5&\u010d\n&\3&\3&\3&\7&\u0112\n&\f&\16&\u0115\13&\3\'\3\'"+
		"\3\'\3\'\3(\3(\2\2)\3\3\5\2\7\2\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13"+
		"\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65"+
		"\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'\3\2\f\4\2C\\c|\3\2\62;\4\2"+
		">>@@\3\2\62\64\3\2\62\65\3\2\62\67\3\2\63;\3\2\63\64\3\2C|\5\2\13\f\17"+
		"\17\"\"\2\u012f\2\3\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5X\3\2\2\2\7Z\3\2\2"+
		"\2\t\\\3\2\2\2\13^\3\2\2\2\r`\3\2\2\2\17b\3\2\2\2\21d\3\2\2\2\23f\3\2"+
		"\2\2\25h\3\2\2\2\27j\3\2\2\2\31l\3\2\2\2\33n\3\2\2\2\35r\3\2\2\2\37w\3"+
		"\2\2\2!~\3\2\2\2#\u0084\3\2\2\2%\u008b\3\2\2\2\'\u0090\3\2\2\2)\u0094"+
		"\3\2\2\2+\u0097\3\2\2\2-\u009c\3\2\2\2/\u00a2\3\2\2\2\61\u00a4\3\2\2\2"+
		"\63\u00a6\3\2\2\2\65\u00a8\3\2\2\2\67\u00aa\3\2\2\29\u00b3\3\2\2\2;\u00bb"+
		"\3\2\2\2=\u00c1\3\2\2\2?\u00ca\3\2\2\2A\u00d2\3\2\2\2C\u00e0\3\2\2\2E"+
		"\u00f1\3\2\2\2G\u00fb\3\2\2\2I\u0100\3\2\2\2K\u010c\3\2\2\2M\u0116\3\2"+
		"\2\2O\u011a\3\2\2\2QR\7t\2\2RS\7g\2\2ST\7v\2\2TU\7w\2\2UV\7t\2\2VW\7p"+
		"\2\2W\4\3\2\2\2XY\t\2\2\2Y\6\3\2\2\2Z[\t\3\2\2[\b\3\2\2\2\\]\7*\2\2]\n"+
		"\3\2\2\2^_\7+\2\2_\f\3\2\2\2`a\7}\2\2a\16\3\2\2\2bc\7\177\2\2c\20\3\2"+
		"\2\2de\7]\2\2e\22\3\2\2\2fg\7_\2\2g\24\3\2\2\2hi\7=\2\2i\26\3\2\2\2jk"+
		"\7?\2\2k\30\3\2\2\2lm\7.\2\2m\32\3\2\2\2no\7k\2\2op\7p\2\2pq\7v\2\2q\34"+
		"\3\2\2\2rs\7e\2\2st\7j\2\2tu\7c\2\2uv\7t\2\2v\36\3\2\2\2wx\7f\2\2xy\7"+
		"q\2\2yz\7w\2\2z{\7d\2\2{|\7n\2\2|}\7g\2\2} \3\2\2\2~\177\7h\2\2\177\u0080"+
		"\7n\2\2\u0080\u0081\7q\2\2\u0081\u0082\7c\2\2\u0082\u0083\7v\2\2\u0083"+
		"\"\3\2\2\2\u0084\u0085\7u\2\2\u0085\u0086\7v\2\2\u0086\u0087\7t\2\2\u0087"+
		"\u0088\7k\2\2\u0088\u0089\7p\2\2\u0089\u008a\7i\2\2\u008a$\3\2\2\2\u008b"+
		"\u008c\7x\2\2\u008c\u008d\7q\2\2\u008d\u008e\7k\2\2\u008e\u008f\7f\2\2"+
		"\u008f&\3\2\2\2\u0090\u0091\7h\2\2\u0091\u0092\7q\2\2\u0092\u0093\7t\2"+
		"\2\u0093(\3\2\2\2\u0094\u0095\7k\2\2\u0095\u0096\7h\2\2\u0096*\3\2\2\2"+
		"\u0097\u0098\7g\2\2\u0098\u0099\7n\2\2\u0099\u009a\7u\2\2\u009a\u009b"+
		"\7g\2\2\u009b,\3\2\2\2\u009c\u009d\7y\2\2\u009d\u009e\7j\2\2\u009e\u009f"+
		"\7k\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7g\2\2\u00a1.\3\2\2\2\u00a2\u00a3"+
		"\7-\2\2\u00a3\60\3\2\2\2\u00a4\u00a5\7/\2\2\u00a5\62\3\2\2\2\u00a6\u00a7"+
		"\7,\2\2\u00a7\64\3\2\2\2\u00a8\u00a9\7\61\2\2\u00a9\66\3\2\2\2\u00aa\u00ab"+
		"\7\'\2\2\u00ab8\3\2\2\2\u00ac\u00b4\t\4\2\2\u00ad\u00ae\7>\2\2\u00ae\u00b4"+
		"\7?\2\2\u00af\u00b0\7@\2\2\u00b0\u00b4\7?\2\2\u00b1\u00b2\7#\2\2\u00b2"+
		"\u00b4\7?\2\2\u00b3\u00ac\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b3\u00af\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b4:\3\2\2\2\u00b5\u00b6\7?\2\2\u00b6\u00bc"+
		"\7?\2\2\u00b7\u00bc\7(\2\2\u00b8\u00b9\7(\2\2\u00b9\u00bc\7(\2\2\u00ba"+
		"\u00bc\7~\2\2\u00bb\u00b5\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bb\u00b8\3\2"+
		"\2\2\u00bb\u00ba\3\2\2\2\u00bc<\3\2\2\2\u00bd\u00be\7-\2\2\u00be\u00c2"+
		"\7-\2\2\u00bf\u00c0\7/\2\2\u00c0\u00c2\7/\2\2\u00c1\u00bd\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2>\3\2\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7p\2\2\u00c5"+
		"\u00cb\7v\2\2\u00c6\u00c7\7x\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7k\2\2"+
		"\u00c9\u00cb\7f\2\2\u00ca\u00c3\3\2\2\2\u00ca\u00c6\3\2\2\2\u00cb@\3\2"+
		"\2\2\u00cc\u00cd\7\62\2\2\u00cd\u00d3\t\5\2\2\u00ce\u00cf\7\63\2\2\u00cf"+
		"\u00d3\t\3\2\2\u00d0\u00d1\7\64\2\2\u00d1\u00d3\t\6\2\2\u00d2\u00cc\3"+
		"\2\2\2\u00d2\u00ce\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d5\7<\2\2\u00d5\u00d6\t\7\2\2\u00d6\u00d7\t\3\2\2\u00d7B\3\2\2\2\u00d8"+
		"\u00d9\7\62\2\2\u00d9\u00e1\t\b\2\2\u00da\u00db\7\63\2\2\u00db\u00e1\t"+
		"\3\2\2\u00dc\u00dd\7\64\2\2\u00dd\u00e1\t\3\2\2\u00de\u00df\7\65\2\2\u00df"+
		"\u00e1\7\62\2\2\u00e0\u00d8\3\2\2\2\u00e0\u00da\3\2\2\2\u00e0\u00dc\3"+
		"\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e7\7\61\2\2\u00e3"+
		"\u00e4\7\62\2\2\u00e4\u00e8\t\b\2\2\u00e5\u00e6\7\63\2\2\u00e6\u00e8\t"+
		"\t\2\2\u00e7\u00e3\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ea\7\61\2\2\u00ea\u00eb\t\3\2\2\u00eb\u00ec\t\3\2\2\u00ec\u00ed\t"+
		"\3\2\2\u00ed\u00ee\t\3\2\2\u00eeD\3\2\2\2\u00ef\u00f2\5K&\2\u00f0\u00f2"+
		"\t\n\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f4\7B\2\2\u00f4\u00f5\5K&\2\u00f5\u00f6\7\60\2\2\u00f6\u00f7\7e\2"+
		"\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7o\2\2\u00f9F\3\2\2\2\u00fa\u00fc\5"+
		"\7\4\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00feH\3\2\2\2\u00ff\u0101\5\7\4\2\u0100\u00ff\3\2\2\2"+
		"\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0106\7\60\2\2\u0105\u0107\5\7\4\2\u0106\u0105\3\2\2\2"+
		"\u0107\u0108\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109J\3"+
		"\2\2\2\u010a\u010d\5\5\3\2\u010b\u010d\7a\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010b\3\2\2\2\u010d\u0113\3\2\2\2\u010e\u0112\5\5\3\2\u010f\u0112\5\7"+
		"\4\2\u0110\u0112\7a\2\2\u0111\u010e\3\2\2\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114L\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\t\13\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\u0119\b\'\2\2\u0119N\3\2\2\2\u011a\u011b\13\2\2\2\u011b"+
		"P\3\2\2\2\21\2\u00b3\u00bb\u00c1\u00ca\u00d2\u00e0\u00e7\u00f1\u00fd\u0102"+
		"\u0108\u010c\u0111\u0113\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}