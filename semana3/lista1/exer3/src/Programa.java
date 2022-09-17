public class Programa {
    public static void main(String[] args) {
        Nota[] notas = new Nota[20];
        int[] contagem = new int[10];
        for(int i=0; i < notas.length; i++){
            int value = (int)(Math.random()*10);
            notas[i] = new Nota(value);
        }

        //for(int j=0; j < notas.length; j++)
          //  System.out.println("Notas: "+ notas[j].getValue());

        for (int i = 0; i < notas.length; i++){
            contagem[notas[i].getValue()]++;
        }

        for (int i = 0; i < contagem.length; i++) {
            System.out.print("nota"+contagem[i] +": ");
            for (int j = 0; j < contagem[i]; j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}