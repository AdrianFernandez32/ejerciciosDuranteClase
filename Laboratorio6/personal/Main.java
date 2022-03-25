package Laboratorio6.personal;

import Laboratorio6.cursos.Materia;

public class Main {
    public static void main (String []args){
        Estudiante Manuel = new Estudiante("Manuelito");
        Profesor Carlos = new Profesor("Alemán");
        Materia Matematicas = new Materia();
        Manuel.setNivelDeEstudios("Licenciatura");
        Manuel.setNombre("Manuel");
        Carlos.setNivelDeEstudios("Doctorado");
        Carlos.setNombre("Carlos");
        Matematicas.setCreditos(10);
        Matematicas.setNombre("Matemáticas");
    }
    
}
