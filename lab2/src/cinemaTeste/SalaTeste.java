package cinemaTeste;

import cinema.Mapa;
import cinema.Opcoes;
import cinema.Sala;

public class SalaTeste {
    public static void main(String[] args) {
        Sala sala = new Sala(90, 10, 10);
        Opcoes opcoes = new Opcoes(sala);
        Mapa mapa1 = new Mapa(sala);

        mapa1.cadeirasVagas();
        opcoes.locarCadeira(1,1,"ee");
        //opcoes.cancelarCadeira(-1,-1);



    }
}
