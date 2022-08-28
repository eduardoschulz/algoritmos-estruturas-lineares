package contatos;

public class Endereco {
    private String cep;
    private String nomeRua;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;
    private String pais;

    public Endereco(String cep, String numero, String nomeRua, String uf, String pais){
        this.cep = cep;
        this.numero = numero;
        this.nomeRua = nomeRua;
        this.uf = uf;
        this.pais = pais;
    }
}
