public enum Setor2708 {
    ENGENHARIA("Engenharia"),
    JURIDICO("Juridico"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    MARKETING("Marketing"),
    OPERACOES("Operacoes");

    String nome;

    private Setor2708(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    
}
