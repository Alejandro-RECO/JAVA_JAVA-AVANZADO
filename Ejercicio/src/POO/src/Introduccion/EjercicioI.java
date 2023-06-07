package Introduccion;

public class EjercicioI {
    private int idAnimal;
    private String nombre;
    private int edad;

    public void registrarAnimal(){

    }
    public void registrarAnimal(String nombre, int edad, int idAnimal){
        this.idAnimal=idAnimal;
        this.nombre=nombre;
        this.edad=edad;
    }
    public int getIdAnimal() {
        return idAnimal;
    }
    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

}
