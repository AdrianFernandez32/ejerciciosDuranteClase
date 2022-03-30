package Laboratorio6.core;

import java.util.ArrayList;

import AL.estudiante;
import Laboratorio6.personal.Estudiante;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class university {
    Scanner read;
    String NombreUniversidad;
    int ID;
    ArrayList <Estudiante> EstudiantesRegistrados = new ArrayList<>();
    String datos = "";//Ubicacion del archivo
    String Settings = ""; //Ubicacion del archivo con 0
    File file;
    FileWriter write;

    final String data = "C:\\Users\\oscar\\Documents\\GitHub\\ejerciciosDuranteClase\\Laboratorio6\\resources\\datos.dat";
    final String conf = "C:\\Users\\oscar\\Documents\\GitHub\\ejerciciosDuranteClase\\Laboratorio6\\resources\\Settings.conf";

    university() throws IOException, FileNotFoundException{
        file = new File(conf);
        read = new Scanner(file);
        
        if(!file.exists()){
            if(!file.createNewFile()){
                System.out.println("El archivo no se pudo crear :c");
            }else{
                ID = 0;
                write = new FileWriter(file, false);
                write.write(String.valueOf(ID)+ '\n');
                write.close();
            }
        }else{
            read = new Scanner(file);
            ID = Integer.valueOf(read.nextLine());
            read.close();
            System.out.println(ID);
        }
    }
    public void addStudent(){
        Estudiante E = new Estudiante();
        read = new Scanner(System.in);
        System.out.println("Nombre: ");
        E.Nombre = read.nextLine();
        System.out.println("Apellido paterno: ");
        E.ApellidoP = read.nextLine();
        System.out.println("Apellido materno");
        E.ApellidoM = read.nextLine();
        System.out.println("Edad; ");
        E.Edad = Integer.valueOf(read.nextLine());
        E.ID = ID++;
        EstudiantesRegistrados.add(E);
    }
    public void addStudent(Estudiante E){
        E.ID = ID++;
        EstudiantesRegistrados.add(E);
        //Se agrega el estudiante la Array
    }
    public void removeStudent(int id){
        for(int i=0; i<EstudiantesRegistrados.size(); i++){
            if(id==EstudiantesRegistrados.)
        }
EstudiantesRegistrados.remove(index)
    }
    public void saveStudents(Estudiante E) throws IOException{
        if(!file.exists()){
            if(!file.createNewFile()){
                System.out.println("El acrchivo no se pudo crear UgU");
            }
        }
        write = new FileWriter(file,true);
        write.write(String.valueOf(ID));
        write.write('\n');
        write.write(E.Nombre);
        write.write('\n');
        write.write(E.ApellidoP);
        write.write('\n');
        write.write(E.ApellidoM);
        write.write('\n');
        write.write(String.valueOf(E.Edad));
        write.write('\n');
        write.write("0");
        write.write('\n');
        write.close();
    }
    private void loadStudents(int id) throws FileNotFoundException{
        Estudiante E = new Estudiante();
        file = new File(data);
        read = new Scanner(file);
        int user_ID = 0;
        while(read.hasNextLine() && user_ID!=id){
            user_ID = E.ID = Integer.valueOf(read.nextInt());
            E.Nombre = read.nextLine();
            E.ApellidoP = read.nextLine();
            E.ApellidoM = read.nextLine();
            E.Edad = Integer.valueOf(read.nextLine());
        }
        read.close();
    }
        /*
        if(!file.exists()){
            if(!file.createNewFile()){
                System.out.println("El acrchivo no se pudo crear UgU");
            }
        }
        read.next(String.valueOf(ID));
        read.next(E.Nombre);
        read.next(E.ApellidoP);
        read.next(E.ApellidoM);
        read.next(String.valueOf(E.Edad));
    }*/
    public void listAllStudents(){
        
    }    
    private void saveID(Estudiante E) throws IOException{
        file = new File(conf);
        if(!file.exists()){
            write = new FileWriter(file,false);
            write.write(ID);
            write.close();
        }
    }
}
