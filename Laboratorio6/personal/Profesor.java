package Laboratorio6.personal;
import java.util.Random;

import Laboratorio6.core.persona;

public class Profesor extends persona implements Matricula{
    Random aleatorio = new Random();
    String GradoDeEstudios;
    public Profesor(String Nombre){
        super(Nombre);
        setNombre(Nombre);
        createID(generateID());
    }
    final public void setNivelDeEstudios(String GE){
        if(GE == "Licenciatura" || GE == "Maestria" || GE == "Doctorado"){
            this.GradoDeEstudios = GE;
        }else{
            System.out.println("No tienes el grado suficiente para dar clases");
        }
    }
    final public String getNivel(){
        return GradoDeEstudios;
    }
    @Override
    final public int generateID(){
        return ID = aleatorio.nextInt(100000);
    }

    private void createID(int generateID) {
        System.out.println(ID);
    }
}
