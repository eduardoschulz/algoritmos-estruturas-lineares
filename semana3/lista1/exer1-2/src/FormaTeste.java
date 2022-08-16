public class FormaTeste {
    public static void main(String[] args) {
        Formas forma = new Formas();

        Circulo[] circulos = new Circulo[5];
        for(int i = 0; i < circulos.length; i++)
            circulos[i] = new Circulo((int) (Math.random()* 10), (int) (Math.random()*10), (int)(Math.random()*10+1));
        forma.setCirculo(circulos);
        System.out.println(circulos);

        for(int i = 0; i < forma.getCirculos().length; i++)
            System.out.println("X " + circulos[i].getX()+"|Y "+circulos[i].getY()+"|Raio "+circulos[i].getRaio());

        Formas forma2 = new Formas();

        forma2.setCirculo(circulos);

        Circulo[] circulos3 = new Circulo[circulos.length];
        circulos3 = circulos;

        //alterar os valores dos circulos, no caso para 8 sla

        for(int i = 0; i < circulos.length; i++){
            circulos[i].setRaio(8);
            System.out.println("X " + circulos[i].getX()+"|Y "+circulos[i].getY()+"|Raio "+circulos[i].getRaio());
        }
    }
}
