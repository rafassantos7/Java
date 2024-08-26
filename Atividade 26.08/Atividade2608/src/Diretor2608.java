public class Diretor2608 extends Funcionario2608 implements Contratacao2608{
    private final double PREMIO = 0.2;
    
    @Override
    public double SalarioFinal() {
       double salario = 0;
       salario = super.SalarioBase + (super.SalarioBase * PREMIO);
       return salario;
    }

    @Override
    public void admitir(Funcionario2608 funcionario) {
        System.out.println("Funcionario admitido. ");
        System.out.println("Dados do funcionario: ");
        System.out.println(funcionario.toString());
    }
    
    @Override
    public void demitir(Funcionario2608 funcionario) {
        System.out.println("Funcionario demitido. ");
        System.out.println("Dados do funcionario: ");
        System.out.println(funcionario.toString());
    }


    public Diretor2608(String nome, String dataNascimento, Sexo2608 sexo, Setor2608 setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }

    public double getPREMIO() {
       double premio;
       premio = super.SalarioBase * PREMIO;
       return premio;
    }

    

    @Override
    public String toString() {
        return super.toString() + "\nSalario: " + SalarioFinal() + "\nPremio: " + this.getPREMIO();
    }
}