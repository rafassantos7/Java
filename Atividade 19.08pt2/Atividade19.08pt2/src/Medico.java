public class Medico extends Funcionarios1908pt2 {
    private String crm;

   

    public Medico(String nome, String cpf, String rg, double salario, String crm) {
        super(nome, cpf, rg, salario);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "\nMedico: \n" + super.toString() + 
        "\nCrm: " + crm;
    }
    
}
