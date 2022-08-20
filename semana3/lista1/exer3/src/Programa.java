public class Programa {
    public static void main(String[] args) {
        Nota[] notas = new Nota[100];

        for(int i=0; i < notas.length; i++){
            notas[i] = new Nota((int) Math.random()*10);
        }


    }
}