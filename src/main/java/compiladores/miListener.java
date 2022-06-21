package compiladores;

import java.util.LinkedList;

import compiladores.compiladoresParser.BloqueContext;
import compiladores.TablaSimbolos.Funcion;
import compiladores.TablaSimbolos.ID;
import compiladores.TablaSimbolos.TablaSimbolos;
import compiladores.TablaSimbolos.Variable;


public class miListener extends compiladoresBaseListener {

    private TablaSimbolos simbolTable = TablaSimbolos.getInstance();
   
    compiladoresParser parser;

    public miListener() {
    }

    @Override 
    public void enterBloque( BloqueContext ctx) {   //sobreescribimos el método enterBloque
        if (ctx.getParent().getClass().equals( compiladoresParser.Definicion_funcionContext.class)) {  //si el contexto es Definicion_funcion..
             compiladoresParser.Definicion_funcionContext fnctx = ( compiladoresParser.Definicion_funcionContext) ctx.getParent();
            Funcion funcion = DataFuncion.getDataFuncion(fnctx);     //funcion = datos de la función del contexto
            
            if (!this.simbolTable.isVariableDeclared(funcion)){   //si no está declarada
                this.simbolTable.addFuncion(funcion);             //agrego la función
            }
            this.simbolTable.addContext();                        //agrego contexto
            
            if (fnctx.param_definicion().getChildCount() != 0) {  //si tiene parametros
                for (ID param : funcion.getParametros()) {        //recorro los parametros
                    this.simbolTable.addId(param);                //los agrego
                }
            }
        }
        else {
            this.simbolTable.addContext();      // si no ... agrego contexto
        }
    }

    
    @Override 
    public void exitBloque( compiladoresParser.BloqueContext ctx) {   //sobreescribimos el método exitBloque
        this.simbolTable.removeContext();   //al salir de un bloque remuevo el contexto
    }

    @Override 
    public void exitDeclaracion(compiladoresParser.DeclaracionContext ctx) {    //sobreescribimos el método exitDeclaracion
       compiladoresParser.Asignacion_simpleContext lista = ctx.asignacion_simple();    //lista = asignación simple en dicho contexto
       while (lista != null) {                                              //mientras la lista no sea nula...
           if (lista.asignacion_simple() == null) {                         //si la asignación_simple es nula..
               ID id = new Variable(lista.ID().getText(), ctx.tipo_de_datos().getText());  //id = (nombre, tipo)
               if (!this.simbolTable.isVariableDeclared(id)) {                              //si no está declarada dicha variable..
                   this.simbolTable.addId(id);                                              //la agrego a la tabla de símbolos
               }
               else {                                                                       //si no..
                   ErrorListener.printError(ctx.getStop().getLine(), "Variable duplicada");//muestro el error (imprimo en pantalla) "variable duplicada"
               }
           }
           lista = lista.asignacion_simple();                               //si no..(osea si la asignación simple NO es nula).. lista = asignacion_simple 
       }
    }


    @Override
         public void exitAsignacion( compiladoresParser.AsignacionContext ctx){     //sobreescribo el método exitAsignacion
        ID variable = this.simbolTable.searchVariable(ctx.ID().getText());  //id = variable en la tabla de simbolos  (la busco por ID)
        int linea = ctx.getStart().getLine();   // el numero de linea es para el parser error

        if (ctx.getParent().getClass().equals( compiladoresParser.AsignacionContext.class)) {  //si el contexto es Asignación..
             compiladoresParser.AsignacionContext lista = ( compiladoresParser.AsignacionContext) ctx.getParent();  //lista = asignación 

            while(lista.getParent().getClass().equals( compiladoresParser.AsignacionContext.class)) {  //mientras sea Asignación..
                lista = ( compiladoresParser.AsignacionContext) lista.getParent();
            }

            if (lista.getParent().getClass().equals( compiladoresParser.DeclaracionContext.class)) {    //si es definición
                String nombreVariable = ctx.ID().getText();     //nombreVariable = nombre
                String tipoVariable = (( compiladoresParser.DeclaracionContext) lista.getParent()).tipo_de_datos().getText();     //tipoVariable = tipo
                variable = new Variable(nombreVariable, tipoVariable);      //variable = (nombre, tipo)
                
                if (!this.simbolTable.isVariableDeclared(variable)) {       //si no está declarada en la tabla de símbolos..
                    this.simbolTable.addId(variable);                       //la agrego
                }
                else {                      // si ya está declarada..
                    ErrorListener.printError(linea, "Se encontro una variable duplicada "+ variable.getNombre());//muestro el error (imprimo en pantalla) "variable duplicada"
                }
            }    
        }
        else if (this.simbolTable.isVariableDeclared(ctx.ID().getText())) {  //si la variable está declarada en la tabla de símbolos..
            this.simbolTable.setUsedId(ctx.ID().getText());   //la seteo como usada
        }
        else {
            //Variable no declarada
            ErrorListener.printError(ctx.getStop().getLine(), " La variables --> "+ ctx.ID().getText() +" no esta declarado");//muestro el error (imprimo en pantalla) "la variable x no está declarada"
        }
    }
  
