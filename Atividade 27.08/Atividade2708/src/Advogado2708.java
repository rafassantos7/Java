public class Advogado2708 extends Funcionario2708 {
    private String oab;

    public Advogado2708(String nome, String cpf, String rg, Endereco2708 endereco, Setor2708 setor, Sexo2708 sexo,
            String dataNascimento, double salario, String oab) {
        super(nome, cpf, rg, endereco, setor, sexo, dataNascimento, salario);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public double SalarioFinal() {
        return super.salario;
    }

    @Override
    public String toString() {
        return "Dados do advogado:\nOab: " + oab + super.toString();
    }
    
}
