package Encapsulamiento.encapsulamiento;

public class productos {
    private double costo;
    private String nombre;

    public void setCosto(double c){
        if(c<0){
            System.out.println("Error, costo no permitido");
        }else{
            costo =c;
        }
    }
    public double getCosto(){
        return costo;
    }
}
