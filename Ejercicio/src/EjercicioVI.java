import java.util.Scanner;
public class EjercicioVI {
    public static void main(String[] args) {
        // Declaramos las variables del sistema
        int num1, num2, suma, resta, multiplicacion, divicion, operado;
        String respuesta;
        // Solicitamos la informacion al usuario y la almacenamos, instanciamos el objeto scaner de javax 
        
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Que operación deseas realizar? \n Suma \n Resta \n Multiplicacion \n Divición \n Potenciación");
        respuesta = leer.nextLine();
        // Hacemos un condicinal para aclarar que solo se utilicen las operaciones del sistema
        if(respuesta.equalsIgnoreCase("suma")||
            respuesta.equalsIgnoreCase("resta")||
            respuesta.equalsIgnoreCase("multiplicacion")||
            respuesta.equalsIgnoreCase("divicion")||
            respuesta.equalsIgnoreCase("potenciacion")){
        // Ejecutamos el sistema partiendo de la respuesta, pedimos los numeros a calcular
                System.out.println("Digite los numeros a realizar el calculo: \nprimer numero: ");
                num1 = leer.nextInt();
                System.out.println("Segundo numero: ");
                num2 = leer.nextInt();
        // Ejecutamos la operacion elegida, y mostramos el resultado
                switch(respuesta.toLowerCase()){
                    case "suma":
                    suma = num1 + num2;
                    operado = suma;
                    System.out.println("Resultado de "+num1+ " + "+ num2 + " es: "+operado+ ".");
                    break;
                    case "resta":
                    resta = num1 - num2;
                    operado = resta;
                    System.out.println("Resultado de "+num1+ " - "+ num2 + " es: "+operado+ ".");
                    break;
                    case "multiplicacion":
                    multiplicacion = num1 * num2;
                    operado = multiplicacion;
                    System.out.println("Resultado de "+num1+ " * "+ num2 + " es: "+operado+ ".");
                    break;
                    case "divicion":
                    divicion = num1 / num2;
                    operado = divicion;
                    System.out.println("Resultado de "+num1+ " / "+ num2 + " es: "+operado+ ".");
                    break;
                    case "potenciacion":
                    System.out.println("Resultado de "+num1+ " potneciado "+ num2 + " es: "+ Math.pow(num1, num2)+ ".");
                    break;
            }
        // Mostramos alerta si no se elige ninguna opción ni se digita algun parametro
        }else if (respuesta.equals("")){
            System.out.println("No elegiste ninguna operación intenta de nuevo.");
        }
        // Mostramos alerta por operacion o dato no aclarado
        else{
              System.out.println("No se reconoce la operacion a realizar.");
        }
        System.out.println("Gracias por utilizar el sistema :)");
        // Finalizamos el beff
        leer.close();
    }
}
