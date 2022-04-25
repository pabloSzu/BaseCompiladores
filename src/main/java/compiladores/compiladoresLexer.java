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
public class compiladoresLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "DOUBLE", "CHAR", "VOID", "PA", "PC", "CA", "CC", "LA", "LC", 
			"MAS", "MENOS", "POR", "DIVISION", "MOD", "IGUAL", "WHILE", "IF", "FOR", 
			"OR", "AND", "NOT", "MAYOR", "MENOR", "IGUALIGUAL", "DISTINTOIGUAL", 
			"MAYORIGUAL", "MENORIGUAL", "LETRA", "DIGITO", "PYC", "COMA", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\3\u00a3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3\"\3\"\2\2#\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2"+
		"\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;"+
		"\2=\2?\2A\2C\3\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u0082\2C\3"+
		"\2\2\2\3E\3\2\2\2\5I\3\2\2\2\7P\3\2\2\2\tU\3\2\2\2\13Z\3\2\2\2\r\\\3\2"+
		"\2\2\17^\3\2\2\2\21`\3\2\2\2\23b\3\2\2\2\25d\3\2\2\2\27f\3\2\2\2\31h\3"+
		"\2\2\2\33j\3\2\2\2\35l\3\2\2\2\37n\3\2\2\2!p\3\2\2\2#r\3\2\2\2%x\3\2\2"+
		"\2\'{\3\2\2\2)\177\3\2\2\2+\u0082\3\2\2\2-\u0085\3\2\2\2/\u0087\3\2\2"+
		"\2\61\u0089\3\2\2\2\63\u008b\3\2\2\2\65\u008e\3\2\2\2\67\u0091\3\2\2\2"+
		"9\u0094\3\2\2\2;\u0097\3\2\2\2=\u0099\3\2\2\2?\u009b\3\2\2\2A\u009d\3"+
		"\2\2\2C\u009f\3\2\2\2EF\7k\2\2FG\7p\2\2GH\7v\2\2H\4\3\2\2\2IJ\7f\2\2J"+
		"K\7q\2\2KL\7w\2\2LM\7d\2\2MN\7n\2\2NO\7g\2\2O\6\3\2\2\2PQ\7e\2\2QR\7j"+
		"\2\2RS\7c\2\2ST\7t\2\2T\b\3\2\2\2UV\7x\2\2VW\7q\2\2WX\7k\2\2XY\7f\2\2"+
		"Y\n\3\2\2\2Z[\7*\2\2[\f\3\2\2\2\\]\7+\2\2]\16\3\2\2\2^_\7]\2\2_\20\3\2"+
		"\2\2`a\7_\2\2a\22\3\2\2\2bc\7}\2\2c\24\3\2\2\2de\7\177\2\2e\26\3\2\2\2"+
		"fg\7-\2\2g\30\3\2\2\2hi\7/\2\2i\32\3\2\2\2jk\7,\2\2k\34\3\2\2\2lm\7\61"+
		"\2\2m\36\3\2\2\2no\7\'\2\2o \3\2\2\2pq\7?\2\2q\"\3\2\2\2rs\7y\2\2st\7"+
		"j\2\2tu\7k\2\2uv\7n\2\2vw\7g\2\2w$\3\2\2\2xy\7k\2\2yz\7h\2\2z&\3\2\2\2"+
		"{|\7h\2\2|}\7q\2\2}~\7t\2\2~(\3\2\2\2\177\u0080\7~\2\2\u0080\u0081\7~"+
		"\2\2\u0081*\3\2\2\2\u0082\u0083\7(\2\2\u0083\u0084\7(\2\2\u0084,\3\2\2"+
		"\2\u0085\u0086\7#\2\2\u0086.\3\2\2\2\u0087\u0088\7@\2\2\u0088\60\3\2\2"+
		"\2\u0089\u008a\7>\2\2\u008a\62\3\2\2\2\u008b\u008c\7?\2\2\u008c\u008d"+
		"\7?\2\2\u008d\64\3\2\2\2\u008e\u008f\7#\2\2\u008f\u0090\7?\2\2\u0090\66"+
		"\3\2\2\2\u0091\u0092\7@\2\2\u0092\u0093\7?\2\2\u00938\3\2\2\2\u0094\u0095"+
		"\7>\2\2\u0095\u0096\7?\2\2\u0096:\3\2\2\2\u0097\u0098\t\2\2\2\u0098<\3"+
		"\2\2\2\u0099\u009a\t\3\2\2\u009a>\3\2\2\2\u009b\u009c\7=\2\2\u009c@\3"+
		"\2\2\2\u009d\u009e\7.\2\2\u009eB\3\2\2\2\u009f\u00a0\t\4\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u00a2\b\"\2\2\u00a2D\3\2\2\2\3\2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}