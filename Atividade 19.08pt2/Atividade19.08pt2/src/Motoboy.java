public class Motoboy extends Funcionarios1908pt2 {
    private String cnh;

public Motoboy(String nome, String cpf, String rg, double salario, String cnh) {
    super(nome, cpf, rg, salario);
    this.cnh = cnh;
}

public String getCnh() {
    return cnh;
}

public void setCnh(String cnh) {
    this.cnh = cnh;
}

@Override
public String toString() {
    return "\nEngenheiro:\n" + super.toString() +
     "\nCnh = " + cnh;
}
    
}
