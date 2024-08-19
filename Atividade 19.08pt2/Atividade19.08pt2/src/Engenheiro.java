public class Engenheiro extends Funcionarios1908pt2 {
    private String crea;

    public Engenheiro(String nome, String cpf, String rg, double salario, String crea) {
        super(nome, cpf, rg, salario);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "\nEngenheiro :\n " + super.toString() +
        "\nCrea = " + crea;
    }
    
}
