public abstract class Funcionario2708 implements SalarioFinal2708 {
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Endereco2708 endereco;
    protected Setor2708 setor;
    protected Sexo2708 sexo;
    protected String dataNascimento;
    protected double salario;
    
    public Funcionario2708(String nome, String cpf, String rg, Endereco2708 endereco, Setor2708 setor, Sexo2708 sexo,
            String dataNascimento, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.setor = setor;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Endereco2708 getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco2708 endereco) {
        this.endereco = endereco;
    }

    public Setor2708 getSetor() {
        return setor;
    }

    public void setSetor(Setor2708 setor) {
        this.setor = setor;
    }

    public Sexo2708 getSexo() {
        return sexo;
    }

    public void setSexo(Sexo2708 sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public abstract double SalarioFinal();

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nCpf: " + cpf + "\nRg: " + rg + endereco.toString() + "\nSetor:"
                + setor.getNome() + "\nSexo: " + sexo.getTexto() + "\nData de Nascimento: " + dataNascimento + "\nSalario: " + salario;
    }


}
