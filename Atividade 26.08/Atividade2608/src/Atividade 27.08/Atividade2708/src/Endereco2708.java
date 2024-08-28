public class Endereco2708 {
    private String logradouro;
    private String numero;
    private String complemento;
    private String cep;
    private String cidade;
    private UnidadeFederativa2708 uf;
    
    public Endereco2708(String logradouro, String numero, String complemento, String cep, String cidade,
            UnidadeFederativa2708 uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UnidadeFederativa2708 getUf() {
        return uf;
    }

    public void setUf(UnidadeFederativa2708 uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "\nEndereco:\nLogradouro: " + logradouro +
                "\nNumero: " + numero + "\nComplemento: " + complemento + 
                "\nCep: " + cep + "\nCidade: " + cidade + "\nUf: " + uf.getNome() + "/" + uf.getSigla();
    }

    
}
