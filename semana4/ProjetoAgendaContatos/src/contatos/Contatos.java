package contatos;

public class Contatos {

    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco;
    private TipoContato tipo;

    public Contatos(String nome, String telefone, String email, Endereco endereco, TipoContato tipo) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public TipoContato getTipo() {
        return tipo;
    }

    public void setTipo(TipoContato tipo) {
        this.tipo = tipo;
    }
}
