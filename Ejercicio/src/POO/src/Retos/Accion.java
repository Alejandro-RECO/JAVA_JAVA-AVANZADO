package Retos;

import java.util.Scanner;

public class Accion extends Peliculas {
    private String ambientacion;
    private String protagonista;
    private String violencia;
    private String persecucion;
    private String tiroteo;
    private String enfrentaminetos;
// METODOS




// CONSTRUCTORES

    // Constructro vacio
public Accion(){
}

   // Contructor lleno
public Accion(String ambientacion, String protagonista, String violencia, String persecucion, String tiroteo, String enfrentaminetos){
    this.ambientacion=ambientacion;
    this.protagonista=protagonista;
    this.violencia=violencia;
    this.persecucion=persecucion;
    this.tiroteo=tiroteo;
    this.enfrentaminetos=enfrentaminetos;
}

 
public String getAmbientacion() {
    return ambientacion;
}

    // Getter and Seters 
public void setAmbientacion(String ambientacion) {
    this.ambientacion = ambientacion;
}
public String getProtagonista() {
    return protagonista;
}
public void setProtagonista(String protagonista) {
    this.protagonista = protagonista;
}
public String getViolencia() {
    return violencia;
}
public void setViolencia(String violencia) {
    this.violencia = violencia;
}
public String getPersecucion() {
    return persecucion;
}
public void setPersecucion(String persecucion) {
    this.persecucion = persecucion;
}
public String getTiroteo() {
    return tiroteo;
}
public void setTiroteo(String tiroteo) {
    this.tiroteo = tiroteo;
}
public String getEnfrentaminetos() {
    return enfrentaminetos;
}
public void setEnfrentaminetos(String enfrentaminetos) {
    this.enfrentaminetos = enfrentaminetos;
}
Scanner sc=new Scanner(System.in);
public void registrarGeneroAccion(){
  limpiar();
    
    System.out.println("Cual es la abientacion de la pelicula: ");
    sc.nextLine();
    ambientacion=sc.nextLine();
    System.out.println("Cual es el nombre del protagonista: ");
    protagonista=sc.nextLine();
    System.out.println("cuanta con violencia: ");
    violencia=sc.nextLine();
    System.out.println("Cuenta con persecución: ");
    persecucion=sc.nextLine();
    System.out.println("Cuenta con tiroteo: ");
    tiroteo=sc.nextLine();
    System.out.println("cuenta con enfrentemientos: ");
    enfrentaminetos=sc.nextLine();
   
}




public void mostrarGeneroAccion(){
    System.out.println("Las caracteristicas de la pelicula "+getNombrePelicula()+" son:\n-"+getAmbientacion()+"\n-"+getProtagonista()+"\n-"+getViolencia()+"\n-"+getPersecucion()+"\n-"+getTiroteo()+"\n-"+getEnfrentaminetos());
}

public void limpiar(){
    sc.close();
}
    
}
