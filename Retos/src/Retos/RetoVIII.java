package Retos;

import java.util.Scanner;

public class RetoVIII {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de competidores
        System.out.print("Ingrese la cantidad de competidores: ");
        int cantidadCompetidores = scanner.nextInt();

        // Crear arreglos para almacenar los nombres y tiempos de los competidores
        String[] nombres = new String[cantidadCompetidores];
        double[] tiempos = new double[cantidadCompetidores];

        // Solicitar los nombres y tiempos de cada competidor
        for (int i = 0; i < cantidadCompetidores; i++) {
            scanner.nextLine(); // Limpiar el buffer de entrada
            System.out.print("Ingrese el nombre del competidor " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            System.out.print("Ingrese el tiempo del competidor " + (i + 1) + " (en segundos): ");
            tiempos[i] = scanner.nextDouble();
        }

        // Encontrar el competidor con el tiempo más bajo (el ganador)
        int indicador = 0;
        double tiempoGanador = tiempos[0];

        for (int i = 1; i < cantidadCompetidores; i++) {
            if (tiempos[i] < tiempoGanador) {
                tiempoGanador = tiempos[i];
                indicador = i;
            }
        }

        // Mostrar cada competidor con su respectivo tiempo
        System.out.println("\nResultados de la competencia:");

        for (int i = 0; i < cantidadCompetidores; i++) {
            System.out.println("Competidor: " + nombres[i]);
            System.out.println("Tiempo: " + tiempos[i] + " segundos");
            System.out.println();
        }

        // Mostrar el ganador
        System.out.println("¡El ganador es: " + nombres[indicador] + " con un tiempo de " + tiempoGanador + " segundos!");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

