                                                                                                                   import java.util.Scanner;

public class EjercicioII {
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
        leer.close();
    }
}
