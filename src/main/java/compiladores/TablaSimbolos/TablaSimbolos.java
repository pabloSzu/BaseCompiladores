package compiladores.TablaSimbolos;

import java.util.HashMap;
import java.util.LinkedList;



public class TablaSimbolos {

    private LinkedList<HashMap<String, ID>> tablaSimbolos;                  //Creo listas de hashMaps. HashMap=(coleccíon de clave-valor) por ej: [clave1=>valor1, clave2=>valor2,...]
    private LinkedList<HashMap<String, ID>> historialTablaSimbolos;
    private static TablaSimbolos instance;
    

    public static TablaSimbolos getInstance() {
        if(instance == null)
            instance = new TablaSimbolos();
        return instance;
    }

    public TablaSimbolos() {
        this.tablaSimbolos = new LinkedList<HashMap<String, ID>>();                 //Lista de símbolos
        this.historialTablaSimbolos = new LinkedList<HashMap<String, ID>>();        //Lista de historial símbolos
        this.addContext();
    }

    public void addContext() {
        HashMap<String, ID> context = new HashMap<String,ID>();        //context = tablas de HASH (coleccíon de clave-valor)
        this.tablaSimbolos.add(context);                               //agrego un context(coleccíon de clave-valor) a tablaSimbolos
        this.historialTablaSimbolos.add(context);                      //agrego un context(coleccíon de clave-valor) a historialTablaSimbolos
    }

    public void removeContext() {                                       //quito el último elemento-contexto
        
        this.tablaSimbolos.removeLast();
    }

    public void addParamForContext() {                                  //agrego nuevo HashMap(coleccíon de clave-valor)
        this.tablaSimbolos.add(new HashMap<String, ID>());
    }

    public int getContext() {                                           //cantidad de contextos
        return this.tablaSimbolos.size();
    }


    public ID searchId(final ID id) {                                   //recorro buscando por ID (nombre-tipo-usada)
        for(int i = 0; i < this.tablaSimbolos.size(); i++) {
            if(this.tablaSimbolos.get(i).containsKey(id.getNombre()))
                return this.tablaSimbolos.get(i).get(id.getNombre());
        }

        return null;
    }
    
    public ID searchVariable(final String nombre) {                     //recorro buscando por nombre
        for(int i = 0; i < this.tablaSimbolos.size(); i++) {
            if(this.tablaSimbolos.get(i).containsKey(nombre))
                return this.tablaSimbolos.get(i).get(nombre);
        }
        return null;
    }

    public void addId(final ID id) {                                    //agrego variable 
        this.tablaSimbolos.getLast().put(id.getNombre(), id);           
        this.historialTablaSimbolos.get(this.historialTablaSimbolos.size() - 1).put(id.getNombre(), id);
    }
    
    public void addFuncion(final Funcion funcion) {    //agrego función
        this.tablaSimbolos.getLast().put(funcion.getNombre(), funcion);
        if (this.tablaSimbolos.size() == 0){
            if (this.historialTablaSimbolos.size() > 1){
                this.historialTablaSimbolos.get(this.historialTablaSimbolos.size() - 2).put(funcion.getNombre(), funcion);
            }
            else {
                this.historialTablaSimbolos.get(this.historialTablaSimbolos.size() - 1).put(funcion.getNombre(), funcion);
            }
        }
    }

    public void addParamFuncion(final ID id) {
        this.tablaSimbolos.getLast().put(id.getNombre(), id);
    }


    public void asignacionId(final ID id) {
        for(int i = this.tablaSimbolos.size() - 1; i >= 0; i--) {
            if(this.tablaSimbolos.get(i).containsKey(id.getNombre())) {
                this.tablaSimbolos.get(i).replace(id.getNombre(), id);
                this.historialTablaSimbolos.get(i).replace(id.getNombre(), id);
                break;
            }
        }
    }

//controlo si está declarada la variable
    public boolean isVariableDeclared(final ID id) {
        for(int i = this.tablaSimbolos.size() - 1; i >= 0; i--) {
            if (this.tablaSimbolos.get(i).containsKey(id.getNombre())) {
                return true;
            }
        }
        return false;
    }

    //controlo si está declarada la variable por su nombre
        public boolean isVariableDeclared(final String nombre) {
            for(int i = this.tablaSimbolos.size() - 1; i >= 0; i--) {
                if (this.tablaSimbolos.get(i).containsKey(nombre)) {
                    return true;
                }
            }
            return false;
        }

    //controlo si está declarada la variable la funcion
        public boolean isVariableDeclared(final Funcion funcion) {
            for(int i = this.tablaSimbolos.size() - 1; i >= 0; i--) {
                if (this.tablaSimbolos.get(i).containsKey(funcion.getNombre())) {
                    return true;
                }
            }
            return false;
        }
//controlo si son usadas
    public void setUsedId(final String nombre) {
        for (HashMap<String, ID> contexto : this.tablaSimbolos) {
            for (ID id : contexto.values()) {
                if (id.getNombre().equals(nombre))
                    id.setUsado(true);
            }
        }
    }
 
//controlo si la función es definida  
    public Funcion getDefFuncion(final Funcion function) {
        ID id = this.tablaSimbolos.getFirst().get(function.getNombre());
        
        if (id instanceof Funcion)
            return (Funcion) id;
        else
            return null; 
    }



//controlo variables usadas o no en un contecto
    public LinkedList<ID> getCurrentContextUnusedVariables() {
        LinkedList<ID> unused = new LinkedList<ID>();
        HashMap<String, ID> IDs = this.tablaSimbolos.getLast();
        for(ID id : IDs.values()) {
            if (id instanceof Funcion && id.getNombre().equals("main")) { 
                continue;
            }
            if (!id.isUsado()) {
                unused.add(id);
            }
        }
        return unused;
    }


//imprimo tablas
    public void printTable() {
        int ctx = 1;
        System.out.println("\n------TABLA DE SIMBOLOS------");
        for (HashMap<String, ID> contexto : this.tablaSimbolos) {
            System.out.println("Contexto: " + ctx++ + " {");
            for (ID id : contexto.values()) {
                System.out.println("    " + id.toString());
            }
            System.out.println("}");
        }
      
        ctx = 1;
        System.out.println("\n------HISTORIAL------");
        for (HashMap<String, ID> contexto : this.historialTablaSimbolos) {
            System.out.println("Contexto: " + ctx++ + " {");
            for (ID id : contexto.values()) {
                System.out.println("    " + id.toString());
            }
            System.out.println("}");
        }       
    }
    
}
