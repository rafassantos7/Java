public enum Setor2608 {
    RECURSOS_HUMANOS("Recursos Humanos"),
    FINANCEIRO("Financeiro"),
    OPERACOES("Operacoes");

    String nome;

    private Setor2608(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
}
