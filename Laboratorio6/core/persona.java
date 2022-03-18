package Laboratorio6.core;
import java.util.Random;

public class persona {
    Random aleatorio = new Random();
    String Nombre;
    String ApellidoP;
    String ApellidoM;
    int Edad;
    int ID;

    public persona(){

    }
    public final void setNombre(String nombre){
        this.Nombre = nombre;
    }
    public void setApellidos(String ap, String am){
        this.ApellidoP = ap;
        this.ApellidoM = am;
    }
    public String getNombre(){
        return Nombre;
    }
    public String getApellidos(){
        String ambosApellidos = ApellidoP + " " + ApellidoM;
        return ambosApellidos;
    }
    public void setEdad(int edad){
        if(edad>130 || edad<0){
            System.out.println("Edad inválida");
        }else{
            this.Edad = edad;
        }
    }
    public int getEdad(){
        return Edad;
    }
    protected int getID(){
        return ID;
    }
    protected void createID(int IDD){
        ID = IDD;
    }
    
}
