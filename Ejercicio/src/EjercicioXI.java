import java.util.Scanner;

public class EjercicioXI {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar una palabra letra por letra
        System.out.print("Ingrese una palabra letra por letra (presione Enter después de cada letra): ");
        String palabra = "";
        String letra = scanner.nextLine();

        while (!letra.isEmpty()) {
            palabra += letra;
            letra = scanner.nextLine();
        }

        // Convertir la palabra en un array de caracteres
        char[] letras = palabra.toCharArray();

        // Mostrar la palabra al revés
        System.out.print("La palabra al revés es: ");
        for (int i = letras.length - 1; i >= 0; i--) {
            System.out.print(letras[i]);
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

