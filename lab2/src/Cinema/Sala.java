package Cinema;

public class Sala {
    private Cadeira[][] cadeiras;
    private int numero, num_colunas, num_fileiras;
    private String status, filme;

    public Sala(int numero, int num_colunas, int num_fileiras) {
        this.numero = numero;
        this.num_colunas = num_colunas;
        this.num_fileiras = num_fileiras;
        cadeiras = new Cadeira[num_fileiras][num_colunas];
    }

    public Sala(int numero, int num_colunas, int num_fileiras, String status, String filme) {
        this.numero = numero;
        cadeiras = new Cadeira[num_fileiras][num_colunas];
        this.num_colunas = num_colunas;
        this.num_fileiras = num_fileiras;
        this.status = status;
        this.filme = filme;
    }

    public Cadeira[][] getCadeiras() {
        return cadeiras;
    }

    public void setCadeiras(Cadeira[][] cadeiras) {
        this.cadeiras = cadeiras;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public boolean locarCadeira(int fileira, int coluna, String nome){
        fileira = fileira - 1;
        coluna = coluna - 1;
        if((fileira > num_fileiras || fileira < 0) || (coluna > num_colunas || coluna < 0)) {
            System.out.println("Erro! Posição Inválida");
            return false;
        }
        if(cadeiras[fileira][coluna] != null) {
            System.out.println("Cadeira Ocupada!");
            return false;
        }
        cadeiras[fileira][coluna] = new Cadeira(fileira, coluna, nome);
        System.out.println("Cadeira Locada");
        return true;
    }

    public void listarCadeiras(){
        for(int i = 0; i < cadeiras.length; i++) {
            for (int j = 0; j < cadeiras[0].length; j++) {
                if (cadeiras[i][j] != null)
                    System.out.print(cadeiras[i][j].toString());
                else
                    System.out.print(" - ");
            }
            System.out.println();
        }
    }





}
