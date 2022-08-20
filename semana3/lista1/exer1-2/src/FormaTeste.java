public class FormaTeste {
    public static void main(String[] args) {
        //cria circulos no forma
        Formas forma = new Formas();
        Circulo[] circulos = new Circulo[5];
        for(int i = 0; i < circulos.length; i++)
            circulos[i] = new Circulo((int) (Math.random()* 10), (int) (Math.random()*10), (int)(Math.random()*10+1));
        forma.setCirculo(circulos);

        //printa valores dos circulos
        for(int i = 0; i < forma.getCirculos().length; i++)
            System.out.println("X " + circulos[i].getX()+"|Y "+circulos[i].getY()+"|Raio "+circulos[i].getRaio());
        
        Formas forma2 = new Formas();
        forma2.setCirculo(forma.getCirculos());
  
        for(int i = 0; i < forma.getCirculos().length; i++)
            System.out.println("X " + circulos[i].getX()+"|Y "+circulos[i].getY()+"|Raio "+circulos[i].getRaio());

        for(int i = 0; i < forma2.getCirculos().length; i++)
            System.out.println("X " + forma2.getCirculos()[i].getX()+"|Y "+forma2.getCirculos()[i].getY()+"|Raio "+forma2.getCirculos()[i].getRaio());

        Circulo[] circulos3 = new Circulo[forma.getCirculos().length];
        circulos3 = forma.getCirculos();
        for(int i = 0; i < circulos.length; i++){
            circulos[i].setRaio(8);
            System.out.println("X " + circulos[i].getX()+"|Y "+circulos[i].getY()+"|Raio "+circulos[i].getRaio());
        }

        for(int i = 0; i < forma.getCirculos().length; i++)
            System.out.println("X " + circulos[i].getX()+"|Y "+circulos[i].getY()+"|Raio "+circulos[i].getRaio());

        for(int i = 0; i < forma2.getCirculos().length; i++)
            System.out.println("X " + forma2.getCirculos()[i].getX()+"|Y "+forma2.getCirculos()[i].getY()+"|Raio "+forma2.getCirculos()[i].getRaio());

        for(int i = 0; i < circulos3.length; i++)
            System.out.println("X " + circulos3[i].getX()+"|Y "+circulos3[i].getY()+"|Raio "+ circulos3[i].getRaio());

    }
}
