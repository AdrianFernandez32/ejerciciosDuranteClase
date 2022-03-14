package ED;

public class cuadrado extends figura implements DosD{
    double lado;
    cuadrado(double l){
        lado = l;
    }
    @Override
    public double area(){
        return lado*lado;
    }
    
}
