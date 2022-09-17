package cinema;

import cinema.expection.PosicaoInvalidaException;

public class Opcoes {
    private final Sala sala;

    public Opcoes(Sala sala){
        this.sala = sala;
    }

    public void locarCadeira(int fileira, int coluna, String nome){
        coluna = coluna - 1;

        if((fileira > sala.getNum_fileiras() || fileira < 0) || (coluna >
                sala.getNum_colunas() || coluna < 0)) {
            System.out.println("Posicão Inválida!");
            return;
        }
        else if(sala.getCadeiras()[fileira][coluna] != null) {
            System.out.println("Erro! Cadeira Ocupada");
            return;
        }
        else
        sala.getCadeiras()[fileira][coluna] = new Cadeira(fileira, coluna, nome);
        System.out.println("Cadeira Locada");
    }

    public void cancelarCadeira(char fileira, int coluna){
        if((fileira > sala.getNum_fileiras() || fileira < 0) || (coluna > sala.getNum_colunas() || coluna < 0)) {
            throw new PosicaoInvalidaException("Erro! Posição Inválida");
        }

        sala.getCadeiras()[fileira][coluna] = null;
        System.out.println("Reserva Cancelada!");
    }




}
