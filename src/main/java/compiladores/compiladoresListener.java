// Generated from c:\Users\u005Cusuario\Desktop\u005Cubp\5to\TC\BaseCompiladores\src\main\java\compiladores\compiladores.g4 by ANTLR 4.8

package compiladores;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiladoresParser}.
 */
public interface compiladoresListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(compiladoresParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(compiladoresParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#asign}.
	 * @param ctx the parse tree
	 */
	void enterAsign(compiladoresParser.AsignContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#asign}.
	 * @param ctx the parse tree
	 */
	void exitAsign(compiladoresParser.AsignContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#tipodato}.
	 * @param ctx the parse tree
	 */
	void enterTipodato(compiladoresParser.TipodatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#tipodato}.
	 * @param ctx the parse tree
	 */
	void exitTipodato(compiladoresParser.TipodatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#ciclofor}.
	 * @param ctx the parse tree
	 */
	void enterCiclofor(compiladoresParser.CicloforContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#ciclofor}.
	 * @param ctx the parse tree
	 */
	void exitCiclofor(compiladoresParser.CicloforContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#ciclowhile}.
	 * @param ctx the parse tree
	 */
	void enterCiclowhile(compiladoresParser.CiclowhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#ciclowhile}.
	 * @param ctx the parse tree
	 */
	void exitCiclowhile(compiladoresParser.CiclowhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#condif}.
	 * @param ctx the parse tree
	 */
	void enterCondif(compiladoresParser.CondifContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#condif}.
	 * @param ctx the parse tree
	 */
	void exitCondif(compiladoresParser.CondifContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(compiladoresParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(compiladoresParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(compiladoresParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(compiladoresParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_funcion(compiladoresParser.Llamada_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_funcion(compiladoresParser.Llamada_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(compiladoresParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(compiladoresParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(compiladoresParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(compiladoresParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#opal}.
	 * @param ctx the parse tree
	 */
	void enterOpal(compiladoresParser.OpalContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#opal}.
	 * @param ctx the parse tree
	 */
	void exitOpal(compiladoresParser.OpalContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#disyuncion}.
	 * @param ctx the parse tree
	 */
	void enterDisyuncion(compiladoresParser.DisyuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#disyuncion}.
	 * @param ctx the parse tree
	 */
	void exitDisyuncion(compiladoresParser.DisyuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#disy}.
	 * @param ctx the parse tree
	 */
	void enterDisy(compiladoresParser.DisyContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#disy}.
	 * @param ctx the parse tree
	 */
	void exitDisy(compiladoresParser.DisyContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#conjuncion}.
	 * @param ctx the parse tree
	 */
	void enterConjuncion(compiladoresParser.ConjuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#conjuncion}.
	 * @param ctx the parse tree
	 */
	void exitConjuncion(compiladoresParser.ConjuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#conj}.
	 * @param ctx the parse tree
	 */
	void enterConj(compiladoresParser.ConjContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#conj}.
	 * @param ctx the parse tree
	 */
	void exitConj(compiladoresParser.ConjContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#comparaciones}.
	 * @param ctx the parse tree
	 */
	void enterComparaciones(compiladoresParser.ComparacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#comparaciones}.
	 * @param ctx the parse tree
	 */
	void exitComparaciones(compiladoresParser.ComparacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(compiladoresParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(compiladoresParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#opcomp}.
	 * @param ctx the parse tree
	 */
	void enterOpcomp(compiladoresParser.OpcompContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#opcomp}.
	 * @param ctx the parse tree
	 */
	void exitOpcomp(compiladoresParser.OpcompContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(compiladoresParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(compiladoresParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(compiladoresParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(compiladoresParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(compiladoresParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(compiladoresParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(compiladoresParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(compiladoresParser.FContext ctx);
}