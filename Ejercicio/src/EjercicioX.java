
import java.util.Scanner;
import java.util.Arrays;

public class EjercicioX {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear un arreglo para almacenar los números
        int[] numeros = new int[10];

        // Solicitar al usuario ingresar los números
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Ordenar los números de mayor a menor
        Arrays.sort(numeros);
        int[] numerosOrdenados = new int[10];

        for (int i = 0; i < 10; i++) {
            numerosOrdenados[i] = numeros[9 - i];
        }

        // Mostrar los números ordenados de mayor a menor
        System.out.println("Números ordenados de mayor a menor:");
        for (int numero : numerosOrdenados) {
            System.out.println(numero);
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

