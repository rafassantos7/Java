public abstract class CargodeConfianca2708 extends Funcionario2708 {
    
    Bonificacao2708 bonificacao;

    public CargodeConfianca2708(String nome, String cpf, String rg, Endereco2708 endereco, Setor2708 setor,
            Sexo2708 sexo, String dataNascimento, double salario, Bonificacao2708 bonificacao) {
        super(nome, cpf, rg, endereco, setor, sexo, dataNascimento, salario);
        this.bonificacao = bonificacao;
    }

    public Bonificacao2708 getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao2708 bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public double SalarioFinal() {
        // TODO Auto-generated method stub
        return 0;
    }

}
