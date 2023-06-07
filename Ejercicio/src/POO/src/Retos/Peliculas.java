package Retos;

import java.util.Scanner;

public class Peliculas {
    private int idPelicula;
    private String nombrePelicula; 
    private String clasificacionLSF;

// METODOS 

public void registrarPelicula(){
    Scanner sc = new Scanner(System.in);
    System.out.println("\nIngrese el codigo de la pelicula: ");
    idPelicula = sc.nextInt();
    sc.nextLine();
    System.out.println("\nIngrese el nombre de la pelicula: ");
    nombrePelicula = sc.nextLine();
    System.out.println("\nIngrese la clasificacion de la pelicula: ");
    clasificacionLSF = sc.nextLine();

    sc.close();
}
public void mostrarPelicula(){
    System.out.println("El codigo de la pelicula es: "+getIdPelicula()+"\nEl nombre de la pelicula es: "+getNombrePelicula()+"\n Clasificacion: "+getClasificacionLSF());
}

// CONSTRUCTORE 
    public Peliculas(){
    }
    public Peliculas(int idPelicula, String nombrePelicula, String clasificacionLSF){
        this.idPelicula=idPelicula;
        this.nombrePelicula=nombrePelicula;
        this.clasificacionLSF=clasificacionLSF;
    }
    public int getIdPelicula() {
        return idPelicula;
    }
    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }
    public String getNombrePelicula() {
        return nombrePelicula;
    }
    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }
    public String getClasificacionLSF() {
        return clasificacionLSF;
    }
    public void setClasificacionLSF(String clasificacionLSF) {
        this.clasificacionLSF = clasificacionLSF;
    }

}
