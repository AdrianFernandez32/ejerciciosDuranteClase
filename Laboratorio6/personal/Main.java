package Laboratorio6.personal;

import java.io.FileNotFoundException;
import java.io.IOException;

import Laboratorio6.core.university;
import Laboratorio6.cursos.Materia;

public class Main {
    public static void main (String []args) throws IOException, FileNotFoundException{
        Estudiante Daniel = new Estudiante("Daniel");
        Profesor Gabriel = new Profesor("Gabriel");
        Materia Programacion = new Materia();
        Daniel.generateID();
        Daniel.setNivelDeEstudios("Licenciatura");
        Daniel.setApellidos("Morales", "Henriquez");
        Daniel.setEdad(18);
        System.out.println(Daniel.getNombre());
        System.out.println(Daniel.getApellidos());
        System.out.println(Daniel.getEdad());
        System.out.println(Daniel.getNivel());

        Gabriel.generateID();
        Gabriel.setNivelDeEstudios("Doctorado");
        Gabriel.setEdad(30);
        System.out.println(Gabriel.getNombre());
        System.out.println(Gabriel.getEdad());
        System.out.println(Gabriel.getNivel());   

        Programacion.setNombre("Programacion");
        Programacion.setCreditos(5);
        Programacion.setHrsPWeek(5);
        System.out.println(Programacion.getCreditos());
        System.out.println(Programacion.getHPW());
        System.out.println(Programacion.getNombre());
        
        university cetys = new university();
        cetys.addStudent(Daniel);
        cetys.addStudent();
    }
    
}
