public enum UnidadeFederativa1908 {
    BAHIA("Bahia","BA"),
    SAO_PAULO("Sao Paulo"),
    RIO_DE_JANEIRO("Rio de Janeiro","RJ");

    private String nome;
    private String sigla;
    
    private UnidadeFederativa1908(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    
}
