package Retos;

import java.util.Scanner;

public class RetoII {
    public static void main(String[] args) {
        // Variables para almacenar información del bebe y del enfermero
        String nomEnfermera, nomBebe, nomAcuBebe;
        int mesesBebe;
        float pesoBebe;

        // Crear objeto de la clase Scanner para leer desde la entrada estándar (consola)
        Scanner leer = new Scanner(System.in);

        // Mensaje de bienvenida y solicitud de datos para iniciar el proceso
        System.out.println("Este es el sistema de control de Vacunas para bebes, acontinuación te preguntaremos algunos datos para cumplir el debido proceso");
        System.out.println(" ");
        System.out.println("¿Cual es el nombre del enfermero a cargo?");
        System.out.println(" ");
        nomEnfermera = leer.nextLine();
        System.out.println("¿Cual es el nombre de la persona a cargo del bebe?");
        System.out.println(" ");
        nomAcuBebe = leer.nextLine();
        System.out.println(" ");
        System.out.println("¿Cual es el nombre del bebe al cual se le realizara el procedimiento?");
        System.out.println(" ");
        nomBebe = leer.nextLine();
        System.out.println(" ");
        System.out.println("Para realizar el calculo de la cantidad de dosis que hay que aplicarle a "+ nomBebe + " necesitamos saber la edad en mese, y su peso en kg");
        System.out.println("Edad en meses de: " + nomBebe);

        // Leer la edad del bebe
        mesesBebe = leer.nextInt();
        System.out.println(" ");
        System.out.println("Peso en kilogramos de: " + nomBebe);                                 
        System.out.println(" ");

        // Leer el peso del bebe
        pesoBebe = leer.nextFloat();

        // Realizar el cálculo de la dosis de vacuna recomendada
        float dosisVacuna = ((pesoBebe + 10)/(mesesBebe * 10)*8);

        // Mostrar la información recopilada y el resultado del cálculo
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Nombre del enfermero:                                       " + nomEnfermera);
        System.out.println("Persona acargo del paciente:                                " + nomAcuBebe);
        System.out.println("Nombre Bebe:                                                " + nomBebe);
        System.out.println("Peso de " + nomBebe +" :                                    " + pesoBebe);
        System.out.println("Mese de " + nomBebe +" :                                    " + mesesBebe);
        System.out.println("Dosis recomendada para: " + nomBebe +" :                    " + dosisVacuna + "Miligramos");
        System.out.println(" ");
        System.out.println("El sistema nos indica que la cantidad recomendada de vacuna para aplicar a " + nomBebe + " es: " + dosisVacuna + " Miligramos");
        System.out.println(" ");
        System.out.println(" ");

        // Cerrar el objeto Scanner
        leer.close();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
    }    
}
                                                  