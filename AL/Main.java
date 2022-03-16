package AL;

import java.util.ArrayList;

public class Main {
    public static void main(String []args) {
        estudiante Manuel = new estudiante("Adrian", "Fernandez");
        estudiante Adrian = new estudiante("Manuel", "Ruiz");
        estudiante Daniel = new estudiante("Daniel", "Joto");
        profesor Alejandro = new profesor();
        Alejandro.altaEstudiante(Adrian);
        Alejandro.altaEstudiante(Manuel);
        Alejandro.altaEstudiante(Daniel);
        Alejandro.mostrarEstudiantes();
        System.out.println("-----------");
        
        estudiante DinoDani = Daniel;
        DinoDani.nombre = "Dino Dani";
        Alejandro.actualizar(Daniel, DinoDani);
        Alejandro.mostrarEstudiantes();
        System.out.println("------------");
        Alejandro.downEstudiante(Daniel);
        Alejandro.mostrarEstudiantes();
        
        Alejandro.bajaEstudiante(Manuel.matricula);
        /*
        ArrayList <Integer> calificaciones = new ArrayList<>();
        calificaciones.add(10);
        calificaciones.add(9);
        calificaciones.add(8);
        calificaciones.add(9);
        calificaciones.add(7);
        //Para remover
        calificaciones.remove(0);
        for(int i=0; i<calificaciones.size(); i++){
            System.out.println(calificaciones.get(i));
        }*/
    }
    
}
