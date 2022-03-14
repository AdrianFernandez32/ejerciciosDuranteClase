package Encapsulamiento.encapsulamientoGUI;

public class profesor extends persona{
    public profesor(){
        //nombre = "David";
        ID = 4655;
    }
    void setUsuario(){
        this.usuario = "profesor:"+this.getNombre();
    }
}
