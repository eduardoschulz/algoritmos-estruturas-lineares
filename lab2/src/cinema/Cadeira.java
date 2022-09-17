package cinema;

public class Cadeira {
    private int colula, fileira;
    private String nome;

    public Cadeira(int fileira, int colula, String nome) {
        this.fileira = fileira;
        this.colula = colula;
        this.nome = nome;
    }

    public int getFileira() {
        return fileira;
    }

    public void setFileira(int fileira) {
        this.fileira = fileira;
    }

    public int getColula() {
        return colula;
    }

    public void setColula(int colula) {
        this.colula = colula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return " * ";
    }
}
