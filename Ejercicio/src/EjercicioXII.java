import java.util.Scanner;

public class EjercicioXII {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar la cantidad de números
        System.out.print("Ingrese la cantidad de números: ");
        int cantidadNumeros = scanner.nextInt();

        // Crear un arreglo para almacenar los números
        int[] numeros = new int[cantidadNumeros];

        // Solicitar al usuario ingresar los números
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Crear un arreglo para almacenar los conteos de cada número
        int[] contador = new int[cantidadNumeros];

        // Contar las repeticiones de cada número
        for (int i = 0; i < cantidadNumeros; i++) {
            int numeroActual = numeros[i];
            int repeticiones = 0;

            // Verificar si el número ya ha sido contado
            boolean yaContado = false;
            for (int j = 0; j < i; j++) {
                if (numeros[j] == numeroActual) {
                    yaContado = true;
                    break;
                }
            }

            // Si no ha sido contado, contar las repeticiones
            if (!yaContado) {
                for (int j = i; j < cantidadNumeros; j++) {
                    if (numeros[j] == numeroActual) {
                        repeticiones++;
                    }
                }
            }

            contador[i] = repeticiones;
        }

        // Mostrar la cantidad de repeticiones de cada número
        System.out.println("\nCantidad de repeticiones de cada número:");

        for (int i = 0; i < cantidadNumeros; i++) {
            if (contador[i] > 0) {
                System.out.println("El número " + numeros[i] + " se repite " + contador[i] + " veces.");
            }
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
