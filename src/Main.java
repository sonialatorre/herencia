import Entidades.Persona;
import Entidades.Sonia;

public class Main {
    public static void main (String[] args){
    Persona persona1= new Persona( "sonia");
     System.out.println(persona1);
    persona1.Saludar();

    Sonia sonia1= new Sonia ("María", 40);
    System.out.println(sonia1);
    sonia1.Saludar();

    }
}


