import java.util.Scanner;

public class EjercicioXIII {
    public static void main(String[] args) {
        String[][] matriz = {
                {"gato", "rana", "mariposa", "perro"},
                {"mariposa", "perro", "rana", "gato"}
        };

        Scanner scanner = new Scanner(System.in);

        int oportunidades = 5;
        int paresAdivinados = 0;

        while (oportunidades > 0 && paresAdivinados < 4) {
            System.out.println("Oportunidades restantes: " + oportunidades);

            System.out.print("Ingrese la fila (0-1): ");
            int fila1 = scanner.nextInt();
            System.out.print("Ingrese la columna (0-3): ");
            int columna1 = scanner.nextInt();

            if (fila1 < 0 || fila1 >= matriz.length || columna1 < 0 || columna1 >= matriz[0].length) {
                System.out.println("Posición inválida. Inténtalo de nuevo.");
                continue;
            }

            System.out.print("Ingrese otra fila (0-1): ");
            int fila2 = scanner.nextInt();
            System.out.print("Ingrese otra columna (0-3): ");
            int columna2 = scanner.nextInt();

            if (fila2 < 0 || fila2 >= matriz.length || columna2 < 0 || columna2 >= matriz[0].length) {
                System.out.println("Posición inválida. Inténtalo de nuevo.");
                continue;
            }

            String palabra1 = matriz[fila1][columna1];
            String palabra2 = matriz[fila2][columna2];

            System.out.println("Palabra seleccionada en la posición [" + fila1 + ", " + columna1 + "]: " + palabra1);
            System.out.println("Palabra seleccionada en la posición [" + fila2 + ", " + columna2 + "]: " + palabra2);

            if (palabra1.equals(palabra2)) {
                System.out.println("¡Correcto! Las palabras coinciden.");
                paresAdivinados++;
            } else {
                System.out.println("Incorrecto. Las palabras no coinciden.");
                oportunidades--;
            }

            System.out.println();
        }

        if (paresAdivinados == 4) {
            System.out.println("¡Felicidades! Has encontrado todos los pares. Ganaste el juego.");
        } else {
            System.out.println("Juego terminado. No lograste encontrar todos los pares. Mejor suerte la próxima vez.");
        }
    }
}
