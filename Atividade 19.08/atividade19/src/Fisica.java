public class Fisica extends Pessoa {
    private int cpf;
    private int rg;
    private String dataNascimento;
    
    public Fisica(String nome, String telefone, int cpf, int rg, String dataNascimento) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }
    
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public int getRg() {
        return rg;
    }
    public void setRg(int rg) {
        this.rg = rg;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Nome = " + super.nome + "\nCpf = " + cpf + "\nRg = " + rg + "\nTelefone = " + super.telefone + "\nDataNascimento = "
                + dataNascimento;
    }

    
}
