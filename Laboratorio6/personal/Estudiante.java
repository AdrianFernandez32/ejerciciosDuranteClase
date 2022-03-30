package Laboratorio6.personal;

import Laboratorio6.core.persona;
import java.util.Random;

public class Estudiante extends persona implements Matricula{

    Random aleatorio = new Random();

    public Estudiante(String Nombre){
        super(Nombre);
        setNombre(Nombre);
        createID(generateID());
    }
    public Estudiante() {
        
    }
    /*public Estudiante(String Nombre){
        setNombre(Nombre);
        
    }*/
    String Nivel;
    final public void setNivelDeEstudios(String NE){
        if(NE == "Licenciatura"|| NE == "Preparatoria" || NE == "Maestría")
            this.Nivel = NE;
        else{
            System.out.println("Error, ese nivel no se encuentra en este campus");
        }
    }
    final public String getNivel(){
        return Nivel;
    }
    @Override
    public final int generateID(){
        return ID = aleatorio.nextInt(100000);
    }
    protected void createID(int generateID) {
        System.out.println(ID);
    }
}
