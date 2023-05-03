package Retos;
import java.util.Scanner;

public class RetoV {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String mes;
        int fecha;
        // preguntamos al usuario el mes que nacio
        System.out.println("Ingrese el mes en el que nacio");
        mes =leer.nextLine();
        // PARTIENDO DEL MES EN QUE NACIO SE DETERMINA EL DIA Y SE INDICA EL SIGNO ZODIACAL Y SUS PRINCIPALES CARACTERIZTICAS 
        if(mes.equalsIgnoreCase("marzo")){
            System.out.println("Dia de nacimento");
            fecha = leer.nextInt();
            if(fecha >=1 && fecha <= 20){
                System.out.println("Signo: Picis \nCaracterísticas: sensibilidad, intuición, compasión, indecisión");
            }
            else if(fecha >=21 && fecha <= 31){
                System.out.println("Signo: Aries \nCaracterísticas: valentía, entusiasmo, impulsividad, liderazgo");
            }
        }
        if(mes.equalsIgnoreCase("abril")){
            System.out.println("Dia de nacimento");
            fecha = leer.nextInt();
            if(fecha >= 1 && fecha <= 19){
                System.out.println("Signo: Aries \nCaracterísticas: valentía, entusiasmo, impulsividad, liderazgo");
            }else if (fecha >= 20 && fecha <=30 ){
                System.out.println("Signo: tauro \nCaracterísticas: estabilidad, perseverancia, sensualidad, terquedad");
            }
        }
        if(mes.equalsIgnoreCase("mayo")){
            System.out.println("Dia de nacimento");
            fecha = leer.nextInt();
            if(fecha >=1 && fecha <=20){
                System.out.println("Signo: tauro \nCaracterísticas: estabilidad, perseverancia, sensualidad, terquedad");
            }else if(fecha >= 21 && fecha <=31 ){
                System.out.println("Signo: Géminis \nCaracterísticas: curiosidad, versatilidad, comunicación, inconstancia");
            }
        }
        if(mes.equalsIgnoreCase("junio")){
            System.out.println("Dia de nacimento");
            fecha = leer.nextInt();
            if(fecha >=1 && fecha<=20){
                System.out.println("Signo: Géminis \nCaracterísticas: curiosidad, versatilidad, comunicación, inconstancia");
            }else if(fecha >= 21 && fecha <=30){
                System.out.println("Signo: Cáncer \nCaracterísticas: sensibilidad, protección, nostalgia, cambiante de humor");
            }
        }
        if(mes.equalsIgnoreCase("julio")){
            System.out.println("Dia de nacimento");
            fecha = leer.nextInt();
            if(fecha >=1 && fecha <=22){
                System.out.println("Signo: Cáncer \nCaracterísticas: sensibilidad, protección, nostalgia, cambiante de humor");
            }else if(fecha >=23 && fecha <=31){
                System.out.println("Signo: Leo \nCaracterísticas: creatividad, generosidad, pasión, egocentrismo");
            }
        }
        if(mes.equalsIgnoreCase("agosto")){
            System.out.println("Dia de nacimento");
            fecha = leer.nextInt();
            if(fecha >=1 && fecha <=22){
                System.out.println("Signo: Leo \nCaracterísticas: creatividad, generosidad, pasión, egocentrismo");
            }else if(fecha >=23 && fecha <=31){
                System.out.println("Signo: Virgo \nCaracterísticas: orden, perfeccionismo, discreción, autoexigencia");
            }
        }
        if(mes.equalsIgnoreCase("septiembre")){
            System.out.println("Dia de nacimento");
            fecha = leer.nextInt();
            if(fecha >=1 && fecha <=22){
                System.out.println("Signo: Virgo \nCaracterísticas: orden, perfeccionismo, discreción, autoexigencia");
            }else if(fecha >=23 && fecha <=31){
                System.out.println("Signo: Libra \nCaracterísticas: equilibrio, diplomacia, elegancia, indecisión");
            }
        }
        if(mes.equalsIgnoreCase("octubre")){
            System.out.println("Dia de nacimento");
            fecha = leer.nextInt();
            if(fecha >=1 && fecha <=22){
                System.out.println("Signo: Libra \nCaracterísticas: equilibrio, diplomacia, elegancia, indecisión");
            }else if(fecha >=23 && fecha <=31){
                System.out.println("Signo: Escorpio \nCaracterísticas: intensidad, pasión, misterio, resentimiento");
            }
        }
        if(mes.equalsIgnoreCase("noviembre")){
            System.out.println("Dia de nacimento");
            fecha = leer.nextInt();
            if(fecha >=1 && fecha <=21){
                System.out.println("Signo: Escorpio \nCaracterísticas: intensidad, pasión, misterio, resentimiento");
            }else if(fecha >=22 && fecha <=30){
                System.out.println("Signo: Sagitario \nCaracterísticas: optimismo, aventura, sinceridad, imprudencia");
            }
        }
        if(mes.equalsIgnoreCase("diciembre")){
            System.out.println("Dia de nacimento");
            fecha = leer.nextInt();
            if(fecha >=1 && fecha <=21){
                System.out.println("Signo: Sagitario \nCaracterísticas: optimismo, aventura, sinceridad, imprudencia");
            }else if(fecha >=22 && fecha <=31){
                System.out.println("Signo: Capricornio \nCaracterísticas: ambición, disciplina, prudencia, rigidez");
            }
        }
        if(mes.equalsIgnoreCase("enero")){
            System.out.println("Dia de nacimento");
            fecha = leer.nextInt();
            if(fecha >=1 && fecha <=19){
                System.out.println("Signo: Capricornio \nCaracterísticas: ambición, disciplina, prudencia, rigidez");
            }else if(fecha >=20 && fecha <=31){
                System.out.println("Signo: Acuario \nCaracterísticas: originalidad, independencia, humanitarismo, rebeldía");
            }
        }
        if(mes.equalsIgnoreCase("febrero")){
            System.out.println("Dia de nacimento");
            fecha = leer.nextInt();
            if(fecha >=1 && fecha <=18){
                System.out.println("Signo: Acuario \nCaracterísticas: originalidad, independencia, humanitarismo, rebeldía");
            }else if(fecha >=19 && fecha <=28){
                System.out.println("Signo: Piscis \nCaracterísticas: sensibilidad, intuición, compasión, indecisión");
            }
        }
    leer.close();
    }

}
