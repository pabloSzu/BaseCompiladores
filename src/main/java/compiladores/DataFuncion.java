package compiladores;

import java.util.LinkedList;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.xpath.XPath;

import compiladores.TablaSimbolos.*;

public class DataFuncion {

    public static Funcion getDataFuncion( compiladoresParser.Definicion_funcionContext ctx) {
        
        TablaSimbolos tablaSimbolos = TablaSimbolos.getInstance();

        String tipo;
        if(ctx.tipo_de_datos() != null)
            tipo = ctx.tipo_de_datos().getText();
        else
            tipo = ctx.tipo_de_datos().getText();

            
        String nombre = ctx.ID().getText();
        Funcion funcion = new Funcion(tipo, nombre);

        LinkedList<ID> parametros = new LinkedList<>();

        //verificar si tiene parametros declarados
        if (ctx.param_definicion().getChildCount() != 0) {
            tablaSimbolos.addParamForContext();
            parametros = getParametros(ctx.param_definicion(), parametros);

            for (int i = 0; i < parametros.size(); i++) {
                    tablaSimbolos.addParamFuncion(parametros.get(i));
            }
            tablaSimbolos.removeContext();
        }
        funcion.setParametros(parametros);

        //contexto global
        if (tablaSimbolos.getContext() == 1) {
            Funcion firmaFuncion = tablaSimbolos.getDefFuncion(funcion);
            
            if (firmaFuncion != null && !funcion.equals(firmaFuncion)) {
                ErrorListener.printError(ctx.getStart().getLine(), "Conflicting types for " + funcion.getNombre());
            }
        }
        return funcion;
    }


    public static LinkedList<ID> getParametros(ParserRuleContext ruleCtx, LinkedList<ID> parametros) {
        //si es una definicion de una funcion
        if(ruleCtx.getClass().equals( compiladoresParser.Una_o_mas_variablesContext.class)) {
             compiladoresParser.Una_o_mas_variablesContext paramDefCtx = ( compiladoresParser.Una_o_mas_variablesContext) ruleCtx;
            
            // si hay al menos 2 parametros en la funcion definida
            if (paramDefCtx.una_o_mas_variables() != null) {
                ID param = new Variable(paramDefCtx.una_o_mas_variables().declaracion().asignacion_simple().ID().getText(), paramDefCtx.una_o_mas_variables().declaracion().tipo_de_datos().getText());
                parametros.add(param);

                return getParametros(paramDefCtx.una_o_mas_variables(), parametros);
            }
            else {
                ID param = new Variable(paramDefCtx.una_o_mas_variables().declaracion().asignacion_simple().ID().getText(), paramDefCtx.una_o_mas_variables().declaracion().tipo_de_datos().getText());
                parametros.add(param);
                return parametros;
            }
        }else{
            return parametros;
        }
    }

    public static LinkedList< compiladoresParser.FactorContext> getFactores(ParseTree parseTree, Parser parser) {
        LinkedList< compiladoresParser.FactorContext> factores = new LinkedList< compiladoresParser.FactorContext>();
        for (ParseTree ctx : XPath.findAll(parseTree, "//factor", parser)) {
            factores.add(( compiladoresParser.FactorContext) ctx);
        }
        if (factores.size() > 0) {
            return factores;
        } else{
            return null;
        }
    }

    public static boolean validarFuncion(Funcion funcion,  compiladoresParser.Declaracion_funcionContext ctx) {
      TablaSimbolos tablaSimbolos = TablaSimbolos.getInstance();
        if (tablaSimbolos.getDefFuncion(funcion) != null) {
            return true;
        }
        if (tablaSimbolos.getContext() != 1) {
            return true;
        }
        if (tablaSimbolos.isVariableDeclared(funcion)) {
            return true;
        }
        return false;
    }
    
}