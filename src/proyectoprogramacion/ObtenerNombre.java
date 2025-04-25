package proyectoprogramacion;
public class ObtenerNombre {
    public static String nombre;
    public static int contador;
    public static String getNombre() {
        return nombre;
    }
    public static void setNombre(String nombre) {
        ObtenerNombre.nombre = nombre;
    }  
    public static int getContador() {
        return contador;
    }
    public static void setContador(int contador) {
        ObtenerNombre.contador = contador;
    }
}