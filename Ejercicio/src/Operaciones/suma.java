package Operaciones;
import java.util.Scanner;
public class suma {
    public static void main(String[] args) {
        int num1, num2, resultado=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido al programa que suma      dos numeros");
        System.out.println("Dijite el primer numero");
        num1 = leer.nextInt();
        System.out.println("Dijite el segundo numero");
        num2 = leer.nextInt();
        System.out.println("Los numeros son; " + num1 + " y " + num2);
        resultado = num1 + num2;
        System.out.println("El resultado de la operación es: " + resultado);   
        leer.close();     

    }
}
