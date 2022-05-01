// Generated from c:\Users\u005Cusuario\Desktop\u005Cubp\5to\TC\BaseCompiladores\src\main\java\compiladores\compiladores.g4 by ANTLR 4.8

package compiladores;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class compiladoresParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LA=1, LC=2, CA=3, CC=4, PA=5, PC=6, PYC=7, COMA=8, IGUAL=9, MENOR=10, 
		MENORIGUAL=11, IGUALL=12, MAYOR=13, MAYORIGUAL=14, DISTINTO=15, SUMA=16, 
		RESTA=17, MULT=18, DIV=19, MOD=20, MASMAS=21, MENOSMENOS=22, INT=23, CHAR=24, 
		DOUBLE=25, VOID=26, ENTERO=27, DECIMAL=28, OR=29, AND=30, NOT=31, IF=32, 
		ELSE=33, FOR=34, WHILE=35, ID=36, WS=37, OTRO=38;
	public static final int
		RULE_s = 0, RULE_programa = 1, RULE_instrucciones = 2, RULE_bloque = 3, 
		RULE_instruccion = 4, RULE_declaracion = 5, RULE_asignacion_ = 6, RULE_tipodato = 7, 
		RULE_asignacion = 8, RULE_masmas_menosmenos = 9, RULE_ciclofor = 10, RULE_ciclowhile = 11, 
		RULE_condif = 12, RULE_funcion = 13, RULE_parametros = 14, RULE_llamada_funcion = 15, 
		RULE_argumentos = 16, RULE_operacion = 17, RULE_opal = 18, RULE_disyuncion = 19, 
		RULE_disy = 20, RULE_conjuncion = 21, RULE_conj = 22, RULE_comparaciones = 23, 
		RULE_comp = 24, RULE_opcomp = 25, RULE_expresion = 26, RULE_exp = 27, 
		RULE_termino = 28, RULE_term = 29, RULE_factor = 30, RULE_f = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "programa", "instrucciones", "bloque", "instruccion", "declaracion", 
			"asignacion_", "tipodato", "asignacion", "masmas_menosmenos", "ciclofor", 
			"ciclowhile", "condif", "funcion", "parametros", "llamada_funcion", "argumentos", 
			"operacion", "opal", "disyuncion", "disy", "conjuncion", "conj", "comparaciones", 
			"comp", "opcomp", "expresion", "exp", "termino", "term", "factor", "f"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "','", "'='", 
			"'<'", "'<='", "'=='", "'>'", "'>='", "'!='", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'++'", "'--'", "'int'", "'char'", "'double'", "'void'", null, 
			null, "'||'", "'&&'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LA", "LC", "CA", "CC", "PA", "PC", "PYC", "COMA", "IGUAL", "MENOR", 
			"MENORIGUAL", "IGUALL", "MAYOR", "MAYORIGUAL", "DISTINTO", "SUMA", "RESTA", 
			"MULT", "DIV", "MOD", "MASMAS", "MENOSMENOS", "INT", "CHAR", "DOUBLE", 
			"VOID", "ENTERO", "DECIMAL", "OR", "AND", "NOT", "IF", "ELSE", "FOR", 
			"WHILE", "ID", "WS", "OTRO"
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
	public String getGrammarFileName() { return "compiladores.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public compiladoresParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			programa();
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

	public static class ProgramaContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			instrucciones();
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

	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instrucciones);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LA:
			case INT:
			case CHAR:
			case DOUBLE:
			case VOID:
			case IF:
			case FOR:
			case WHILE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				instruccion();
				setState(69);
				instrucciones();
				}
				break;
			case EOF:
			case LC:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LA() { return getToken(compiladoresParser.LA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LC() { return getToken(compiladoresParser.LC, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(LA);
			setState(75);
			instrucciones();
			setState(76);
			match(LC);
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

	public static class InstruccionContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode PYC() { return getToken(compiladoresParser.PYC, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public CicloforContext ciclofor() {
			return getRuleContext(CicloforContext.class,0);
		}
		public CiclowhileContext ciclowhile() {
			return getRuleContext(CiclowhileContext.class,0);
		}
		public CondifContext condif() {
			return getRuleContext(CondifContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instruccion);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				declaracion();
				setState(79);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				asignacion();
				setState(82);
				match(PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				ciclofor();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				ciclowhile();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				condif();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				funcion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(88);
				llamada_funcion();
				setState(89);
				match(PYC);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(91);
				bloque();
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public Asignacion_Context asignacion_() {
			return getRuleContext(Asignacion_Context.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracion);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				tipodato();
				setState(95);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				tipodato();
				setState(98);
				match(ID);
				setState(99);
				asignacion_();
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

	public static class Asignacion_Context extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(compiladoresParser.IGUAL, 0); }
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public Asignacion_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterAsignacion_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitAsignacion_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitAsignacion_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asignacion_Context asignacion_() throws RecognitionException {
		Asignacion_Context _localctx = new Asignacion_Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_asignacion_);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(IGUAL);
				setState(104);
				llamada_funcion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(IGUAL);
				setState(106);
				operacion();
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

	public static class TipodatoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(compiladoresParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(compiladoresParser.CHAR, 0); }
		public TerminalNode DOUBLE() { return getToken(compiladoresParser.DOUBLE, 0); }
		public TerminalNode VOID() { return getToken(compiladoresParser.VOID, 0); }
		public TipodatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipodato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterTipodato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitTipodato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitTipodato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipodatoContext tipodato() throws RecognitionException {
		TipodatoContext _localctx = new TipodatoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipodato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << DOUBLE) | (1L << VOID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public Asignacion_Context asignacion_() {
			return getRuleContext(Asignacion_Context.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(ID);
			setState(112);
			asignacion_();
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

	public static class Masmas_menosmenosContext extends ParserRuleContext {
		public TerminalNode MASMAS() { return getToken(compiladoresParser.MASMAS, 0); }
		public TerminalNode MENOSMENOS() { return getToken(compiladoresParser.MENOSMENOS, 0); }
		public Masmas_menosmenosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_masmas_menosmenos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterMasmas_menosmenos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitMasmas_menosmenos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitMasmas_menosmenos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Masmas_menosmenosContext masmas_menosmenos() throws RecognitionException {
		Masmas_menosmenosContext _localctx = new Masmas_menosmenosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_masmas_menosmenos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !(_la==MASMAS || _la==MENOSMENOS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class CicloforContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(compiladoresParser.FOR, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public List<TerminalNode> PYC() { return getTokens(compiladoresParser.PYC); }
		public TerminalNode PYC(int i) {
			return getToken(compiladoresParser.PYC, i);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public Masmas_menosmenosContext masmas_menosmenos() {
			return getRuleContext(Masmas_menosmenosContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public CicloforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclofor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterCiclofor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitCiclofor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitCiclofor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloforContext ciclofor() throws RecognitionException {
		CicloforContext _localctx = new CicloforContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ciclofor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(FOR);
			setState(117);
			match(PA);
			setState(118);
			asignacion();
			setState(119);
			match(PYC);
			setState(120);
			operacion();
			setState(121);
			match(PYC);
			setState(122);
			match(ID);
			setState(123);
			masmas_menosmenos();
			setState(124);
			match(PC);
			setState(125);
			instruccion();
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

	public static class CiclowhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(compiladoresParser.WHILE, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public CiclowhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclowhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterCiclowhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitCiclowhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitCiclowhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CiclowhileContext ciclowhile() throws RecognitionException {
		CiclowhileContext _localctx = new CiclowhileContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ciclowhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(WHILE);
			setState(128);
			match(PA);
			setState(129);
			operacion();
			setState(130);
			match(PC);
			setState(131);
			instruccion();
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

	public static class CondifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(compiladoresParser.IF, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(compiladoresParser.ELSE, 0); }
		public CondifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterCondif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitCondif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitCondif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondifContext condif() throws RecognitionException {
		CondifContext _localctx = new CondifContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condif);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(IF);
				setState(134);
				match(PA);
				setState(135);
				operacion();
				setState(136);
				match(PC);
				setState(137);
				instruccion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(IF);
				setState(140);
				match(PA);
				setState(141);
				operacion();
				setState(142);
				match(PC);
				setState(143);
				instruccion();
				setState(144);
				match(ELSE);
				setState(145);
				instruccion();
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

	public static class FuncionContext extends ParserRuleContext {
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			tipodato();
			setState(150);
			match(ID);
			setState(151);
			match(PA);
			setState(152);
			parametros();
			setState(153);
			match(PC);
			setState(154);
			bloque();
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

	public static class ParametrosContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode COMA() { return getToken(compiladoresParser.COMA, 0); }
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parametros);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case CHAR:
			case DOUBLE:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				declaracion();
				setState(157);
				parametros();
				}
				break;
			case COMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(COMA);
				setState(160);
				parametros();
				}
				break;
			case PC:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Llamada_funcionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public Llamada_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterLlamada_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitLlamada_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitLlamada_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_funcionContext llamada_funcion() throws RecognitionException {
		Llamada_funcionContext _localctx = new Llamada_funcionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_llamada_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(ID);
			setState(165);
			match(PA);
			setState(166);
			argumentos();
			setState(167);
			match(PC);
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

	public static class ArgumentosContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode COMA() { return getToken(compiladoresParser.COMA, 0); }
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_argumentos);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(ID);
				setState(170);
				argumentos();
				}
				break;
			case COMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(COMA);
				setState(172);
				argumentos();
				}
				break;
			case PC:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class OperacionContext extends ParserRuleContext {
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitOperacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			opal();
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

	public static class OpalContext extends ParserRuleContext {
		public DisyuncionContext disyuncion() {
			return getRuleContext(DisyuncionContext.class,0);
		}
		public OpalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterOpal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitOpal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitOpal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpalContext opal() throws RecognitionException {
		OpalContext _localctx = new OpalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_opal);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case SUMA:
			case RESTA:
			case ENTERO:
			case DECIMAL:
			case NOT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				disyuncion();
				}
				break;
			case PC:
			case PYC:
			case COMA:
			case INT:
			case CHAR:
			case DOUBLE:
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DisyuncionContext extends ParserRuleContext {
		public ConjuncionContext conjuncion() {
			return getRuleContext(ConjuncionContext.class,0);
		}
		public DisyContext disy() {
			return getRuleContext(DisyContext.class,0);
		}
		public DisyuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disyuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterDisyuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitDisyuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitDisyuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisyuncionContext disyuncion() throws RecognitionException {
		DisyuncionContext _localctx = new DisyuncionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_disyuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			conjuncion();
			setState(183);
			disy();
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

	public static class DisyContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(compiladoresParser.OR, 0); }
		public ConjuncionContext conjuncion() {
			return getRuleContext(ConjuncionContext.class,0);
		}
		public DisyContext disy() {
			return getRuleContext(DisyContext.class,0);
		}
		public DisyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterDisy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitDisy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitDisy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisyContext disy() throws RecognitionException {
		DisyContext _localctx = new DisyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_disy);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(OR);
				setState(186);
				conjuncion();
				setState(187);
				disy();
				}
				break;
			case PC:
			case PYC:
			case COMA:
			case INT:
			case CHAR:
			case DOUBLE:
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConjuncionContext extends ParserRuleContext {
		public ComparacionesContext comparaciones() {
			return getRuleContext(ComparacionesContext.class,0);
		}
		public ConjContext conj() {
			return getRuleContext(ConjContext.class,0);
		}
		public ConjuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterConjuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitConjuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitConjuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjuncionContext conjuncion() throws RecognitionException {
		ConjuncionContext _localctx = new ConjuncionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_conjuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			comparaciones();
			setState(193);
			conj();
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

	public static class ConjContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(compiladoresParser.AND, 0); }
		public ComparacionesContext comparaciones() {
			return getRuleContext(ComparacionesContext.class,0);
		}
		public ConjContext conj() {
			return getRuleContext(ConjContext.class,0);
		}
		public ConjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterConj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitConj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitConj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjContext conj() throws RecognitionException {
		ConjContext _localctx = new ConjContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_conj);
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(AND);
				setState(196);
				comparaciones();
				setState(197);
				conj();
				}
				break;
			case PC:
			case PYC:
			case COMA:
			case INT:
			case CHAR:
			case DOUBLE:
			case VOID:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ComparacionesContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public ComparacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterComparaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitComparaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitComparaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionesContext comparaciones() throws RecognitionException {
		ComparacionesContext _localctx = new ComparacionesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_comparaciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			expresion();
			setState(203);
			comp();
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

	public static class CompContext extends ParserRuleContext {
		public OpcompContext opcomp() {
			return getRuleContext(OpcompContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_comp);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MENOR:
			case MENORIGUAL:
			case IGUALL:
			case MAYOR:
			case MAYORIGUAL:
			case DISTINTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				opcomp();
				setState(206);
				expresion();
				setState(207);
				comp();
				}
				break;
			case PC:
			case PYC:
			case COMA:
			case INT:
			case CHAR:
			case DOUBLE:
			case VOID:
			case OR:
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class OpcompContext extends ParserRuleContext {
		public TerminalNode IGUALL() { return getToken(compiladoresParser.IGUALL, 0); }
		public TerminalNode DISTINTO() { return getToken(compiladoresParser.DISTINTO, 0); }
		public TerminalNode MAYOR() { return getToken(compiladoresParser.MAYOR, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(compiladoresParser.MAYORIGUAL, 0); }
		public TerminalNode MENOR() { return getToken(compiladoresParser.MENOR, 0); }
		public TerminalNode MENORIGUAL() { return getToken(compiladoresParser.MENORIGUAL, 0); }
		public OpcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterOpcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitOpcomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitOpcomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcompContext opcomp() throws RecognitionException {
		OpcompContext _localctx = new OpcompContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_opcomp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOR) | (1L << MENORIGUAL) | (1L << IGUALL) | (1L << MAYOR) | (1L << MAYORIGUAL) | (1L << DISTINTO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ExpresionContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			termino();
			setState(215);
			exp();
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

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(compiladoresParser.SUMA, 0); }
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RESTA() { return getToken(compiladoresParser.RESTA, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_exp);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(SUMA);
				setState(218);
				termino();
				setState(219);
				exp();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(RESTA);
				setState(222);
				termino();
				setState(223);
				exp();
				}
				break;
			case PC:
			case PYC:
			case COMA:
			case MENOR:
			case MENORIGUAL:
			case IGUALL:
			case MAYOR:
			case MAYORIGUAL:
			case DISTINTO:
			case INT:
			case CHAR:
			case DOUBLE:
			case VOID:
			case OR:
			case AND:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TerminoContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			factor();
			setState(229);
			term();
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

	public static class TermContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(compiladoresParser.MULT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode DIV() { return getToken(compiladoresParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(compiladoresParser.MOD, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_term);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(MULT);
				setState(232);
				factor();
				setState(233);
				term();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(DIV);
				setState(236);
				factor();
				setState(237);
				term();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				match(MOD);
				setState(240);
				factor();
				setState(241);
				term();
				}
				break;
			case PC:
			case PYC:
			case COMA:
			case MENOR:
			case MENORIGUAL:
			case IGUALL:
			case MAYOR:
			case MAYORIGUAL:
			case DISTINTO:
			case SUMA:
			case RESTA:
			case INT:
			case CHAR:
			case DOUBLE:
			case VOID:
			case OR:
			case AND:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FactorContext extends ParserRuleContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public TerminalNode ENTERO() { return getToken(compiladoresParser.ENTERO, 0); }
		public TerminalNode DECIMAL() { return getToken(compiladoresParser.DECIMAL, 0); }
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_factor);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				f();
				setState(247);
				match(PA);
				setState(248);
				opal();
				setState(249);
				match(PC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				f();
				setState(252);
				match(ENTERO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				f();
				setState(255);
				match(DECIMAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
				f();
				setState(258);
				match(ID);
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

	public static class FContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(compiladoresParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(compiladoresParser.RESTA, 0); }
		public TerminalNode NOT() { return getToken(compiladoresParser.NOT, 0); }
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_f);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(SUMA);
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(RESTA);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				match(NOT);
				}
				break;
			case PA:
			case ENTERO:
			case DECIMAL:
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u010f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6_\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7h\n\7\3\b\3\b\3\b\3\b\5\bn\n\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0096\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00a5\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u00b1\n\22\3\23\3\23\3\24\3\24\5\24\u00b7\n\24\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u00c1\n\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u00cb\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u00d5\n\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u00e5\n\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u00f7\n\37\3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0107\n \3!\3!\3!\3!\5!\u010d\n"+
		"!\3!\2\2\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@\2\5\3\2\31\34\3\2\27\30\3\2\f\21\2\u010c\2B\3\2\2\2\4D\3\2\2\2\6"+
		"J\3\2\2\2\bL\3\2\2\2\n^\3\2\2\2\fg\3\2\2\2\16m\3\2\2\2\20o\3\2\2\2\22"+
		"q\3\2\2\2\24t\3\2\2\2\26v\3\2\2\2\30\u0081\3\2\2\2\32\u0095\3\2\2\2\34"+
		"\u0097\3\2\2\2\36\u00a4\3\2\2\2 \u00a6\3\2\2\2\"\u00b0\3\2\2\2$\u00b2"+
		"\3\2\2\2&\u00b6\3\2\2\2(\u00b8\3\2\2\2*\u00c0\3\2\2\2,\u00c2\3\2\2\2."+
		"\u00ca\3\2\2\2\60\u00cc\3\2\2\2\62\u00d4\3\2\2\2\64\u00d6\3\2\2\2\66\u00d8"+
		"\3\2\2\28\u00e4\3\2\2\2:\u00e6\3\2\2\2<\u00f6\3\2\2\2>\u0106\3\2\2\2@"+
		"\u010c\3\2\2\2BC\5\4\3\2C\3\3\2\2\2DE\5\6\4\2E\5\3\2\2\2FG\5\n\6\2GH\5"+
		"\6\4\2HK\3\2\2\2IK\3\2\2\2JF\3\2\2\2JI\3\2\2\2K\7\3\2\2\2LM\7\3\2\2MN"+
		"\5\6\4\2NO\7\4\2\2O\t\3\2\2\2PQ\5\f\7\2QR\7\t\2\2R_\3\2\2\2ST\5\22\n\2"+
		"TU\7\t\2\2U_\3\2\2\2V_\5\26\f\2W_\5\30\r\2X_\5\32\16\2Y_\5\34\17\2Z[\5"+
		" \21\2[\\\7\t\2\2\\_\3\2\2\2]_\5\b\5\2^P\3\2\2\2^S\3\2\2\2^V\3\2\2\2^"+
		"W\3\2\2\2^X\3\2\2\2^Y\3\2\2\2^Z\3\2\2\2^]\3\2\2\2_\13\3\2\2\2`a\5\20\t"+
		"\2ab\7&\2\2bh\3\2\2\2cd\5\20\t\2de\7&\2\2ef\5\16\b\2fh\3\2\2\2g`\3\2\2"+
		"\2gc\3\2\2\2h\r\3\2\2\2ij\7\13\2\2jn\5 \21\2kl\7\13\2\2ln\5$\23\2mi\3"+
		"\2\2\2mk\3\2\2\2n\17\3\2\2\2op\t\2\2\2p\21\3\2\2\2qr\7&\2\2rs\5\16\b\2"+
		"s\23\3\2\2\2tu\t\3\2\2u\25\3\2\2\2vw\7$\2\2wx\7\7\2\2xy\5\22\n\2yz\7\t"+
		"\2\2z{\5$\23\2{|\7\t\2\2|}\7&\2\2}~\5\24\13\2~\177\7\b\2\2\177\u0080\5"+
		"\n\6\2\u0080\27\3\2\2\2\u0081\u0082\7%\2\2\u0082\u0083\7\7\2\2\u0083\u0084"+
		"\5$\23\2\u0084\u0085\7\b\2\2\u0085\u0086\5\n\6\2\u0086\31\3\2\2\2\u0087"+
		"\u0088\7\"\2\2\u0088\u0089\7\7\2\2\u0089\u008a\5$\23\2\u008a\u008b\7\b"+
		"\2\2\u008b\u008c\5\n\6\2\u008c\u0096\3\2\2\2\u008d\u008e\7\"\2\2\u008e"+
		"\u008f\7\7\2\2\u008f\u0090\5$\23\2\u0090\u0091\7\b\2\2\u0091\u0092\5\n"+
		"\6\2\u0092\u0093\7#\2\2\u0093\u0094\5\n\6\2\u0094\u0096\3\2\2\2\u0095"+
		"\u0087\3\2\2\2\u0095\u008d\3\2\2\2\u0096\33\3\2\2\2\u0097\u0098\5\20\t"+
		"\2\u0098\u0099\7&\2\2\u0099\u009a\7\7\2\2\u009a\u009b\5\36\20\2\u009b"+
		"\u009c\7\b\2\2\u009c\u009d\5\b\5\2\u009d\35\3\2\2\2\u009e\u009f\5\f\7"+
		"\2\u009f\u00a0\5\36\20\2\u00a0\u00a5\3\2\2\2\u00a1\u00a2\7\n\2\2\u00a2"+
		"\u00a5\5\36\20\2\u00a3\u00a5\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4\u00a1\3"+
		"\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\37\3\2\2\2\u00a6\u00a7\7&\2\2\u00a7\u00a8"+
		"\7\7\2\2\u00a8\u00a9\5\"\22\2\u00a9\u00aa\7\b\2\2\u00aa!\3\2\2\2\u00ab"+
		"\u00ac\7&\2\2\u00ac\u00b1\5\"\22\2\u00ad\u00ae\7\n\2\2\u00ae\u00b1\5\""+
		"\22\2\u00af\u00b1\3\2\2\2\u00b0\u00ab\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b0"+
		"\u00af\3\2\2\2\u00b1#\3\2\2\2\u00b2\u00b3\5&\24\2\u00b3%\3\2\2\2\u00b4"+
		"\u00b7\5(\25\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2"+
		"\2\2\u00b7\'\3\2\2\2\u00b8\u00b9\5,\27\2\u00b9\u00ba\5*\26\2\u00ba)\3"+
		"\2\2\2\u00bb\u00bc\7\37\2\2\u00bc\u00bd\5,\27\2\u00bd\u00be\5*\26\2\u00be"+
		"\u00c1\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c0\u00bf\3\2"+
		"\2\2\u00c1+\3\2\2\2\u00c2\u00c3\5\60\31\2\u00c3\u00c4\5.\30\2\u00c4-\3"+
		"\2\2\2\u00c5\u00c6\7 \2\2\u00c6\u00c7\5\60\31\2\u00c7\u00c8\5.\30\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c5\3\2\2\2\u00ca\u00c9\3\2"+
		"\2\2\u00cb/\3\2\2\2\u00cc\u00cd\5\66\34\2\u00cd\u00ce\5\62\32\2\u00ce"+
		"\61\3\2\2\2\u00cf\u00d0\5\64\33\2\u00d0\u00d1\5\66\34\2\u00d1\u00d2\5"+
		"\62\32\2\u00d2\u00d5\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\63\3\2\2\2\u00d6\u00d7\t\4\2\2\u00d7\65\3\2\2\2\u00d8"+
		"\u00d9\5:\36\2\u00d9\u00da\58\35\2\u00da\67\3\2\2\2\u00db\u00dc\7\22\2"+
		"\2\u00dc\u00dd\5:\36\2\u00dd\u00de\58\35\2\u00de\u00e5\3\2\2\2\u00df\u00e0"+
		"\7\23\2\2\u00e0\u00e1\5:\36\2\u00e1\u00e2\58\35\2\u00e2\u00e5\3\2\2\2"+
		"\u00e3\u00e5\3\2\2\2\u00e4\u00db\3\2\2\2\u00e4\u00df\3\2\2\2\u00e4\u00e3"+
		"\3\2\2\2\u00e59\3\2\2\2\u00e6\u00e7\5> \2\u00e7\u00e8\5<\37\2\u00e8;\3"+
		"\2\2\2\u00e9\u00ea\7\24\2\2\u00ea\u00eb\5> \2\u00eb\u00ec\5<\37\2\u00ec"+
		"\u00f7\3\2\2\2\u00ed\u00ee\7\25\2\2\u00ee\u00ef\5> \2\u00ef\u00f0\5<\37"+
		"\2\u00f0\u00f7\3\2\2\2\u00f1\u00f2\7\26\2\2\u00f2\u00f3\5> \2\u00f3\u00f4"+
		"\5<\37\2\u00f4\u00f7\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00e9\3\2\2\2\u00f6"+
		"\u00ed\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7=\3\2\2\2"+
		"\u00f8\u00f9\5@!\2\u00f9\u00fa\7\7\2\2\u00fa\u00fb\5&\24\2\u00fb\u00fc"+
		"\7\b\2\2\u00fc\u0107\3\2\2\2\u00fd\u00fe\5@!\2\u00fe\u00ff\7\35\2\2\u00ff"+
		"\u0107\3\2\2\2\u0100\u0101\5@!\2\u0101\u0102\7\36\2\2\u0102\u0107\3\2"+
		"\2\2\u0103\u0104\5@!\2\u0104\u0105\7&\2\2\u0105\u0107\3\2\2\2\u0106\u00f8"+
		"\3\2\2\2\u0106\u00fd\3\2\2\2\u0106\u0100\3\2\2\2\u0106\u0103\3\2\2\2\u0107"+
		"?\3\2\2\2\u0108\u010d\7\22\2\2\u0109\u010d\7\23\2\2\u010a\u010d\7!\2\2"+
		"\u010b\u010d\3\2\2\2\u010c\u0108\3\2\2\2\u010c\u0109\3\2\2\2\u010c\u010a"+
		"\3\2\2\2\u010c\u010b\3\2\2\2\u010dA\3\2\2\2\21J^gm\u0095\u00a4\u00b0\u00b6"+
		"\u00c0\u00ca\u00d4\u00e4\u00f6\u0106\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}