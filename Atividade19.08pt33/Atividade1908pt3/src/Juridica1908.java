public class Juridica1908 extends Pessoa1908 {
    private String cnpj;
    private String inscricaoEstadual;
    private String dataInicio;
    private String dataFinal;
    private String valorContrato;
    
    public Juridica1908(String id, String nome, String telefone, Endereco1908 endereco, String cnpj,
            String inscricaoEstadual, String dataInicio, String dataFinal, String valorContrato) {
        super(id, nome, telefone, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.valorContrato = valorContrato;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }
    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    public String getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }
    public String getDataFinal() {
        return dataFinal;
    }
    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }
    public String getValorContrato() {
        return valorContrato;
    }
    public void setValorContrato(String valorContrato) {
        this.valorContrato = valorContrato;
    }
    @Override
    public String toString() {
        return "\nCnpj: " + cnpj + "\nInscricao Estadual: " + inscricaoEstadual + "\nData Inicio: " + dataInicio
                + "\nData Final: " + dataFinal + "\nValor Contrato: " + valorContrato + super.toString();
    }

    
}
