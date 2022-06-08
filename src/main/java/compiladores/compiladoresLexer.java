// Generated from c:\Users\u005Cusuario\Desktop\u005Cubp\5to\TC\BaseCompiladores\src\main\java\compiladores\compiladores.g4 by ANTLR 4.9.2

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
public class compiladoresLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LA=1, LC=2, CA=3, CC=4, PA=5, PC=6, PYC=7, COMA=8, IGUAL=9, MENOR=10, 
		MENORIGUAL=11, IGUALL=12, MAYOR=13, MAYORIGUAL=14, DISTINTO=15, SUMA=16, 
		RESTA=17, MULT=18, DIV=19, MOD=20, MASMAS=21, MENOSMENOS=22, INT=23, CHAR=24, 
		DOUBLE=25, VOID=26, FLOAT=27, ENTERO=28, DECIMAL=29, OR=30, AND=31, NOT=32, 
		IF_=33, ELSE_=34, FOR_=35, WHILE_=36, RETURN=37, ID=38, WS=39, OTRO=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "LA", "LC", "CA", "CC", "PA", "PC", "PYC", "COMA", 
			"IGUAL", "MENOR", "MENORIGUAL", "IGUALL", "MAYOR", "MAYORIGUAL", "DISTINTO", 
			"SUMA", "RESTA", "MULT", "DIV", "MOD", "MASMAS", "MENOSMENOS", "INT", 
			"CHAR", "DOUBLE", "VOID", "FLOAT", "ENTERO", "DECIMAL", "OR", "AND", 
			"NOT", "IF_", "ELSE_", "FOR_", "WHILE_", "RETURN", "ID", "WS", "OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "','", "'='", 
			"'<'", "'<='", "'=='", "'>'", "'>='", "'!='", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'++'", "'--'", "'int'", "'char'", "'double'", "'void'", "'float'", 
			null, null, "'||'", "'&&'", "'!'", null, null, null, null, "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LA", "LC", "CA", "CC", "PA", "PC", "PYC", "COMA", "IGUAL", "MENOR", 
			"MENORIGUAL", "IGUALL", "MAYOR", "MAYORIGUAL", "DISTINTO", "SUMA", "RESTA", 
			"MULT", "DIV", "MOD", "MASMAS", "MENOSMENOS", "INT", "CHAR", "DOUBLE", 
			"VOID", "FLOAT", "ENTERO", "DECIMAL", "OR", "AND", "NOT", "IF_", "ELSE_", 
			"FOR_", "WHILE_", "RETURN", "ID", "WS", "OTRO"
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


	public compiladoresLexer(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u00f7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\6\37\u00aa\n\37\r\37\16\37\u00ab\3"+
		" \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$\5$\u00be\n$\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\5%\u00c8\n%\3&\3&\3&\3&\3&\3&\5&\u00d0\n&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u00dd\n\'\3(\3(\3(\3(\3(\3(\3(\3"+
		")\3)\5)\u00e8\n)\3)\3)\3)\7)\u00ed\n)\f)\16)\u00f0\13)\3*\3*\3*\3*\3+"+
		"\3+\2\2,\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r"+
		"\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\33"+
		"9\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*\3\2\5\4\2C\\c|\3\2\62;\5\2\13"+
		"\f\17\17\"\"\2\u00fd\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\3W\3\2\2\2\5Y\3\2\2\2\7[\3\2\2\2\t]\3\2\2\2\13_\3\2\2\2\ra\3\2"+
		"\2\2\17c\3\2\2\2\21e\3\2\2\2\23g\3\2\2\2\25i\3\2\2\2\27k\3\2\2\2\31m\3"+
		"\2\2\2\33o\3\2\2\2\35r\3\2\2\2\37u\3\2\2\2!w\3\2\2\2#z\3\2\2\2%}\3\2\2"+
		"\2\'\177\3\2\2\2)\u0081\3\2\2\2+\u0083\3\2\2\2-\u0085\3\2\2\2/\u0087\3"+
		"\2\2\2\61\u008a\3\2\2\2\63\u008d\3\2\2\2\65\u0091\3\2\2\2\67\u0096\3\2"+
		"\2\29\u009d\3\2\2\2;\u00a2\3\2\2\2=\u00a9\3\2\2\2?\u00ad\3\2\2\2A\u00b1"+
		"\3\2\2\2C\u00b4\3\2\2\2E\u00b7\3\2\2\2G\u00bd\3\2\2\2I\u00c7\3\2\2\2K"+
		"\u00cf\3\2\2\2M\u00dc\3\2\2\2O\u00de\3\2\2\2Q\u00e7\3\2\2\2S\u00f1\3\2"+
		"\2\2U\u00f5\3\2\2\2WX\t\2\2\2X\4\3\2\2\2YZ\t\3\2\2Z\6\3\2\2\2[\\\7}\2"+
		"\2\\\b\3\2\2\2]^\7\177\2\2^\n\3\2\2\2_`\7]\2\2`\f\3\2\2\2ab\7_\2\2b\16"+
		"\3\2\2\2cd\7*\2\2d\20\3\2\2\2ef\7+\2\2f\22\3\2\2\2gh\7=\2\2h\24\3\2\2"+
		"\2ij\7.\2\2j\26\3\2\2\2kl\7?\2\2l\30\3\2\2\2mn\7>\2\2n\32\3\2\2\2op\7"+
		">\2\2pq\7?\2\2q\34\3\2\2\2rs\7?\2\2st\7?\2\2t\36\3\2\2\2uv\7@\2\2v \3"+
		"\2\2\2wx\7@\2\2xy\7?\2\2y\"\3\2\2\2z{\7#\2\2{|\7?\2\2|$\3\2\2\2}~\7-\2"+
		"\2~&\3\2\2\2\177\u0080\7/\2\2\u0080(\3\2\2\2\u0081\u0082\7,\2\2\u0082"+
		"*\3\2\2\2\u0083\u0084\7\61\2\2\u0084,\3\2\2\2\u0085\u0086\7\'\2\2\u0086"+
		".\3\2\2\2\u0087\u0088\7-\2\2\u0088\u0089\7-\2\2\u0089\60\3\2\2\2\u008a"+
		"\u008b\7/\2\2\u008b\u008c\7/\2\2\u008c\62\3\2\2\2\u008d\u008e\7k\2\2\u008e"+
		"\u008f\7p\2\2\u008f\u0090\7v\2\2\u0090\64\3\2\2\2\u0091\u0092\7e\2\2\u0092"+
		"\u0093\7j\2\2\u0093\u0094\7c\2\2\u0094\u0095\7t\2\2\u0095\66\3\2\2\2\u0096"+
		"\u0097\7f\2\2\u0097\u0098\7q\2\2\u0098\u0099\7w\2\2\u0099\u009a\7d\2\2"+
		"\u009a\u009b\7n\2\2\u009b\u009c\7g\2\2\u009c8\3\2\2\2\u009d\u009e\7x\2"+
		"\2\u009e\u009f\7q\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7f\2\2\u00a1:\3\2"+
		"\2\2\u00a2\u00a3\7h\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6"+
		"\7c\2\2\u00a6\u00a7\7v\2\2\u00a7<\3\2\2\2\u00a8\u00aa\5\5\3\2\u00a9\u00a8"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		">\3\2\2\2\u00ad\u00ae\5=\37\2\u00ae\u00af\7\60\2\2\u00af\u00b0\5=\37\2"+
		"\u00b0@\3\2\2\2\u00b1\u00b2\7~\2\2\u00b2\u00b3\7~\2\2\u00b3B\3\2\2\2\u00b4"+
		"\u00b5\7(\2\2\u00b5\u00b6\7(\2\2\u00b6D\3\2\2\2\u00b7\u00b8\7#\2\2\u00b8"+
		"F\3\2\2\2\u00b9\u00ba\7k\2\2\u00ba\u00be\7h\2\2\u00bb\u00bc\7K\2\2\u00bc"+
		"\u00be\7H\2\2\u00bd\u00b9\3\2\2\2\u00bd\u00bb\3\2\2\2\u00beH\3\2\2\2\u00bf"+
		"\u00c0\7g\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c8\7g\2\2"+
		"\u00c3\u00c4\7G\2\2\u00c4\u00c5\7N\2\2\u00c5\u00c6\7U\2\2\u00c6\u00c8"+
		"\7G\2\2\u00c7\u00bf\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c8J\3\2\2\2\u00c9\u00ca"+
		"\7h\2\2\u00ca\u00cb\7q\2\2\u00cb\u00d0\7t\2\2\u00cc\u00cd\7H\2\2\u00cd"+
		"\u00ce\7Q\2\2\u00ce\u00d0\7T\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00cc\3\2\2"+
		"\2\u00d0L\3\2\2\2\u00d1\u00d2\7y\2\2\u00d2\u00d3\7j\2\2\u00d3\u00d4\7"+
		"k\2\2\u00d4\u00d5\7n\2\2\u00d5\u00dd\7g\2\2\u00d6\u00d7\7Y\2\2\u00d7\u00d8"+
		"\7J\2\2\u00d8\u00d9\7K\2\2\u00d9\u00da\7N\2\2\u00da\u00db\7G\2\2\u00db"+
		"\u00dd\7a\2\2\u00dc\u00d1\3\2\2\2\u00dc\u00d6\3\2\2\2\u00ddN\3\2\2\2\u00de"+
		"\u00df\7t\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7w\2\2"+
		"\u00e2\u00e3\7t\2\2\u00e3\u00e4\7p\2\2\u00e4P\3\2\2\2\u00e5\u00e8\5\3"+
		"\2\2\u00e6\u00e8\7a\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8"+
		"\u00ee\3\2\2\2\u00e9\u00ed\5\3\2\2\u00ea\u00ed\5\5\3\2\u00eb\u00ed\7a"+
		"\2\2\u00ec\u00e9\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed"+
		"\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00efR\3\2\2\2"+
		"\u00f0\u00ee\3\2\2\2\u00f1\u00f2\t\4\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4"+
		"\b*\2\2\u00f4T\3\2\2\2\u00f5\u00f6\13\2\2\2\u00f6V\3\2\2\2\13\2\u00ab"+
		"\u00bd\u00c7\u00cf\u00dc\u00e7\u00ec\u00ee\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}