package Encapsulamiento.encapsulamientoGUI;
public class persona {
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private int edad;
    protected int ID;
    protected String usuario;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    persona(){
        nombre = "Adrian";
        edad = 0;
    }
    public persona(String Nombre){
        this.nombre = Nombre;
    }
}
