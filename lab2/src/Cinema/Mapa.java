package Cinema;
import Utils.Utils;
public class Mapa {
    private Utils utils = new Utils();
    private Sala sala;

    public Mapa(Sala sala){
        this.sala = sala;
    }

    public void listarCadeiras() {
        for (int i = 0; i < sala.getCadeiras().length; i++) {
            System.out.print(Character.toUpperCase(utils.getAlphabet()[i]));
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

    public int cadeirasVagasFileira(int fileira){
        int vagas = 0;
        for (int j = 0; j < sala.getCadeiras()[0].length; j++)
        if(sala.getCadeiras()[fileira-1][j] == null)
            vagas++;
        return vagas;
    }
}