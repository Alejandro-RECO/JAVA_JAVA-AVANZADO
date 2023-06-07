import Introduccion.Cuadrado;
import Retos.Accion;

public class Ejecucion {
    public static void main(String[] args) {
        Accion nw = new Accion();
        Cuadrado cuadrado1 = new Cuadrado();

        // cuadrado1.calcularArea();

        nw.registrarPelicula();
        nw.mostrarPelicula();
        nw.limpiar();
        nw.registrarGeneroAccion();
        nw.mostrarGeneroAccion();


    }
}
