package Introduccion;
import java.util.*;
public class Velocidad {
    // Atributos
    private int num1;
    private int num2; 
    
    public void metrosSegundos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la distancia en kilometros: ");
        float kilometros = sc.nextFloat();
        System.out.println("Ingrese el tiempo en horas: ");
        float horas = sc.nextInt();
        float metros = (kilometros * 5);
        float segundos = (horas * 18);
        float metrosSobreSegundos = (metros / segundos);
        System.out.println("El tiempo en metros sobre segundo es: " + metrosSobreSegundos + "M/S");
    }
    public void kilometrosHora(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Igrese la distancia en metros: ");
        float metros = sc.nextInt();
        System.out.println("Ingrese el tiempo en segundos: ");
        int segundos = sc.nextInt();
        float kilometros = metros /1000;
        float horas = segundos / 3600;  
        float kilometrosHora = (kilometros / horas);
        System.out.println("El tiempo en kilomentros sobre horas es: " + kilometrosHora + "K/H");
    }
    public void centimetrosMetros(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrse la distancia en centímetros: ");
        float centimentros = sc.nextFloat();
        float metros = (centimentros / 100);
        System.out.println("La distancia en metros es de: " + metros + "M");
    }
    



}
