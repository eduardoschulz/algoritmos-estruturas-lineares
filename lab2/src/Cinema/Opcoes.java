package Cinema;

public class Opcoes {
    private Sala sala;

    public Opcoes(Sala sala){
        this.sala = sala;
    }

    public boolean locarCadeira(int fileira, int coluna, String nome){
        fileira = fileira - 1;
        coluna = coluna - 1;
        if((fileira > sala.getNum_fileiras() || fileira < 0) || (coluna > sala.getNum_colunas()|| coluna < 0)) {
            System.out.println("Erro! Posição Inválida");
            return false;
        }
        if(sala.getCadeiras()[fileira][coluna] != null) {
            System.out.println("Cadeira Ocupada!");
            return false;
        }
        sala.getCadeiras()[fileira][coluna] = new Cadeira(fileira, coluna, nome);
        System.out.println("Cadeira Locada");
        return true;
    }

    public boolean cancelarCadeira(int fileira, int coluna){
        if((fileira > sala.getNum_fileiras() || fileira < 0) || (coluna > sala.getNum_colunas() || coluna < 0)) {
            System.out.println("Erro! Posição Inválida");
            return false;
        }

        sala.getCadeiras()[fileira][coluna] = null;
        System.out.println("Reserva Cancelada!");
        return true;
    }




}
