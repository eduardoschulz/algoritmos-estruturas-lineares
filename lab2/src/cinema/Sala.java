package cinema;

public class Sala {
    private Cadeira[][] cadeiras;
    private int numero;
    private final int num_colunas;
    private final int num_fileiras;
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

    public int getNum_colunas() {
        return num_colunas;
    }

    public int getNum_fileiras() {
        return num_fileiras;
    }
 }


























