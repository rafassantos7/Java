public enum Bonificacao2708 {
    GERENTE(0.35),
    DIRETOR(0.45);

    private double valor;

    private Bonificacao2708(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    
}
