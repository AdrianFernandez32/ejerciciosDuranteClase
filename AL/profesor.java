package AL;
import java.util.ArrayList;

public class profesor {
    ArrayList <estudiante> Alumnos = new ArrayList<>();
    String nombre;
    profesor(){
        nombre = "";

    }
    public void altaEstudiante(estudiante e){
        Alumnos.add(e);
    }
    public void addEstudiante(String nombre, String apellido, int edad, int ID){
        estudiante e = new estudiante();
        e.matricula = ID;
        e.nombre = nombre;
        e.apellidoP = apellido;
        e.edad = edad;
        Alumnos.add(e);
    }
    public void downEstudiante(estudiante e){
        Alumnos.remove(e);
    }
    public boolean bajaEstudiante(int matricula){
        int i;
        for(i=0;i<Alumnos.size();i++){
            if(Alumnos.get(i).matricula == matricula){
                Alumnos.remove(i);
                return true;
            }
        }
        return false;
    }
    public void mostrarEstudiantes(){
        for(estudiante e:Alumnos){
            System.out.println(e.nombre+" "+e.apellidoP);
        }
    }
    public void actualizar(estudiante a, estudiante b){
        Alumnos.set(Alumnos.indexOf(a), b);
    }
    
}
