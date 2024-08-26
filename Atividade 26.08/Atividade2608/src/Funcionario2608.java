public abstract class Funcionario2608 {
    protected String nome;
    protected String dataNascimento;
    protected Sexo2608 sexo;
    protected Setor2608 setor;
    protected double SalarioBase;
    
    public Funcionario2608(String nome, String dataNascimento, Sexo2608 sexo, Setor2608 setor, double salarioBase) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.setor = setor;
        SalarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Sexo2608 getSexo() {
        return sexo;
    }

    public void setSexo(Sexo2608 sexo) {
        this.sexo = sexo;
    }

    public Setor2608 getSetor() {
        return setor;
    }

    public void setSetor(Setor2608 setor) {
        this.setor = setor;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        SalarioBase = salarioBase;
    } 
    
    public abstract double SalarioFinal();

    @Override
    public String toString() {
        return "Funcionario:\nNome: " + nome + "\nData de Nascimento: " + dataNascimento + "\nSexo: " + sexo.texto + "\nSetor: "
                + setor.nome + "\nSalario Base: " + SalarioBase;
    } 
    
}
