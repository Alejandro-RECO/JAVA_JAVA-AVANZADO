// importamos el objeto de Scaner de Java
import java.util.Scanner;

public class EjercicioIV {
    public static void main(String[] args) {

    // Declaramos las variables para nuestro sistema

        String respuesta;
        Scanner leer = new Scanner(System.in);
    
    // Presentamos nuestro programa y solicitamos la información

        System.out.println("¡Hola! queremos saber cual es tu color favarito para determinar cual es tu fruta segun tu eleccion");
        System.out.println("¿Nos podrias decir cual es tu color favorito?");
        respuesta = leer.nextLine();

    // Ejecutamos las condiciones de nuestro sistema para determinar el tipo de fruta asignada   
     
        if(respuesta.equalsIgnoreCase("verde")){
            System.out.println("Grandioso al parecer elegiste " + respuesta + " la fruta asignada para ti es la Manzana");
        }else if (respuesta.equalsIgnoreCase("rojo")){
            System.out.println("Grandioso al parecer elegiste " + respuesta + " la fruta asignada para ti es la Fresa");
        }else if (respuesta.equalsIgnoreCase("morado")){
            System.out.println("Grandioso al parecer elegiste " + respuesta + " la fruta asignada para ti es la Mora");
        }else if (respuesta.equalsIgnoreCase("amarillo")){
            System.out.println("Grandioso al parecer elegiste " + respuesta + " la fruta asignada para ti es el Banano");
        }else if (respuesta.equals("")){
            System.out.println("Ups! al parecer no respondiste nada, y así no podre asignarte una fruta");
        }else{
            System.out.println("Ups! al parecer no tengo una respuesta para " + respuesta + " lo lamento mucho :(");
        }
    
        leer.close();
    }
}
