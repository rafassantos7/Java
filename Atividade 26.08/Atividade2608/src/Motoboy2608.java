public class Motoboy2608 extends Funcionario2608 {
    private String carteiraDeMotorista;
    
    public Motoboy2608(String nome, String dataNascimento, Sexo2608 sexo, Setor2608 setor, double salarioBase,
            String carteiraDeMotorista) {
            super(nome, dataNascimento, sexo, setor, salarioBase);
            this.carteiraDeMotorista = carteiraDeMotorista;
    }

    
    @Override
    public double SalarioFinal() {
       return super.SalarioBase;
    }


    public String getCarteiraDeMotorista() {
        return carteiraDeMotorista;
    }


    public void setCarteiraDeMotorista(String carteiraDeMotorista) {
        this.carteiraDeMotorista = carteiraDeMotorista;
    }


}