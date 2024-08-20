public abstract class Pessoa1908 {
    protected String id;
    protected String nome;
    protected String telefone;
    protected Endereco1908 endereco;
    
    public Pessoa1908(String id, String nome, String telefone, Endereco1908 endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Endereco1908 getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco1908 endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\nId: " + id + "\nNome: " + nome + "\nTelefone: " + telefone + endereco.toString();
    }
    
}
