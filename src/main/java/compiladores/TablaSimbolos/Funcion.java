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
    
    public LinkedList<ID> getParametros() {             //devuelvo lista de parametros  
        return this.parametros;
    }

    public void setParametros(LinkedList<ID> param) {   //seteo lista de parametros
        this.parametros = param;
    }

    public Boolean addParametro(ID param) {              //agrego un parámetro
        return this.parametros.add(param);
    }

    public Boolean deleteParametro(ID param) {           //borro un parámetro
        return this.parametros.remove(param);
    }

    @Override
    public String toString() {
        String funcion = this.getTipo() + " " + this.getNombre() + "(";  //devuelvo tipo y nobre de la función
        Iterator<ID> iterador = this.parametros.iterator();

        int i = 0;
        while(iterador.hasNext()) {
            ID next = iterador.next();
            if (i != 0) funcion += ", " + next.getTipo() + " " + next.getNombre();    //itero y muestro los parámetros
            else funcion += next.getTipo() + " " + next.getNombre();
            i++;
        }

        funcion += ")";

        if(this.isUsado()) {                      //devulevo si la función fue usada o no fue usada
            funcion += " [funcion usada]";
        }
        else {
            funcion += " [funcion sin usar]";
        }

        return funcion;
    }

}
