package compiladores.TablaSimbolos;

import java.util.Iterator;
import java.util.LinkedList;


public class Funcion extends ID {

    private LinkedList<ID> parametros;  //LinkedList para usar propiedades como addFirst(), getLast(), etc
  
    public Funcion() {
        this.parametros = new LinkedList<ID>();
    }

    public Funcion(String tipo, String nombre) {
        super();                                        //Super llama al constructor de la clase superior (ID)
        this.parametros = new LinkedList<ID>();         //parametros = lista de parámetros
        this.setTipo(tipo);                             //asigno tipo de la funcion
        this.setNombre(nombre);                         //asigno nombre de la funcion
        this.setUsado(true);                      //asigno usado = true en la funcion
    }
    
    public LinkedList<ID> getParametros() {             
        return this.parametros;
    }

    public void setParametros(LinkedList<ID> param) {   
        this.parametros = param;
    }

    public Boolean addParametro(ID param) {            
        return this.parametros.add(param);
    }

    public Boolean deleteParametro(ID param) {
        return this.parametros.remove(param);
    }

    @Override
    public String toString() {
        String funcion = this.getTipo() + " " + this.getNombre() + "(";
        Iterator<ID> it = this.parametros.iterator();

        int i = 0;
        while(it.hasNext()) {
            ID next = it.next();
            if (i != 0) funcion += ", " + next.getTipo() + " " + next.getNombre();
            else funcion += next.getTipo() + " " + next.getNombre();
            i++;
        }

        funcion += ")";

        if(this.isUsado()) {
            funcion += " [funcion usada]";
        }
        else {
            funcion += " [funcion sin usar]";
        }

        return funcion;
    }

}
