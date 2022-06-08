// Generated from c:\Users\u005Cusuario\Desktop\u005Cubp\5to\TC\BaseCompiladores\src\main\java\compiladores\compiladores.g4 by ANTLR 4.9.2

package compiladores;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiladoresParser}.
 */
public interface compiladoresListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link compiladoresParser#puntocoma}.
	 * @param ctx the parse tree
	 */
	void enterPuntocoma(compiladoresParser.PuntocomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#puntocoma}.
	 * @param ctx the parse tree
	 */
	void exitPuntocoma(compiladoresParser.PuntocomaContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#verificador}.
	 * @param ctx the parse tree
	 */
	void enterVerificador(compiladoresParser.VerificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#verificador}.
	 * @param ctx the parse tree
	 */
	void exitVerificador(compiladoresParser.VerificadorContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#tipo_de_datos}.
	 * @param ctx the parse tree
	 */
	void enterTipo_de_datos(compiladoresParser.Tipo_de_datosContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#tipo_de_datos}.
	 * @param ctx the parse tree
	 */
	void exitTipo_de_datos(compiladoresParser.Tipo_de_datosContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#asignacion_simple}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_simple(compiladoresParser.Asignacion_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#asignacion_simple}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_simple(compiladoresParser.Asignacion_simpleContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(compiladoresParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(compiladoresParser.EContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(compiladoresParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(compiladoresParser.TContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#logico_comp}.
	 * @param ctx the parse tree
	 */
	void enterLogico_comp(compiladoresParser.Logico_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#logico_comp}.
	 * @param ctx the parse tree
	 */
	void exitLogico_comp(compiladoresParser.Logico_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(compiladoresParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(compiladoresParser.ComparacionContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#bloque_estructuras_de_control}.
	 * @param ctx the parse tree
	 */
	void enterBloque_estructuras_de_control(compiladoresParser.Bloque_estructuras_de_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#bloque_estructuras_de_control}.
	 * @param ctx the parse tree
	 */
	void exitBloque_estructuras_de_control(compiladoresParser.Bloque_estructuras_de_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#pos_pre_incremento}.
	 * @param ctx the parse tree
	 */
	void enterPos_pre_incremento(compiladoresParser.Pos_pre_incrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#pos_pre_incremento}.
	 * @param ctx the parse tree
	 */
	void exitPos_pre_incremento(compiladoresParser.Pos_pre_incrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#bloque_for}.
	 * @param ctx the parse tree
	 */
	void enterBloque_for(compiladoresParser.Bloque_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#bloque_for}.
	 * @param ctx the parse tree
	 */
	void exitBloque_for(compiladoresParser.Bloque_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#iwhile}.
	 * @param ctx the parse tree
	 */
	void enterIwhile(compiladoresParser.IwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#iwhile}.
	 * @param ctx the parse tree
	 */
	void exitIwhile(compiladoresParser.IwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#iif}.
	 * @param ctx the parse tree
	 */
	void enterIif(compiladoresParser.IifContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#iif}.
	 * @param ctx the parse tree
	 */
	void exitIif(compiladoresParser.IifContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#ifor}.
	 * @param ctx the parse tree
	 */
	void enterIfor(compiladoresParser.IforContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#ifor}.
	 * @param ctx the parse tree
	 */
	void exitIfor(compiladoresParser.IforContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#una_o_mas_variables}.
	 * @param ctx the parse tree
	 */
	void enterUna_o_mas_variables(compiladoresParser.Una_o_mas_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#una_o_mas_variables}.
	 * @param ctx the parse tree
	 */
	void exitUna_o_mas_variables(compiladoresParser.Una_o_mas_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#tipo_de_funcion}.
	 * @param ctx the parse tree
	 */
	void enterTipo_de_funcion(compiladoresParser.Tipo_de_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#tipo_de_funcion}.
	 * @param ctx the parse tree
	 */
	void exitTipo_de_funcion(compiladoresParser.Tipo_de_funcionContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_funcion(compiladoresParser.Declaracion_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_funcion(compiladoresParser.Declaracion_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#definicion_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion_funcion(compiladoresParser.Definicion_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#definicion_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion_funcion(compiladoresParser.Definicion_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#param_declaracion}.
	 * @param ctx the parse tree
	 */
	void enterParam_declaracion(compiladoresParser.Param_declaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#param_declaracion}.
	 * @param ctx the parse tree
	 */
	void exitParam_declaracion(compiladoresParser.Param_declaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#param_definicion}.
	 * @param ctx the parse tree
	 */
	void enterParam_definicion(compiladoresParser.Param_definicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#param_definicion}.
	 * @param ctx the parse tree
	 */
	void exitParam_definicion(compiladoresParser.Param_definicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#finalizar_con_return}.
	 * @param ctx the parse tree
	 */
	void enterFinalizar_con_return(compiladoresParser.Finalizar_con_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#finalizar_con_return}.
	 * @param ctx the parse tree
	 */
	void exitFinalizar_con_return(compiladoresParser.Finalizar_con_returnContext ctx);
}