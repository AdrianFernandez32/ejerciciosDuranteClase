package Laboratorio6.cursos;

public class Materia {
    String Nombre;
    int Creditos;
    int HorasPorSemana;

    public void setNombre(String nombre){
        this.Nombre = nombre;
    }
    public void setCreditos(int creds){
        this.Creditos = creds;
    }
    public void setHrsPWeek(int HPW){
        this.HorasPorSemana = HPW;
    }
    public String getNombre(){
        return Nombre;
    }
    public int getCreditos(){
        return Creditos;
    }
    public int getHPW(){
        return HorasPorSemana;
    }
}
