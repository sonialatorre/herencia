package Entidades;

public class Sonia extends Persona {

    protected int Edad;

    public Sonia (){

    }

    public Sonia(int edad) {
        Edad = edad;
    }

    public Sonia(String nombre, int edad) {
        super(nombre);
        Edad = edad;
    }

    @Override
    public void Saludar() {
        System.out.println("feliz año nuevo");
    }

    @Override
    public String toString() {
        return "Sonia{" +
                "Edad=" + Edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
