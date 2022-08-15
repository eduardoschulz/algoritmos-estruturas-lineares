import java.math.*;
public class Circulo {
    private int x,y, raio;

    public Circulo(int x, int y, int raio){
        this.x = x;
        this.y = y;
        this.raio = raio;
    }
   public Circulo(){
   }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRaio() {
        return raio;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double area(){
        return Math.PI * Math.pow(raio, 2);
    }
    public int diametro(){
        return raio * 2;
    }
    public double circun(){
        return raio * Math.PI;
    }
}
