public class Diretor2708 extends CargodeConfianca2708 implements Contratacao2708{
    
    private final double PREMIO = 0.5;


    public Diretor2708(String nome, String cpf, String rg, Endereco2708 endereco, Setor2708 setor, Sexo2708 sexo,
            String dataNascimento, double salario, Bonificacao2708 bonificacao) {
        super(nome, cpf, rg, endereco, setor, sexo, dataNascimento, salario, bonificacao);
    }

    public double getPREMIO() {
        double premio = 0;
        premio = super.salario * PREMIO;
        return premio;
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
    public double SalarioFinal() {
        double salario = 0;
        salario = super.salario + getPREMIO() + (super.salario * Bonificacao2708.DIRETOR.getValor());
        return salario;
    }

    @Override
    public String toString() {
        return "Dados do Diretor: " + super.toString() + "\nSalario: " + SalarioFinal() + "\nPremio: " + getPREMIO() + "\nBonificacao: " + (super.salario * Bonificacao2708.DIRETOR.getValor());
    }

    
}
