package ED;
public class main {
    public static void main(String []args){
        circulo c1 = new circulo(5);
        cuadrado s1 = new cuadrado(6);
        c1.about();
        printInfo display = new printInfo();
        display.printArea(c1);
        display.printArea(s1);
    }
    
}
