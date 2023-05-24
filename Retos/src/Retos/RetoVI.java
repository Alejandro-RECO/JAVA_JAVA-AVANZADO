package Retos;

import java.util.Scanner;

public class RetoVI {
    public static void main(String[] args) {
        // Crear una matriz para almacenar los productos
        String[][] productos = new String[16][3];

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar los precios y nombres de los productos
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Ingrese el nombre y precio del producto " + (i + 1) + ":");

            // Ingresar el nombre del producto
            System.out.print("Nombre: ");
            productos[i][1] = scanner.nextLine();

            // Ingresar el precio del producto
            System.out.print("Precio: ");
            productos[i][2] = scanner.nextLine();

            // Almacenar la posición del producto
            productos[i][0] = String.valueOf(i + 1);
        }

        // Mostrar los productos junto con su posición en la matriz
        System.out.println("\nListado de productos:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Código: " + productos[i][0]);
            System.out.println("Nombre: " + productos[i][1]);
            System.out.println("Precio: " + productos[i][2]);
            System.out.println();
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

