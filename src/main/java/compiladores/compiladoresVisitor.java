// Generated from c:\Users\u005Cusuario\Desktop\u005Cubp\5to\TC\BaseCompiladores\src\main\java\compiladores\compiladores.g4 by ANTLR 4.8

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
	 * Visit a parse tree produced by {@link compiladoresParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(compiladoresParser.SContext ctx);
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
	 * Visit a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#asignacion_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_(compiladoresParser.Asignacion_Context ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#tipodato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipodato(compiladoresParser.TipodatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#ciclofor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclofor(compiladoresParser.CicloforContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#ciclowhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclowhile(compiladoresParser.CiclowhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#condif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondif(compiladoresParser.CondifContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(compiladoresParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(compiladoresParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#llamada_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_funcion(compiladoresParser.Llamada_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(compiladoresParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(compiladoresParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#opal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpal(compiladoresParser.OpalContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#disyuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisyuncion(compiladoresParser.DisyuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#disy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisy(compiladoresParser.DisyContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#conjuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjuncion(compiladoresParser.ConjuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#conj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConj(compiladoresParser.ConjContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#comparaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparaciones(compiladoresParser.ComparacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(compiladoresParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#opcomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcomp(compiladoresParser.OpcompContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(compiladoresParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(compiladoresParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(compiladoresParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(compiladoresParser.FContext ctx);
}