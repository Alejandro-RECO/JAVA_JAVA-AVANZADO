import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EjercicioVIII {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido, este es un juego de ahorcados. El juego consiste en adivinar la palabra, cuentas con 4 oportunidades, Mucha suerte");

        Set<String> letrasCorrectas = new HashSet<>();
        letrasCorrectas.add("a");
        letrasCorrectas.add("m");
        letrasCorrectas.add("o");
        letrasCorrectas.add("r");

        int oportunidades = 4;
        String palabraAdivinar = "amor";
        StringBuilder palabraActual = new StringBuilder("____");
 
        while (oportunidades > 0 && !palabraActual.toString().equals(palabraAdivinar)) {
            System.out.println("\nAdivina la palabra: " + palabraActual.toString() + ", te quedan " + oportunidades + " oportunidades.");
            System.out.println("Ingresa una letra: ");
            String letra = leer.nextLine().toLowerCase();

            if (letrasCorrectas.contains(letra)) {
                System.out.println("¡Acertaste la letra " + letra.toUpperCase() + "!");
                for (int i = 0; i < palabraAdivinar.length(); i++) {
                    if (palabraAdivinar.charAt(i) == letra.charAt(0)) {
                        palabraActual.setCharAt(i, letra.charAt(0));
                    }
                }
            } else {
                System.out.println("Lo siento, la letra " + letra.toUpperCase() + " no está en la palabra.");
                oportunidades--;
            }
        } 

        if (oportunidades == 0) {
            System.out.println("¡Lo siento, has perdido! La palabra era " + palabraAdivinar.toUpperCase());
        } else {
            System.out.println("¡Felicidades, has adivinado la palabra " + palabraAdivinar.toUpperCase() + "!");
        }
    leer.close();
    }
}

