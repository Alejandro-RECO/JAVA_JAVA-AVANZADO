package Retos;

import java.util.Scanner;

public class RetoVII {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de notas a evaluar en la materia
        System.out.print("Ingrese la cantidad de notas a evaluar: ");
        int cantidadNotas = scanner.nextInt();

        // Crear un arreglo para almacenar las notas
        double[] notas = new double[cantidadNotas];

        // Solicitar los valores de cada nota
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("Ingrese el valor de la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Calcular el promedio de las notas
        double sumaNotas = 0;
        for (double nota : notas) {
            sumaNotas += nota;
        }
        double promedio = sumaNotas / cantidadNotas;

        // Mostrar el promedio y la anotación correspondiente
        System.out.println("Promedio de notas: " + promedio);
        if (promedio < 3) {
            System.out.println("Reprobaste");
        } else if (promedio >= 3 && promedio <= 4.0) {
            System.out.println("Pasaste Raspando");
        } else {
            System.out.println("Aprobaste con buenos resultados");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
