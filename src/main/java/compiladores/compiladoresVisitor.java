// Generated from c:\Users\u005Cusuario\Desktop\u005Cubp\5to\TC\BaseCompiladores\src\main\java\compiladores\compiladores.g4 by ANTLR 4.9.2

package compiladores;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link compiladoresParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface compiladoresVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#verificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerificador(compiladoresParser.VerificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#tipo_de_datos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_de_datos(compiladoresParser.Tipo_de_datosContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#asignacion_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_simple(compiladoresParser.Asignacion_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#opal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpal(compiladoresParser.OpalContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(compiladoresParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(compiladoresParser.EContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(compiladoresParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(compiladoresParser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#logico_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogico_comp(compiladoresParser.Logico_compContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(compiladoresParser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(compiladoresParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#bloque_estructuras_de_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_estructuras_de_control(compiladoresParser.Bloque_estructuras_de_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#pos_pre_incremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPos_pre_incremento(compiladoresParser.Pos_pre_incrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#bloque_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_for(compiladoresParser.Bloque_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#iwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIwhile(compiladoresParser.IwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#iif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIif(compiladoresParser.IifContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#ifor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfor(compiladoresParser.IforContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#una_o_mas_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUna_o_mas_variables(compiladoresParser.Una_o_mas_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#tipo_de_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_de_funcion(compiladoresParser.Tipo_de_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(compiladoresParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_funcion(compiladoresParser.Declaracion_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#definicion_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicion_funcion(compiladoresParser.Definicion_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#param_declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_declaracion(compiladoresParser.Param_declaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#param_definicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_definicion(compiladoresParser.Param_definicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#finalizar_con_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalizar_con_return(compiladoresParser.Finalizar_con_returnContext ctx);
}