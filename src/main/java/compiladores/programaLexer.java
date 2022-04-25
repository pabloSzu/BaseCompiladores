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
public class programaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PA=1, PC=2, CA=3, CC=4, LA=5, LC=6, PYC=7, COMA=8, EQ=9, MEN=10, MENEQ=11, 
		EQL=12, MAY=13, MAYEQ=14, DST=15, SUM=16, RES=17, MUL=18, DIV=19, MOD=20, 
		INT=21, CHAR=22, DOUBLE=23, VOID=24, ENTERO=25, DECIMAL=26, CARACTER=27, 
		OR=28, AND=29, NOT=30, IF=31, ELSE=32, FOR=33, WHILE=34, ID=35, WS=36, 
		OTRO=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "PA", "PC", "CA", "CC", "LA", "LC", "PYC", "COMA", 
			"EQ", "MEN", "MENEQ", "EQL", "MAY", "MAYEQ", "DST", "SUM", "RES", "MUL", 
			"DIV", "MOD", "INT", "CHAR", "DOUBLE", "VOID", "ENTERO", "DECIMAL", "CARACTER", 
			"OR", "AND", "NOT", "IF", "ELSE", "FOR", "WHILE", "ID", "WS", "OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'{'", "'}'", "';'", "','", "'='", 
			"'<'", "'<='", "'=='", "'>'", "'>='", "'!='", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'int'", "'char'", "'double'", "'void'", null, null, null, "'||'", 
			"'&&'", "'!'", "'if'", "'else'", "'for'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PA", "PC", "CA", "CC", "LA", "LC", "PYC", "COMA", "EQ", "MEN", 
			"MENEQ", "EQL", "MAY", "MAYEQ", "DST", "SUM", "RES", "MUL", "DIV", "MOD", 
			"INT", "CHAR", "DOUBLE", "VOID", "ENTERO", "DECIMAL", "CARACTER", "OR", 
			"AND", "NOT", "IF", "ELSE", "FOR", "WHILE", "ID", "WS", "OTRO"
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


	public programaLexer(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00cf\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\6\34\u0098\n\34\r\34\16\34\u0099\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\5&\u00c0\n&\3&\3"+
		"&\3&\7&\u00c5\n&\f&\16&\u00c8\13&\3\'\3\'\3\'\3\'\3(\3(\2\2)\3\2\5\2\7"+
		"\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21"+
		"%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!"+
		"E\"G#I$K%M&O\'\3\2\5\4\2C\\c|\3\2\62;\4\2\13\f\"\"\2\u00d1\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\3Q\3\2\2\2\5S\3\2\2\2\7U\3\2\2\2\tW\3\2\2\2\13Y\3\2\2\2\r[\3"+
		"\2\2\2\17]\3\2\2\2\21_\3\2\2\2\23a\3\2\2\2\25c\3\2\2\2\27e\3\2\2\2\31"+
		"g\3\2\2\2\33i\3\2\2\2\35l\3\2\2\2\37o\3\2\2\2!q\3\2\2\2#t\3\2\2\2%w\3"+
		"\2\2\2\'y\3\2\2\2){\3\2\2\2+}\3\2\2\2-\177\3\2\2\2/\u0081\3\2\2\2\61\u0085"+
		"\3\2\2\2\63\u008a\3\2\2\2\65\u0091\3\2\2\2\67\u0097\3\2\2\29\u009b\3\2"+
		"\2\2;\u009f\3\2\2\2=\u00a3\3\2\2\2?\u00a6\3\2\2\2A\u00a9\3\2\2\2C\u00ab"+
		"\3\2\2\2E\u00ae\3\2\2\2G\u00b3\3\2\2\2I\u00b7\3\2\2\2K\u00bf\3\2\2\2M"+
		"\u00c9\3\2\2\2O\u00cd\3\2\2\2QR\t\2\2\2R\4\3\2\2\2ST\t\3\2\2T\6\3\2\2"+
		"\2UV\7*\2\2V\b\3\2\2\2WX\7+\2\2X\n\3\2\2\2YZ\7]\2\2Z\f\3\2\2\2[\\\7_\2"+
		"\2\\\16\3\2\2\2]^\7}\2\2^\20\3\2\2\2_`\7\177\2\2`\22\3\2\2\2ab\7=\2\2"+
		"b\24\3\2\2\2cd\7.\2\2d\26\3\2\2\2ef\7?\2\2f\30\3\2\2\2gh\7>\2\2h\32\3"+
		"\2\2\2ij\7>\2\2jk\7?\2\2k\34\3\2\2\2lm\7?\2\2mn\7?\2\2n\36\3\2\2\2op\7"+
		"@\2\2p \3\2\2\2qr\7@\2\2rs\7?\2\2s\"\3\2\2\2tu\7#\2\2uv\7?\2\2v$\3\2\2"+
		"\2wx\7-\2\2x&\3\2\2\2yz\7/\2\2z(\3\2\2\2{|\7,\2\2|*\3\2\2\2}~\7\61\2\2"+
		"~,\3\2\2\2\177\u0080\7\'\2\2\u0080.\3\2\2\2\u0081\u0082\7k\2\2\u0082\u0083"+
		"\7p\2\2\u0083\u0084\7v\2\2\u0084\60\3\2\2\2\u0085\u0086\7e\2\2\u0086\u0087"+
		"\7j\2\2\u0087\u0088\7c\2\2\u0088\u0089\7t\2\2\u0089\62\3\2\2\2\u008a\u008b"+
		"\7f\2\2\u008b\u008c\7q\2\2\u008c\u008d\7w\2\2\u008d\u008e\7d\2\2\u008e"+
		"\u008f\7n\2\2\u008f\u0090\7g\2\2\u0090\64\3\2\2\2\u0091\u0092\7x\2\2\u0092"+
		"\u0093\7q\2\2\u0093\u0094\7k\2\2\u0094\u0095\7f\2\2\u0095\66\3\2\2\2\u0096"+
		"\u0098\5\5\3\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a8\3\2\2\2\u009b\u009c\5\67\34\2\u009c\u009d"+
		"\7\60\2\2\u009d\u009e\5\67\34\2\u009e:\3\2\2\2\u009f\u00a0\7)\2\2\u00a0"+
		"\u00a1\5\3\2\2\u00a1\u00a2\7)\2\2\u00a2<\3\2\2\2\u00a3\u00a4\7~\2\2\u00a4"+
		"\u00a5\7~\2\2\u00a5>\3\2\2\2\u00a6\u00a7\7(\2\2\u00a7\u00a8\7(\2\2\u00a8"+
		"@\3\2\2\2\u00a9\u00aa\7#\2\2\u00aaB\3\2\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad"+
		"\7h\2\2\u00adD\3\2\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1"+
		"\7u\2\2\u00b1\u00b2\7g\2\2\u00b2F\3\2\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5"+
		"\7q\2\2\u00b5\u00b6\7t\2\2\u00b6H\3\2\2\2\u00b7\u00b8\7y\2\2\u00b8\u00b9"+
		"\7j\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7g\2\2\u00bc"+
		"J\3\2\2\2\u00bd\u00c0\5\3\2\2\u00be\u00c0\7a\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c6\3\2\2\2\u00c1\u00c5\5\3\2\2\u00c2\u00c5\5\5"+
		"\3\2\u00c3\u00c5\7a\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7L\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\t\4\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00cc\b\'\2\2\u00ccN\3\2\2\2\u00cd\u00ce\13\2\2\2\u00ce"+
		"P\3\2\2\2\7\2\u0099\u00bf\u00c4\u00c6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}