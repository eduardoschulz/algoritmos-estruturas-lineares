package CinemaTeste;

import Cinema.Mapa;
import Cinema.Sala;

public class SalaTeste {
    public static void main(String[] args) {
        Sala sala = new Sala(90, 10, 10);

        Mapa mapa1 = new Mapa(sala);

        mapa1.cadeirasVagas();



    }
}
