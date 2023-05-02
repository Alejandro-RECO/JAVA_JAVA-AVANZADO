import java.util.Scanner;

public class EjercicioIII {
    public static void main(String[] args) {
        // Establecemos las variables
        int edad;

        // Recolectamos los datos
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Para verificar si usted puede entrar a la discoteca dijite su edad en años cumplidos: ");
        edad = leer.nextInt();

        // establecemos las condiciones de nuestro sistema

        if (edad >= 18){
           System.out.println("Bienvenido a Guatapury la mejor fiesta de la zona"); 
        }
        else{
            System.out.println("Lo sentimos no cumples con los requicitos para ingrsar a la discoteca, mejor valla a dormir");
        }
         leer.close();
    }
}
