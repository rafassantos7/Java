public class Gerente2708 extends CargodeConfianca2708 implements Contratacao2708{

    public Gerente2708(String nome, String cpf, String rg, Endereco2708 endereco, Setor2708 setor, Sexo2708 sexo,
            String dataNascimento, double salario, Bonificacao2708 bonificacao) {
        super(nome, cpf, rg, endereco, setor, sexo, dataNascimento, salario, bonificacao);
    }

    @Override
    public double SalarioFinal() {
        double salario = 0;
        salario = super.salario + (super.salario * Bonificacao2708.GERENTE.getValor()); 
        return salario;
    }

    @Override
    public void admitir(Funcionario2708 funcionario) {
        System.out.println("Voce esta admitido.");
        System.out.println("Dados do Gerente demitido:");
        System.out.println(super.toString());
    }
    
    @Override
    public void demitir(Funcionario2708 funcionario) {
        System.out.println("Voce esta demitido.");
        System.out.println("Dados do Gerente demitido:");
        System.out.println(super.toString());
    }
    
    @Override
    public String toString() {
        return "Dados do Gerente:" + super.toString() + "\nSalario: " + SalarioFinal() + "\nBonificacao: " + (SalarioFinal() - super.salario);
    }
}
