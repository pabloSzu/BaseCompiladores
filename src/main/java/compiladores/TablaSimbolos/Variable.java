package compiladores.TablaSimbolos;

public class Variable extends ID {

    public Variable() {}

    public Variable(String nombre, String tipo) {  //LAS VARIABLES TIENEN TIPO Y NOMBRE
        super(nombre, tipo);
    }

    @Override
    public String toString() {
        String variable = this.getTipo() + " " + this.getNombre();  //LAS VARIABLES SE DEFINEN: TIPO_VARIABLE  NOMBRE_VARIABLE

        if (this.isUsado())     //VEO SI SON USADAS O NO
            variable += " [Variable usada]";
        else
            variable += " [Variable sin usar]";
            
        return variable;        //DEVUELVO LA VARIABLE
    }
    
}
