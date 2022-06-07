// Generated from c:\Users\u005Cusuario\Desktop\u005Cubp\5to\TC\BaseCompiladores\src\main\java\compiladores\compiladores.g4 by ANTLR 4.9.2

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
		DOUBLE=25, VOID=26, FLOAT=27, ENTERO=28, DECIMAL=29, OR=30, AND=31, NOT=32, 
		IF_=33, ELSE_=34, FOR_=35, WHILE_=36, RETURN=37, ID=38, WS=39, OTRO=40;
	public static final int
		RULE_programa = 0, RULE_instrucciones = 1, RULE_bloque = 2, RULE_puntocoma = 3, 
		RULE_instruccion = 4, RULE_verificador = 5, RULE_declaracion = 6, RULE_tipo_de_datos = 7, 
		RULE_asignacion_simple = 8, RULE_asignacion = 9, RULE_opal = 10, RULE_exp = 11, 
		RULE_e = 12, RULE_term = 13, RULE_t = 14, RULE_factor = 15, RULE_logico_comp = 16, 
		RULE_comparacion = 17, RULE_comp = 18, RULE_bloque_estructuras_de_control = 19, 
		RULE_pos_pre_incremento = 20, RULE_bloque_for = 21, RULE_iwhile = 22, 
		RULE_iif = 23, RULE_ifor = 24, RULE_una_o_mas_variables = 25, RULE_tipo_de_funcion = 26, 
		RULE_funcion = 27, RULE_declaracion_funcion = 28, RULE_definicion_funcion = 29, 
		RULE_param_declaracion = 30, RULE_param_definicion = 31, RULE_finalizar_con_return = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones", "bloque", "puntocoma", "instruccion", "verificador", 
			"declaracion", "tipo_de_datos", "asignacion_simple", "asignacion", "opal", 
			"exp", "e", "term", "t", "factor", "logico_comp", "comparacion", "comp", 
			"bloque_estructuras_de_control", "pos_pre_incremento", "bloque_for", 
			"iwhile", "iif", "ifor", "una_o_mas_variables", "tipo_de_funcion", "funcion", 
			"declaracion_funcion", "definicion_funcion", "param_declaracion", "param_definicion", 
			"finalizar_con_return"
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
		enterRule(_localctx, 0, RULE_programa);
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
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
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
		enterRule(_localctx, 2, RULE_instrucciones);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case FLOAT:
			case IF_:
			case FOR_:
			case WHILE_:
			case RETURN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				instruccion();
				setState(69);
				instrucciones();
				}
				break;
			case LA:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				bloque();
				setState(72);
				instrucciones();
				}
				break;
			case EOF:
			case LC:
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
		enterRule(_localctx, 4, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(LA);
			setState(78);
			instrucciones();
			setState(79);
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

	public static class PuntocomaContext extends ParserRuleContext {
		public TerminalNode PYC() { return getToken(compiladoresParser.PYC, 0); }
		public PuntocomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puntocoma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterPuntocoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitPuntocoma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitPuntocoma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuntocomaContext puntocoma() throws RecognitionException {
		PuntocomaContext _localctx = new PuntocomaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_puntocoma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(PYC);
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
		public IwhileContext iwhile() {
			return getRuleContext(IwhileContext.class,0);
		}
		public IifContext iif() {
			return getRuleContext(IifContext.class,0);
		}
		public IforContext ifor() {
			return getRuleContext(IforContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public Declaracion_funcionContext declaracion_funcion() {
			return getRuleContext(Declaracion_funcionContext.class,0);
		}
		public Definicion_funcionContext definicion_funcion() {
			return getRuleContext(Definicion_funcionContext.class,0);
		}
		public Finalizar_con_returnContext finalizar_con_return() {
			return getRuleContext(Finalizar_con_returnContext.class,0);
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
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				declaracion();
				setState(84);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				asignacion();
				setState(87);
				match(PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				iwhile();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				iif();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				ifor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				funcion();
				setState(93);
				match(PYC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(95);
				declaracion_funcion();
				setState(96);
				match(PYC);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(98);
				definicion_funcion();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(99);
				finalizar_con_return();
				setState(100);
				match(PYC);
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

	public static class VerificadorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode ENTERO() { return getToken(compiladoresParser.ENTERO, 0); }
		public VerificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterVerificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitVerificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitVerificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerificadorContext verificador() throws RecognitionException {
		VerificadorContext _localctx = new VerificadorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_verificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !(_la==ENTERO || _la==ID) ) {
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

	public static class DeclaracionContext extends ParserRuleContext {
		public Tipo_de_datosContext tipo_de_datos() {
			return getRuleContext(Tipo_de_datosContext.class,0);
		}
		public Asignacion_simpleContext asignacion_simple() {
			return getRuleContext(Asignacion_simpleContext.class,0);
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
		enterRule(_localctx, 12, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			tipo_de_datos();
			setState(107);
			asignacion_simple();
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

	public static class Tipo_de_datosContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(compiladoresParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(compiladoresParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(compiladoresParser.FLOAT, 0); }
		public Tipo_de_datosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_de_datos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterTipo_de_datos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitTipo_de_datos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitTipo_de_datos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_de_datosContext tipo_de_datos() throws RecognitionException {
		Tipo_de_datosContext _localctx = new Tipo_de_datosContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo_de_datos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT))) != 0)) ) {
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

	public static class Asignacion_simpleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(compiladoresParser.IGUAL, 0); }
		public VerificadorContext verificador() {
			return getRuleContext(VerificadorContext.class,0);
		}
		public TerminalNode COMA() { return getToken(compiladoresParser.COMA, 0); }
		public Asignacion_simpleContext asignacion_simple() {
			return getRuleContext(Asignacion_simpleContext.class,0);
		}
		public Asignacion_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterAsignacion_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitAsignacion_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitAsignacion_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asignacion_simpleContext asignacion_simple() throws RecognitionException {
		Asignacion_simpleContext _localctx = new Asignacion_simpleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asignacion_simple);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(ID);
				setState(112);
				match(IGUAL);
				setState(113);
				verificador();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(ID);
				setState(116);
				match(COMA);
				setState(117);
				asignacion_simple();
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(compiladoresParser.IGUAL, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
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
		enterRule(_localctx, 18, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(ID);
			setState(121);
			match(IGUAL);
			setState(122);
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
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
		enterRule(_localctx, 20, RULE_opal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			term();
			setState(127);
			e();
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

	public static class EContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(compiladoresParser.SUMA, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode RESTA() { return getToken(compiladoresParser.RESTA, 0); }
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_e);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(SUMA);
				setState(130);
				term();
				setState(131);
				e();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(RESTA);
				setState(134);
				term();
				setState(135);
				e();
				}
				break;
			case PC:
			case PYC:
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			factor();
			setState(141);
			t();
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

	public static class TContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(compiladoresParser.MULT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TerminalNode DIV() { return getToken(compiladoresParser.DIV, 0); }
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_t);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(MULT);
				setState(144);
				factor();
				setState(145);
				t();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(DIV);
				setState(148);
				factor();
				setState(149);
				t();
				}
				break;
			case PC:
			case PYC:
			case SUMA:
			case RESTA:
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode ENTERO() { return getToken(compiladoresParser.ENTERO, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
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
		enterRule(_localctx, 30, RULE_factor);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(ID);
				}
				break;
			case ENTERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(ENTERO);
				}
				break;
			case PA:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(PA);
				setState(157);
				exp();
				setState(158);
				match(PC);
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

	public static class Logico_compContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(compiladoresParser.OR, 0); }
		public TerminalNode AND() { return getToken(compiladoresParser.AND, 0); }
		public Logico_compContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logico_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterLogico_comp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitLogico_comp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitLogico_comp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logico_compContext logico_comp() throws RecognitionException {
		Logico_compContext _localctx = new Logico_compContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logico_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !(_la==OR || _la==AND) ) {
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

	public static class ComparacionContext extends ParserRuleContext {
		public TerminalNode MAYOR() { return getToken(compiladoresParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(compiladoresParser.MENOR, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(compiladoresParser.MAYORIGUAL, 0); }
		public TerminalNode MENORIGUAL() { return getToken(compiladoresParser.MENORIGUAL, 0); }
		public TerminalNode IGUALL() { return getToken(compiladoresParser.IGUALL, 0); }
		public TerminalNode DISTINTO() { return getToken(compiladoresParser.DISTINTO, 0); }
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
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

	public static class CompContext extends ParserRuleContext {
		public VerificadorContext verificador() {
			return getRuleContext(VerificadorContext.class,0);
		}
		public Logico_compContext logico_comp() {
			return getRuleContext(Logico_compContext.class,0);
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
		enterRule(_localctx, 36, RULE_comp);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				verificador();
				setState(167);
				logico_comp();
				setState(168);
				comp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				verificador();
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

	public static class Bloque_estructuras_de_controlContext extends ParserRuleContext {
		public List<VerificadorContext> verificador() {
			return getRuleContexts(VerificadorContext.class);
		}
		public VerificadorContext verificador(int i) {
			return getRuleContext(VerificadorContext.class,i);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public Bloque_estructuras_de_controlContext bloque_estructuras_de_control() {
			return getRuleContext(Bloque_estructuras_de_controlContext.class,0);
		}
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public Logico_compContext logico_comp() {
			return getRuleContext(Logico_compContext.class,0);
		}
		public Bloque_estructuras_de_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_estructuras_de_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterBloque_estructuras_de_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitBloque_estructuras_de_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitBloque_estructuras_de_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_estructuras_de_controlContext bloque_estructuras_de_control() throws RecognitionException {
		Bloque_estructuras_de_controlContext _localctx = new Bloque_estructuras_de_controlContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bloque_estructuras_de_control);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				verificador();
				setState(174);
				comparacion();
				setState(175);
				verificador();
				setState(176);
				bloque_estructuras_de_control();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(PA);
				setState(179);
				comp();
				setState(180);
				comparacion();
				setState(181);
				verificador();
				setState(182);
				bloque_estructuras_de_control();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				match(PA);
				setState(185);
				comp();
				setState(186);
				bloque_estructuras_de_control();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				match(PC);
				setState(189);
				comparacion();
				setState(190);
				verificador();
				setState(191);
				bloque_estructuras_de_control();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(193);
				match(PC);
				setState(194);
				logico_comp();
				setState(195);
				bloque_estructuras_de_control();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(197);
				match(PC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(198);
				logico_comp();
				setState(199);
				bloque_estructuras_de_control();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
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

	public static class Pos_pre_incrementoContext extends ParserRuleContext {
		public VerificadorContext verificador() {
			return getRuleContext(VerificadorContext.class,0);
		}
		public List<TerminalNode> SUMA() { return getTokens(compiladoresParser.SUMA); }
		public TerminalNode SUMA(int i) {
			return getToken(compiladoresParser.SUMA, i);
		}
		public TerminalNode MENOSMENOS() { return getToken(compiladoresParser.MENOSMENOS, 0); }
		public TerminalNode MASMAS() { return getToken(compiladoresParser.MASMAS, 0); }
		public Pos_pre_incrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pos_pre_incremento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterPos_pre_incremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitPos_pre_incremento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitPos_pre_incremento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pos_pre_incrementoContext pos_pre_incremento() throws RecognitionException {
		Pos_pre_incrementoContext _localctx = new Pos_pre_incrementoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pos_pre_incremento);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				verificador();
				setState(205);
				match(SUMA);
				setState(206);
				match(SUMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				verificador();
				setState(209);
				match(MENOSMENOS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(MASMAS);
				setState(212);
				verificador();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				match(MENOSMENOS);
				setState(214);
				verificador();
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

	public static class Bloque_forContext extends ParserRuleContext {
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public List<TerminalNode> PYC() { return getTokens(compiladoresParser.PYC); }
		public TerminalNode PYC(int i) {
			return getToken(compiladoresParser.PYC, i);
		}
		public Bloque_estructuras_de_controlContext bloque_estructuras_de_control() {
			return getRuleContext(Bloque_estructuras_de_controlContext.class,0);
		}
		public Pos_pre_incrementoContext pos_pre_incremento() {
			return getRuleContext(Pos_pre_incrementoContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Bloque_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterBloque_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitBloque_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitBloque_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_forContext bloque_for() throws RecognitionException {
		Bloque_forContext _localctx = new Bloque_forContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bloque_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(PA);
			{
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case FLOAT:
				{
				setState(218);
				declaracion();
				}
				break;
			case ID:
				{
				setState(219);
				asignacion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(222);
			match(PYC);
			setState(223);
			bloque_estructuras_de_control();
			setState(224);
			match(PYC);
			setState(225);
			pos_pre_incremento();
			}
			setState(227);
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

	public static class IwhileContext extends ParserRuleContext {
		public TerminalNode WHILE_() { return getToken(compiladoresParser.WHILE_, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public Bloque_estructuras_de_controlContext bloque_estructuras_de_control() {
			return getRuleContext(Bloque_estructuras_de_controlContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public IwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterIwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitIwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitIwhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IwhileContext iwhile() throws RecognitionException {
		IwhileContext _localctx = new IwhileContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_iwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(WHILE_);
			setState(230);
			match(PA);
			setState(231);
			bloque_estructuras_de_control();
			setState(232);
			match(PC);
			setState(233);
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

	public static class IifContext extends ParserRuleContext {
		public TerminalNode IF_() { return getToken(compiladoresParser.IF_, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public Bloque_estructuras_de_controlContext bloque_estructuras_de_control() {
			return getRuleContext(Bloque_estructuras_de_controlContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public IifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterIif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitIif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitIif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IifContext iif() throws RecognitionException {
		IifContext _localctx = new IifContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_iif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(IF_);
			setState(236);
			match(PA);
			setState(237);
			bloque_estructuras_de_control();
			setState(238);
			match(PC);
			setState(239);
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

	public static class IforContext extends ParserRuleContext {
		public TerminalNode FOR_() { return getToken(compiladoresParser.FOR_, 0); }
		public Bloque_forContext bloque_for() {
			return getRuleContext(Bloque_forContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public IforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterIfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitIfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitIfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IforContext ifor() throws RecognitionException {
		IforContext _localctx = new IforContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ifor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(FOR_);
			setState(242);
			bloque_for();
			setState(243);
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

	public static class Una_o_mas_variablesContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public Una_o_mas_variablesContext una_o_mas_variables() {
			return getRuleContext(Una_o_mas_variablesContext.class,0);
		}
		public Una_o_mas_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_una_o_mas_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterUna_o_mas_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitUna_o_mas_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitUna_o_mas_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Una_o_mas_variablesContext una_o_mas_variables() throws RecognitionException {
		Una_o_mas_variablesContext _localctx = new Una_o_mas_variablesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_una_o_mas_variables);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				declaracion();
				setState(246);
				una_o_mas_variables();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				declaracion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Tipo_de_funcionContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(compiladoresParser.VOID, 0); }
		public Tipo_de_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_de_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterTipo_de_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitTipo_de_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitTipo_de_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_de_funcionContext tipo_de_funcion() throws RecognitionException {
		Tipo_de_funcionContext _localctx = new Tipo_de_funcionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tipo_de_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(VOID);
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
		public Tipo_de_datosContext tipo_de_datos() {
			return getRuleContext(Tipo_de_datosContext.class,0);
		}
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public Una_o_mas_variablesContext una_o_mas_variables() {
			return getRuleContext(Una_o_mas_variablesContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
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
		enterRule(_localctx, 54, RULE_funcion);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				tipo_de_datos();
				setState(255);
				match(ID);
				setState(256);
				match(PA);
				setState(257);
				una_o_mas_variables();
				setState(258);
				match(PC);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(ID);
				setState(261);
				match(PA);
				setState(262);
				match(PC);
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

	public static class Declaracion_funcionContext extends ParserRuleContext {
		public Tipo_de_datosContext tipo_de_datos() {
			return getRuleContext(Tipo_de_datosContext.class,0);
		}
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public Param_declaracionContext param_declaracion() {
			return getRuleContext(Param_declaracionContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public Declaracion_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterDeclaracion_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitDeclaracion_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitDeclaracion_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_funcionContext declaracion_funcion() throws RecognitionException {
		Declaracion_funcionContext _localctx = new Declaracion_funcionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_declaracion_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			tipo_de_datos();
			setState(266);
			match(ID);
			setState(267);
			match(PA);
			setState(268);
			param_declaracion();
			setState(269);
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

	public static class Definicion_funcionContext extends ParserRuleContext {
		public Tipo_de_datosContext tipo_de_datos() {
			return getRuleContext(Tipo_de_datosContext.class,0);
		}
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public Param_definicionContext param_definicion() {
			return getRuleContext(Param_definicionContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Definicion_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterDefinicion_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitDefinicion_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitDefinicion_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definicion_funcionContext definicion_funcion() throws RecognitionException {
		Definicion_funcionContext _localctx = new Definicion_funcionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_definicion_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			tipo_de_datos();
			setState(272);
			match(ID);
			setState(273);
			match(PA);
			setState(274);
			param_definicion();
			setState(275);
			match(PC);
			setState(276);
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

	public static class Param_declaracionContext extends ParserRuleContext {
		public Tipo_de_datosContext tipo_de_datos() {
			return getRuleContext(Tipo_de_datosContext.class,0);
		}
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode COMA() { return getToken(compiladoresParser.COMA, 0); }
		public Param_declaracionContext param_declaracion() {
			return getRuleContext(Param_declaracionContext.class,0);
		}
		public Param_declaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterParam_declaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitParam_declaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitParam_declaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_declaracionContext param_declaracion() throws RecognitionException {
		Param_declaracionContext _localctx = new Param_declaracionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_param_declaracion);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				tipo_de_datos();
				setState(281);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(279);
					match(ID);
					}
					break;
				case PC:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				tipo_de_datos();
				setState(286);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(284);
					match(ID);
					}
					break;
				case COMA:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(288);
				match(COMA);
				setState(289);
				param_declaracion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Param_definicionContext extends ParserRuleContext {
		public Tipo_de_datosContext tipo_de_datos() {
			return getRuleContext(Tipo_de_datosContext.class,0);
		}
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode COMA() { return getToken(compiladoresParser.COMA, 0); }
		public Param_definicionContext param_definicion() {
			return getRuleContext(Param_definicionContext.class,0);
		}
		public Param_definicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_definicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterParam_definicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitParam_definicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitParam_definicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_definicionContext param_definicion() throws RecognitionException {
		Param_definicionContext _localctx = new Param_definicionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_param_definicion);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				tipo_de_datos();
				setState(295);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				tipo_de_datos();
				setState(298);
				match(ID);
				setState(299);
				match(COMA);
				setState(300);
				param_definicion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Finalizar_con_returnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(compiladoresParser.RETURN, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Finalizar_con_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalizar_con_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterFinalizar_con_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitFinalizar_con_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitFinalizar_con_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Finalizar_con_returnContext finalizar_con_return() throws RecognitionException {
		Finalizar_con_returnContext _localctx = new Finalizar_con_returnContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_finalizar_con_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(RETURN);
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case ENTERO:
			case ID:
				{
				setState(306);
				term();
				}
				break;
			case PYC:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u0139\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3N\n\3\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6i\n\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\ny\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008d\n\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u009b\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00a3\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u00ae\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u00cd\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u00da\n\26\3\27\3\27\3\27\5\27\u00df\n"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\5\33\u00fd\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u010a\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \5 \u011c\n \3 \3 \3 \5 \u0121\n \3 \3 \3 \3 "+
		"\5 \u0127\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0132\n!\3\"\3\"\3\"\5\"\u0137"+
		"\n\"\3\"\2\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@B\2\6\4\2\36\36((\5\2\31\31\33\33\35\35\3\2 !\3\2\f\21\2\u013f"+
		"\2D\3\2\2\2\4M\3\2\2\2\6O\3\2\2\2\bS\3\2\2\2\nh\3\2\2\2\fj\3\2\2\2\16"+
		"l\3\2\2\2\20o\3\2\2\2\22x\3\2\2\2\24z\3\2\2\2\26~\3\2\2\2\30\u0080\3\2"+
		"\2\2\32\u008c\3\2\2\2\34\u008e\3\2\2\2\36\u009a\3\2\2\2 \u00a2\3\2\2\2"+
		"\"\u00a4\3\2\2\2$\u00a6\3\2\2\2&\u00ad\3\2\2\2(\u00cc\3\2\2\2*\u00d9\3"+
		"\2\2\2,\u00db\3\2\2\2.\u00e7\3\2\2\2\60\u00ed\3\2\2\2\62\u00f3\3\2\2\2"+
		"\64\u00fc\3\2\2\2\66\u00fe\3\2\2\28\u0109\3\2\2\2:\u010b\3\2\2\2<\u0111"+
		"\3\2\2\2>\u0126\3\2\2\2@\u0131\3\2\2\2B\u0133\3\2\2\2DE\5\4\3\2E\3\3\2"+
		"\2\2FG\5\n\6\2GH\5\4\3\2HN\3\2\2\2IJ\5\6\4\2JK\5\4\3\2KN\3\2\2\2LN\3\2"+
		"\2\2MF\3\2\2\2MI\3\2\2\2ML\3\2\2\2N\5\3\2\2\2OP\7\3\2\2PQ\5\4\3\2QR\7"+
		"\4\2\2R\7\3\2\2\2ST\7\t\2\2T\t\3\2\2\2UV\5\16\b\2VW\7\t\2\2Wi\3\2\2\2"+
		"XY\5\24\13\2YZ\7\t\2\2Zi\3\2\2\2[i\5.\30\2\\i\5\60\31\2]i\5\62\32\2^_"+
		"\58\35\2_`\7\t\2\2`i\3\2\2\2ab\5:\36\2bc\7\t\2\2ci\3\2\2\2di\5<\37\2e"+
		"f\5B\"\2fg\7\t\2\2gi\3\2\2\2hU\3\2\2\2hX\3\2\2\2h[\3\2\2\2h\\\3\2\2\2"+
		"h]\3\2\2\2h^\3\2\2\2ha\3\2\2\2hd\3\2\2\2he\3\2\2\2i\13\3\2\2\2jk\t\2\2"+
		"\2k\r\3\2\2\2lm\5\20\t\2mn\5\22\n\2n\17\3\2\2\2op\t\3\2\2p\21\3\2\2\2"+
		"qr\7(\2\2rs\7\13\2\2sy\5\f\7\2ty\7(\2\2uv\7(\2\2vw\7\n\2\2wy\5\22\n\2"+
		"xq\3\2\2\2xt\3\2\2\2xu\3\2\2\2y\23\3\2\2\2z{\7(\2\2{|\7\13\2\2|}\5\26"+
		"\f\2}\25\3\2\2\2~\177\5\30\r\2\177\27\3\2\2\2\u0080\u0081\5\34\17\2\u0081"+
		"\u0082\5\32\16\2\u0082\31\3\2\2\2\u0083\u0084\7\22\2\2\u0084\u0085\5\34"+
		"\17\2\u0085\u0086\5\32\16\2\u0086\u008d\3\2\2\2\u0087\u0088\7\23\2\2\u0088"+
		"\u0089\5\34\17\2\u0089\u008a\5\32\16\2\u008a\u008d\3\2\2\2\u008b\u008d"+
		"\3\2\2\2\u008c\u0083\3\2\2\2\u008c\u0087\3\2\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\33\3\2\2\2\u008e\u008f\5 \21\2\u008f\u0090\5\36\20\2\u0090\35\3\2\2\2"+
		"\u0091\u0092\7\24\2\2\u0092\u0093\5 \21\2\u0093\u0094\5\36\20\2\u0094"+
		"\u009b\3\2\2\2\u0095\u0096\7\25\2\2\u0096\u0097\5 \21\2\u0097\u0098\5"+
		"\36\20\2\u0098\u009b\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0091\3\2\2\2\u009a"+
		"\u0095\3\2\2\2\u009a\u0099\3\2\2\2\u009b\37\3\2\2\2\u009c\u00a3\7(\2\2"+
		"\u009d\u00a3\7\36\2\2\u009e\u009f\7\7\2\2\u009f\u00a0\5\30\r\2\u00a0\u00a1"+
		"\7\b\2\2\u00a1\u00a3\3\2\2\2\u00a2\u009c\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2"+
		"\u009e\3\2\2\2\u00a3!\3\2\2\2\u00a4\u00a5\t\4\2\2\u00a5#\3\2\2\2\u00a6"+
		"\u00a7\t\5\2\2\u00a7%\3\2\2\2\u00a8\u00a9\5\f\7\2\u00a9\u00aa\5\"\22\2"+
		"\u00aa\u00ab\5&\24\2\u00ab\u00ae\3\2\2\2\u00ac\u00ae\5\f\7\2\u00ad\u00a8"+
		"\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\'\3\2\2\2\u00af\u00b0\5\f\7\2\u00b0"+
		"\u00b1\5$\23\2\u00b1\u00b2\5\f\7\2\u00b2\u00b3\5(\25\2\u00b3\u00cd\3\2"+
		"\2\2\u00b4\u00b5\7\7\2\2\u00b5\u00b6\5&\24\2\u00b6\u00b7\5$\23\2\u00b7"+
		"\u00b8\5\f\7\2\u00b8\u00b9\5(\25\2\u00b9\u00cd\3\2\2\2\u00ba\u00bb\7\7"+
		"\2\2\u00bb\u00bc\5&\24\2\u00bc\u00bd\5(\25\2\u00bd\u00cd\3\2\2\2\u00be"+
		"\u00bf\7\b\2\2\u00bf\u00c0\5$\23\2\u00c0\u00c1\5\f\7\2\u00c1\u00c2\5("+
		"\25\2\u00c2\u00cd\3\2\2\2\u00c3\u00c4\7\b\2\2\u00c4\u00c5\5\"\22\2\u00c5"+
		"\u00c6\5(\25\2\u00c6\u00cd\3\2\2\2\u00c7\u00cd\7\b\2\2\u00c8\u00c9\5\""+
		"\22\2\u00c9\u00ca\5(\25\2\u00ca\u00cd\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00af\3\2\2\2\u00cc\u00b4\3\2\2\2\u00cc\u00ba\3\2\2\2\u00cc\u00be\3\2"+
		"\2\2\u00cc\u00c3\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd)\3\2\2\2\u00ce\u00cf\5\f\7\2\u00cf\u00d0\7\22\2\2"+
		"\u00d0\u00d1\7\22\2\2\u00d1\u00da\3\2\2\2\u00d2\u00d3\5\f\7\2\u00d3\u00d4"+
		"\7\30\2\2\u00d4\u00da\3\2\2\2\u00d5\u00d6\7\27\2\2\u00d6\u00da\5\f\7\2"+
		"\u00d7\u00d8\7\30\2\2\u00d8\u00da\5\f\7\2\u00d9\u00ce\3\2\2\2\u00d9\u00d2"+
		"\3\2\2\2\u00d9\u00d5\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da+\3\2\2\2\u00db"+
		"\u00de\7\7\2\2\u00dc\u00df\5\16\b\2\u00dd\u00df\5\24\13\2\u00de\u00dc"+
		"\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\7\t\2\2\u00e1"+
		"\u00e2\5(\25\2\u00e2\u00e3\7\t\2\2\u00e3\u00e4\5*\26\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\u00e6\7\b\2\2\u00e6-\3\2\2\2\u00e7\u00e8\7&\2\2\u00e8\u00e9"+
		"\7\7\2\2\u00e9\u00ea\5(\25\2\u00ea\u00eb\7\b\2\2\u00eb\u00ec\5\6\4\2\u00ec"+
		"/\3\2\2\2\u00ed\u00ee\7#\2\2\u00ee\u00ef\7\7\2\2\u00ef\u00f0\5(\25\2\u00f0"+
		"\u00f1\7\b\2\2\u00f1\u00f2\5\6\4\2\u00f2\61\3\2\2\2\u00f3\u00f4\7%\2\2"+
		"\u00f4\u00f5\5,\27\2\u00f5\u00f6\5\6\4\2\u00f6\63\3\2\2\2\u00f7\u00f8"+
		"\5\16\b\2\u00f8\u00f9\5\64\33\2\u00f9\u00fd\3\2\2\2\u00fa\u00fd\5\16\b"+
		"\2\u00fb\u00fd\3\2\2\2\u00fc\u00f7\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb"+
		"\3\2\2\2\u00fd\65\3\2\2\2\u00fe\u00ff\7\34\2\2\u00ff\67\3\2\2\2\u0100"+
		"\u0101\5\20\t\2\u0101\u0102\7(\2\2\u0102\u0103\7\7\2\2\u0103\u0104\5\64"+
		"\33\2\u0104\u0105\7\b\2\2\u0105\u010a\3\2\2\2\u0106\u0107\7(\2\2\u0107"+
		"\u0108\7\7\2\2\u0108\u010a\7\b\2\2\u0109\u0100\3\2\2\2\u0109\u0106\3\2"+
		"\2\2\u010a9\3\2\2\2\u010b\u010c\5\20\t\2\u010c\u010d\7(\2\2\u010d\u010e"+
		"\7\7\2\2\u010e\u010f\5> \2\u010f\u0110\7\b\2\2\u0110;\3\2\2\2\u0111\u0112"+
		"\5\20\t\2\u0112\u0113\7(\2\2\u0113\u0114\7\7\2\2\u0114\u0115\5@!\2\u0115"+
		"\u0116\7\b\2\2\u0116\u0117\5\6\4\2\u0117=\3\2\2\2\u0118\u011b\5\20\t\2"+
		"\u0119\u011c\7(\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011a"+
		"\3\2\2\2\u011c\u0127\3\2\2\2\u011d\u0120\5\20\t\2\u011e\u0121\7(\2\2\u011f"+
		"\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\u0123\7\n\2\2\u0123\u0124\5> \2\u0124\u0127\3\2\2\2\u0125\u0127"+
		"\3\2\2\2\u0126\u0118\3\2\2\2\u0126\u011d\3\2\2\2\u0126\u0125\3\2\2\2\u0127"+
		"?\3\2\2\2\u0128\u0129\5\20\t\2\u0129\u012a\7(\2\2\u012a\u0132\3\2\2\2"+
		"\u012b\u012c\5\20\t\2\u012c\u012d\7(\2\2\u012d\u012e\7\n\2\2\u012e\u012f"+
		"\5@!\2\u012f\u0132\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u0128\3\2\2\2\u0131"+
		"\u012b\3\2\2\2\u0131\u0130\3\2\2\2\u0132A\3\2\2\2\u0133\u0136\7\'\2\2"+
		"\u0134\u0137\5\34\17\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0135"+
		"\3\2\2\2\u0137C\3\2\2\2\23Mhx\u008c\u009a\u00a2\u00ad\u00cc\u00d9\u00de"+
		"\u00fc\u0109\u011b\u0120\u0126\u0131\u0136";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}