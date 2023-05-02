import java.util.Scanner;

public class EjercicioVIV {
    public static void main(String[] args) {
        // INSTANCIAMOS EL OBJETO SCANNER PARA ALMACENAR DATOS EN CONSOLA 
        Scanner scanner = new Scanner(System.in);
        // DECLARAMOS LAS VARIABLES NECESARIAS PARA NUESTRO SISTEMA Y LAS INICALIZAMOS DADOP EL CASO
        String respuesta = "";
        int calificacion;
        boolean reiniciar = true;
        int intentos = 3;
        // INICIALIZAMOS UN WHILE QUE SE ENCARGE DE PREGUNTAR AL USUARIO SOBRE SI ESTA SEGURO DE SU RESPUESTA, CONTANDO ESTE CON 3 OPORTUNIDADES
        while (reiniciar && intentos > 0) {
            System.out.print("Ingrese su respuesta: ");
            respuesta = scanner.nextLine();
            
            System.out.print("¿Desea restablecer su respuesta? (S/N): ");
            String opcion = scanner.nextLine().toLowerCase();
            // COMPARAMOS OPCION ELEGIDA POR USUARIO Y EJECUTAMOS  CONDICIONALES PARA DETERMINAR UN CAMINO
            if (opcion.equalsIgnoreCase("s")) {
                intentos--;
                if (intentos == 0) {
                    System.out.println("Se acabaron los intentos.");
                    reiniciar = false;
                    break;
                }
                continue;
            } else if (opcion.equalsIgnoreCase("n")) {
                reiniciar = false;
            }
            
        }
        // CUANDO LOS DATOS INGRESADOS POR EL USUARIO NO CONCLUYEN A UN VALOR LOGICO, EL SISTEMA NO RESPONDE
        if (reiniciar == true) {
            System.out.println("¡INDEFINIDO!");
        // AL CONCLUIR CUALQUIERA DE LOS CAMINOS POSIBES DENTRO DEL SISTEMA, SE EJECUTA LA CALIFICACION DE LA RESPUESTA
        }else{
                 System.out.println("Ingrese una calificacion para: "+ respuesta+". Entre 0 a 100");
                 calificacion = scanner.nextInt();
                 if(calificacion >=0 && calificacion <= 19){
                    System.out.println("El trabajo obtuvo: 1 ESTRELLA");
                 }else if (calificacion >=20 && calificacion <= 39){
                    System.out.println("El trabajo obtuvo: 2 ESTRELLA");
                 }else if (calificacion >=40 && calificacion <= 69){
                    System.out.println("El trabajo obtuvo: 3 ESTRELLA");
                 }else if (calificacion >=70 && calificacion <= 89){
                    System.out.println("El trabajo obtuvo: 4 ESTRELLA");
                 }else if (calificacion >=90 && calificacion <= 100){
                    System.out.println("El trabajo obtuvo: 5 ESTRELLA");
                 }else{
                    System.out.println("La calificacion: "+ calificacion+" es un valor indefinidio");
                 }

            }
        scanner.close();
        }
    }
    

    

