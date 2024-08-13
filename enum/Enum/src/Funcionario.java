public class Funcionario {

    private int id;
    private String nome;
    private double salario;
    private Setor setor;
    private Genero genero;
    private int idade;
    private UnidadeFederativa uf;

    public Funcionario(int id, String nome, double salario, Setor setor, Genero genero, int idade, UnidadeFederativa uf) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
        this.genero = genero;
        this.idade = idade;
        this.uf = uf;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public UnidadeFederativa getUnidadeFederativa(){
        return uf;
    }
    public void setUf(UnidadeFederativa uf){
        this.uf = uf;
    }
    public Setor getSetor() {
        return setor;
    }
    public void setSetor(Setor setor) {
        this.setor = setor;
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
