import java.util.Scanner;
import java.math.*;
public class Formas {
    private Circulo[] circulos;

    Scanner inp = new Scanner(System.in);
    public Formas(int size_a){
        Circulo[] circulos = new Circulo[size_a];
        for(int i = 0; i < circulos.length; i++)
            circulos[i] = new Circulo(inp.nextInt(), inp.nextInt(), inp.nextInt());
    }
    public Formas(){
        Circulo[] circulos = new Circulo[5];

    }

    public Circulo[] getCirculos() {
        return circulos;
    }
    public void setCirculo(Circulo[] circ){
        this.circulos = circ;
    }

}
