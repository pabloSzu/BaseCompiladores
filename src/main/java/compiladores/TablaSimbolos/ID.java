package compiladores.TablaSimbolos;

public class ID {


    private String nombre_token;
    private String tipo_Dato;
    private Boolean usada;

    public ID() {}

    public ID(String nombre, String tipo) {
        this.nombre_token = nombre;  //NOMBRE DE LA VARIABLE
        this.tipo_Dato = tipo;       //TIPO DE LA VARIABLE
        this.usada = false;          //USADA (BOOLEANA)
    }

    public String getNombre() {
        return this.nombre_token;
    }

    public void setNombre(String nombre) {
        this.nombre_token = nombre;
    }

    public String getTipo() {
        return this.tipo_Dato;
    }

    public void setTipo(String tipo) {
        this.tipo_Dato = tipo;
    }

    public Boolean isUsado() {
        return this.usada;
    }

    public void setUsado(Boolean usado) {
        this.usada = usado;
    }
}
