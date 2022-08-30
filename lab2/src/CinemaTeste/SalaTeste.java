package CinemaTeste;

import Cinema.Sala;

public class SalaTeste {
    public static void main(String[] args) {
        Sala sala = new Sala(1, 10, 10);
        sala.locarCadeira(2,4, "Eduardo");
        sala.locarCadeira(2,4, "Jorge");
        sala.locarCadeira(3,9, "Nogel");
        sala.locarCadeira(10, 10, "Koll");
        sala.getCadeiras()[1][3].toString();
        sala.listarCadeiras();
    }
}
