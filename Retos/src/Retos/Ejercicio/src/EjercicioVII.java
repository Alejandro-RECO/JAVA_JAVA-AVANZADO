import java.util.Scanner;
public class EjercicioVII {
    public static void main(String[] args) {
        String letraI, letraII, letraIII, letraIV;
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido, este es un juego de ahorcados. El juego consiste en adivinar la palabra, cuentas con 4 oportunidades, Mucha suerte");

        // Definimos la siguiente variable para continuar con el proceso, variable declarada: letraII

        System.out.println("Comencemos con el juego, escribe la primera letra: ");
        letraI = leer.nextLine();
        switch(letraI.toLowerCase()){
            case "a":
            System.out.println("Acertaste la letra A pertenece a la palabra a encontar, Recuerda no repetirla ya que solo se encuentra una vez en la palabra");
            break;
            case "m":
            System.out.println("Acertaste la letra M pertenece a la palabra a encontar, Recuerda no repetirla ya que solo se encuentra una vez en la palabra");
            break;
            case "o":
            System.out.println("Acertaste la letra O pertenece a la palabra a encontar, Recuerda no repetirla ya que solo se encuentra una vez en la palabra");
            break;        
            case "r":
            System.out.println("Acertaste la letra R pertenece a la palabra a encontar, Recuerda no repetirla ya que solo se encuentra una vez en la palabra");
            break;           
            default:
            System.out.println("La letra: "+ letraI+ " No pertenece a la palabra a encrontrar sigue intentando, pero recuerda no repitas para que no pierdas tus oportunidades");
            break;
        }
        if(letraI.equalsIgnoreCase("a")||
            letraI.equalsIgnoreCase("m")||
            letraI.equalsIgnoreCase("o")||
            letraI.equalsIgnoreCase("r")){
                switch(letraI.toLowerCase()){
                    case "a":
                    System.out.println("Exelente, la letra A se acomoda asi: A___");
                    break;
                    case "m":
                    System.out.println("Exelente, la letra M se acomoda asi: _M__");
                    break;
                    case "o":
                    System.out.println("Exelente, la letra O se acomoda asi: __O_");
                    break;
                    case "r":
                    System.out.println("Exelente, la letra R se acomoda asi: ___R");
                    break;
                }
            }else{
                System.out.println("Lo lamento, al parecer te equivocaste, sigue intentando y ten mucha suerte :)");

            }
            // Definimos la siguiente variable para continuar con el proceso, variable declarada: letraII

            System.out.println("Sigamos, escribe una nueva letra, prueva tu suerte: ");
            letraII = leer.nextLine();
            switch(letraII.toLowerCase()){
                case "a":
                System.out.println("Acertaste la letra A pertenece a la palabra a encontar, Recuerda no repetirla ya que solo se encuentra una vez en la palabra");
                break;
                case "m":
                System.out.println("Acertaste la letra M pertenece a la palabra a encontar, Recuerda no repetirla ya que solo se encuentra una vez en la palabra");
                break;
                case "o":
                System.out.println("Acertaste la letra O pertenece a la palabra a encontar, Recuerda no repetirla ya que solo se encuentra una vez en la palabra");
                break;        
                case "r":
                System.out.println("Acertaste la letra R pertenece a la palabra a encontar, Recuerda no repetirla ya que solo se encuentra una vez en la palabra");
                break;           
                default:
                System.out.println("La letra: "+ letraII+ " No pertenece a la palabra a encrontrar sigue intentando, pero recuerda no repitas para que no pierdas tus oportunidades");
                break;
            }
            if(letraII.equalsIgnoreCase("a")||
            letraII.equalsIgnoreCase("m")||
            letraII.equalsIgnoreCase("o")||
            letraII.equalsIgnoreCase("r")){
                switch(letraII.toLowerCase()){
                    case "a":
                    System.out.println("Exelente, la letra A se acomoda asi: A___");
                    break;
                    case "m":
                    System.out.println("Exelente, la letra M se acomoda asi: _M__");
                    break;
                    case "o":
                    System.out.println("Exelente, la letra O se acomoda asi: __O_");
                    break;
                    case "r":
                    System.out.println("Exelente, la letra R se acomoda asi: ___R");
                    break;
                }
            }else{
                System.out.println("Lo lamento, al parecer te equivocaste, sigue intentando y ten mucha suerte :)");

            }

            // Definimos la siguiente variable para continuar con el proceso, variable declarada: letraIII

            System.out.println("Sigamos, escribe una nueva letra, prueva tu suerte: ");
            letraIII = leer.nextLine();
            switch(letraIII.toLowerCase()){
                case "a":
                System.out.println("Acertaste la letra A pertenece a la palabra a encontar, Recuerda no repetirla ya que solo se encuentra una vez en la palabra");
                break;
                case "m":
                System.out.println("Acertaste la letra M pertenece a la palabra a encontar, Recuerda no repetirla ya que solo se encuentra una vez en la palabra");
                break;
                case "o":
                System.out.println("Acertaste la letra O pertenece a la palabra a encontar, Recuerda no repetirla ya que solo se encuentra una vez en la palabra");
                break;        
                case "r":
                System.out.println("Acertaste la letra R pertenece a la palabra a encontar, Recuerda no repetirla ya que solo se encuentra una vez en la palabra");
                break;           
                default:
                System.out.println("La letra: "+ letraIII+ " No pertenece a la palabra a encrontrar sigue intentando, pero recuerda no repitas para que no pierdas tus oportunidades");
                break;
            }
            if(letraIII.equalsIgnoreCase("a")||
            letraIII.equalsIgnoreCase("m")||
            letraIII.equalsIgnoreCase("o")||
            letraIII.equalsIgnoreCase("r")){
                switch(letraIII.toLowerCase()){
                    case "a":
                    System.out.println("Exelente, la letra A se acomoda asi: A___");
                    break;
                    case "m":
                    System.out.println("Exelente, la letra M se acomoda asi: _M__");
                    break;
                    case "o":
                    System.out.println("Exelente, la letra O se acomoda asi: __O_");
                    break;
                    case "r":
                    System.out.println("Exelente, la letra R se acomoda asi: ___R");
                    break;
                }
            }else{
                System.out.println("Lo lamento, al parecer te equivocaste, sigue intentando y ten mucha suerte :)");

            }
            // Definimos la siguiente variable para continuar con el proceso, variable declarada: letraIV

            System.out.println("Sigamos, escribe una nueva letra, prueva tu suerte: ");
            letraIV = leer.nextLine();
            switch(letraIV.toLowerCase()){
                case "a":
                System.out.println("Acertaste la letra A pertenece a la palabra a encontar, Recuerda no repetirla ya que solo se encuentra una vez en la palabra");
                break;
                case "m":
                System.out.println("Acertaste la letra M pertenece a la palabra a encontar, Recuerda no repetirla ya que solo se encuentra una vez en la palabra");
                break;
                case "o":
                System.out.println("Acertaste la letra O pertenece a la palabra a encontar, Recuerda no repetirla ya que solo se encuentra una vez en la palabra");
                break;        
                case "r":
                System.out.println("Acertaste la letra R pertenece a la palabra a encontar, Recuerda no repetirla ya que solo se encuentra una vez en la palabra");
                break;           
                default:
                System.out.println("La letra: "+ letraIV+ " No pertenece a la palabra a encrontrar sigue intentando, pero recuerda no repitas para que no pierdas tus oportunidades");
                break;
            }
            if(letraIV.equalsIgnoreCase("a")||
            letraIV.equalsIgnoreCase("m")||
            letraIV.equalsIgnoreCase("o")||
            letraIV.equalsIgnoreCase("r")){
                switch(letraIV.toLowerCase()){
                    case "a":
                    System.out.println("Exelente, la letra A se acomoda asi: A___");
                    break;
                    case "m":
                    System.out.println("Exelente, la letra M se acomoda asi: _M__");
                    break;
                    case "o":
                    System.out.println("Exelente, la letra O se acomoda asi: __O_");
                    break;
                    case "r":
                    System.out.println("Exelente, la letra R se acomoda asi: ___R");
                    break;
                }
            }else{
                System.out.println("Tu letra no coincide con las de la palabra a descrubrir lo lamento.");
            }
            
            if(letraI.equalsIgnoreCase("a")&&
                    letraII.equalsIgnoreCase("m")&&
                    letraIII.equalsIgnoreCase("o")&&
                    letraIV.equalsIgnoreCase("r")){
                        System.out.println("FELICIDADES!! La palabra es AMOR");
                    }
            else{
                System.out.println("Lo lamento, al parecer te equivocaste, y perdiste todas las oportunidades, la palabra era AMOR");

            }
            leer.close();

    }
}