    @Override 
    public void exitDeclaracion_funcion(compiladoresParser.Declaracion_funcionContext ctx) {  //sobreescribo el método exitDeclaracion_funcion 
        
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        Funcion funcion = null;
        if (ctx.tipo_de_datos() != null)   //si el tipo de dato del contexto no es nulo..
            funcion = new Funcion(ctx.tipo_de_datos().getText(), ctx.ID().getText());  //funcion = (tipo, variable)

        LinkedList<ID> paramFuncion = new LinkedList<ID>();   //paramFuncion = Lista

        if (DataFuncion.validarFuncion(funcion, ctx)) {         //si la función es válida..
            if(!ctx.param_declaracion().isEmpty()) {            //si la declaración de parametros no está vacía..
                this.simbolTable.addParamForContext();          //agrego la lista de parámetros a la tabla de símbolos
                paramFuncion = DataFuncion.getParametros(ctx.param_declaracion(), paramFuncion);  //paramFincion = lista de parametros
                
                for (ID id : paramFuncion) {            //recorro los parámetros
                    if (id.getNombre() != "") {         //si el nombre no es vacío..
                        if (this.simbolTable.isVariableDeclared(id)) {  //si el parámetro ya está declarado..
                            ErrorListener.printError(ctx.getStop().getLine(), "La variable "+ id.getNombre() +" ya ha sido declarada");//muestro el error (imprimo en pantalla) "la variable x ya está declarada"

                        }
                        this.simbolTable.addParamFuncion(id);  //si no, agrego a la tabla de simbolos dicho parámetro
                    }
                }
                this.simbolTable.removeContext();       //remuevo contexto
            }
            funcion.setParametros(paramFuncion);        //seteo la lista de parametros a la función
            this.simbolTable.addFuncion(funcion);       //agrego la función a la tabla de símbolos
        }
        
    }


//==============================================================================================================================================
 
    //OP1=Arreglar la definición de funciones - controlar el árbol para ver como se están mostrando las funciones
    //OP2=Volver a controlar como se están tomando los parametros y retornos de las funciones



    /* 
    @Override 
    public void exitDefinicion_funcion(compiladoresParser.Definicion_funcionContext ctx) { 
        
        if (!ctx.ID().getText().equals("main")){   //si la función no es main..
            if (ctx.bloque().instrucciones() != null) {   //y tiene instrucciones..
                compiladoresParser.InstruccionesContext inst = ctx.bloque().instrucciones();  //inst = isntrucciones
                while(inst != null) {   //mientras las instrucciones no sean nulas..
                    if (inst.instruccion() != null){    //si no hay instruccion nula..
                        if(inst.instruccion().finalizar_con_return() != null) {  //si finaliza con return..
                            // encontre retorno
                            if (ctx.tipo_de_datos() != null) {
                                
                                if(inst.instruccion().finalizar_con_return().term() == null ) {   //pero el termino es nulo..
                                    ErrorListener.printError(ctx.getStop().getLine(), " Debe retornar un valor");  //imprimo que debe retornar valor
                                    return;
                                }
                            }
                            else if(inst.instruccion().finalizar_con_return().term() != null) {   
                                ErrorListener.printError(ctx.getStop().getLine(), "la función void no debe devolver un valor!");
                            }
                            return;
                        }
                    }
                    inst = inst.instrucciones();
                }
                // si no tiene return valido que tipo funcion sea void
                if (!ctx.tipo_de_datos().getText().equals("void")){
                    //parser de error
                    ErrorListener.printError(ctx.getStop().getLine(), "Debe retornar un valor");
                    return ;   
                }
            }
        }
    }
*/
//==============================================================================================================================================

    @Override
    public void exitPuntocoma(compiladoresParser.PuntocomaContext ctx) {    //sobreescribo el método exitPuntocoma
        if (ctx.PYC() != null) {
            if (!ctx.PYC().getText().equals(";")) {
                ErrorListener.printError(ctx.getStop().getLine(),"Falta punto y coma");    //muestro el error cuando falta punto y coma
            }
        }
    }

   @Override
   public void exitPrograma(compiladoresParser.ProgramaContext ctx){   //finalizo programa y muestro las tablas
       this.simbolTable.removeContext();
       this.simbolTable.printTable();
       this.toString();
   }


}
