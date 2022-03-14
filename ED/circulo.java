package ED;

public class circulo extends figura implements DosD{
    double radio;
    circulo(double r){
        radio = r;
    }
    @Override
    public double area(){
        return Math.pow(3.1416, 2)*radio;
    }
}
