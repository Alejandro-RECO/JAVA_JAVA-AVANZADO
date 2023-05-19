import java.util.Scanner;

public class EjercicioV {
    public static void main(String[] args) {
        String cabello, corbata;
        Scanner leer = new Scanner(System.in);

        System.out.println("Cuale es tu sexo: ");
        System.out.println("M (Maculino)");
        System.out.println("F (Femenino)");
        String sexo = leer.nextLine();
        if  (sexo.equalsIgnoreCase("m")){
            System.out.println("cual es el largo de tu corbata");
            corbata = leer.nextLine();
            System.out.println("Gracias por la informacion ya sabemos que tu corbata mide: " + corbata);

        }else if (sexo.equalsIgnoreCase("f")){
            System.out.println("Cuanto mide tu cabello");
            cabello = leer.nextLine();
            System.out.println("Gracias por la informacion ya sabemos que tu cabello mide: " + cabello);
        }else{
            System.out.println("No identifico ese genero, pero no te sentas mal");
        }
        leer.close();
    }
}
