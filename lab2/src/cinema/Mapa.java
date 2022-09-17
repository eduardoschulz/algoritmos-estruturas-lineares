package cinema;

public class Mapa {
    private final Sala sala;

    public Mapa(Sala sala){
        this.sala = sala;
    }

    public void listarCadeiras() {
        for (int i = 0; i < sala.getCadeiras().length; i++) {
            System.out.printf("%c", (i+'a'));
            for (int j = 0; j < sala.getCadeiras()[0].length; j++) {
                if (sala.getCadeiras()[i][j] != null)
                    System.out.print(sala.getCadeiras()[i][j].toString());
                else
                    System.out.print(" - ");
            }
            System.out.println();
        }
        System.out.print(" ");
        for (int i = 0; i < sala.getCadeiras()[0].length - 1; i++) {
            System.out.print(" " + (i + 1) + " ");
        }
    }

    public int cadeirasVagas() {
        int vagas = 0;
        for(int i = 0;i<sala.getCadeiras().length;i++){
        for (int j = 0; j < sala.getCadeiras()[0].length; j++)
            if (sala.getCadeiras()[i][j] == null)
                vagas++;
        }
        return vagas;
    }

}