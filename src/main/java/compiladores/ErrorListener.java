package compiladores;

public class ErrorListener {
    private static ErrorListener instance = null;
    private boolean codigo_error = false;

    public static ErrorListener getInstance() {
        if (instance == null) {
            instance = new ErrorListener();
        }
        return instance;
    }
//muestro los errores y la línea de los mismos
    public static void printError(int line, String error) {
        System.out.println("Error en la linea nro: " + line + " " +error);
    }

    public Boolean thereIsError() {
        return this.codigo_error;
    }
    
}
