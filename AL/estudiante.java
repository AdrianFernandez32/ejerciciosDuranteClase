package AL;
import java.util.Random;

public class estudiante {
    public estudiante(){
        matricula = new Random().nextInt(1000000);
    }
    public estudiante(String nombre, String apellido){
        this.nombre = nombre;
        this.apellidoP = apellido;
    }
    int matricula;
    String nombre;
    String apellidoP;
    int edad;
}
