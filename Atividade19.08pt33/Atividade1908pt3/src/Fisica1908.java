public class Fisica1908 extends Pessoa1908 {
    private String cpf; 
    private String rg;
    private String data;
    private double salario;
    private Sexo1908 sexo;
    
    public Fisica1908(String id, String nome, String telefone, String cpf, String rg,
            String data, double salario, Sexo1908 sexo, Endereco1908 endereco) {
        super(id, nome, telefone, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.data = data;
        this.salario = salario;
        this.sexo = sexo;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Sexo1908 getSexo() {
        return sexo;
    }

    public void setSexo(Sexo1908 sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Cpf: " + cpf + "\nRg: " + rg + "\nData: " + data + "\nSalario: " + salario + "\nSexo=" + sexo.getSexo()
                + super.toString();
    }
    
}
