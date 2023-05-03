package Retos;
import java.util.Scanner;

public class RetoIII {
    public static void main(String[] args) {
        int numero = (int)(Math.random()*3+1);
        int respuesta; 
        Scanner leer = new Scanner(System.in);
        System.out.println("Elija una opción para jugar 1.piedra 2.papel 3.tijera ");
        respuesta = leer.nextInt();
        if(
            respuesta == 1 && numero == 2 ||
            respuesta == 1 && numero == 1||
            respuesta == 1 && numero == 3){
                String piedraU = "piedra";
                if (numero == respuesta){
                    String piedraM = "piedra";
                System.out.println("Usuario: "+respuesta + " " + piedraU +" maquina: "+numero + " " + piedraM + " Empate"  );
                }else if(numero < respuesta){
                    String papelM = "papel";
                System.out.println("Usuario: "+respuesta + " " + piedraU +" maquina: "+numero + " " + papelM + " Gana la maquina"  );
                }else if(numero > respuesta){
                    String tijerasM = "tijeras";
                System.out.println("Usuario: "+respuesta + " " + piedraU +" maquina: "+numero + " " + tijerasM + " Gana usuario"  );
                }
           }
            if(
                respuesta == 2 && numero == 2 ||
                respuesta == 2 && numero == 1||
                respuesta == 2 && numero == 3){
                    String papelU = "papel";
                    if (numero == respuesta){
                        String papelM = "papel";
                    System.out.println("Usuario: " +respuesta + " " + papelU +" maquina: "+numero + " " + papelM + " Empate"  );
                    }else if(numero < respuesta){
                        String tijerM = "tijera";
                    System.out.println("Usuario: " +respuesta + " " + papelU +" maquina: "+numero + " " + tijerM + " Gana la maquina"  );
                    }else if(numero > respuesta){
                        String piedraM = "piedra";
                    System.out.println("Usuario: " + respuesta + " " + papelU +" maquina: "+numero + " " + piedraM + " Gana usuario"  );
                    }
               }
               if(
                respuesta == 3 && numero == 2 ||
                respuesta == 3 && numero == 1||
                respuesta == 3 && numero == 3){
                    String tijeraU = "tijera";
                    if (numero == respuesta){
                        String tijeraM = "tijera";
                    System.out.println("Usuario: " + respuesta + " " + tijeraU +" maquina: "+ numero + " " + tijeraM + " Empate"  );
                    }else if(numero < respuesta){
                        String piedraM = "piedra";
                    System.out.println("Usuario: " + respuesta + " " + tijeraU +" maquina: "+numero + " " + piedraM + " Gana maquina"  );
                    }else if(numero > respuesta){
                        String papelM = "papel";
                    System.out.println("Usuario: " + respuesta + " " + tijeraU +" maquina: "+numero + " " + papelM + " Gana Usuario"  );
                    }
               }
    
     leer.close();
    }
        
}
