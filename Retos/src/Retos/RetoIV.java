package Retos;
import java.util.Scanner;


public class RetoIV {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero = (int)(Math.random()*2+1);
        int opcion;

        System.out.println("Elige una opcion (1.Cara 2.Sello)");
        opcion = leer.nextInt();
            if(opcion == numero){
                System.out.println("Ganaste ");
            }else{
                System.out.println("Perdiste");
            }
            if(numero == 1){
                System.out.println("El resultado es " + numero + ".Cara");
            }else if(numero == 2){
                System.out.println("El resultado es " + numero + ".Sello");
            }
        leer.close();
    }
    
}
