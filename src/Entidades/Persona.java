package Entidades;

public class Persona {
    protected String nombre;

    public Persona (){

    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public void Saludar (){
        System.out.println("Hola, buenas tardes");

    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

}
