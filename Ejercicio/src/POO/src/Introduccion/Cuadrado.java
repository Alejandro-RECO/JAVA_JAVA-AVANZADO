package Introduccion;

import java.util.Scanner;

public class Cuadrado extends Figura{
// Atributos
    private int lado;
// Constructores
    public Cuadrado(){   
    }
    public Cuadrado(int lado){
        super();
        this.lado=lado;        
    }
    public int getLado() {
        return lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }
    // Metodos
    public void calcularArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es el lado del cuadrado: ");
        lado = sc.nextInt();
        int calculado  = (lado*lado);
        System.out.println("El lado del cuadro es: "+lado+" Y el area es: "+calculado);
        sc.close();
    }

}
