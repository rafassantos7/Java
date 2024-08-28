public class Motorista2708 extends Funcionario2708 {
    private String carteiraDeHabilitacao;

    public Motorista2708(String nome, String cpf, String rg, Endereco2708 endereco, Setor2708 setor, Sexo2708 sexo,
            String dataNascimento, double salario, String carteiraDeHabilitacao) {
        super(nome, cpf, rg, endereco, setor, sexo, dataNascimento, salario);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public double SalarioFinal() {
        return super.salario;
    }

    @Override
    public String toString() {
        return "Dados do Motorista:\nCarteira de Habilitacao:" + carteiraDeHabilitacao + super.toString();
    }
    
}
