public enum Sexo1908 {
    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private String sexo;

    private Sexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }
    
}
