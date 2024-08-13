public class Enum {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario(7984, "Breno", 500, Setor.RECURSOS_HUMANOS, Genero.FEMININO, 20,UnidadeFederativa.RIO_DE_JANEIRO);
        Funcionario funcionario2 = new Funcionario(777, "Rafael", 700  , Setor.FINANCEIRO  , Genero.MASCULINO, 23,UnidadeFederativa.BAHIA);
        System.out.println("Funcionario 1 :");
        System.out.println("ID : " + funcionario.getId());
        System.out.println("Nome : " + funcionario.getNome());
        System.out.println("Idade : " + funcionario.getIdade());
        System.out.println("Salario : " + funcionario.getSalario());
        System.out.println("Setor: " + funcionario.getSetor().getTexto());
        System.out.println("Genero: " + funcionario.getGenero().getTexto());
        System.out.println("Estado: " + funcionario.getUnidadeFederativa().getTexto() + "\nSigla : " + funcionario.getUnidadeFederativa().getSigla());
    
        System.out.println("\nFuncionario 2 :");
        System.out.println("ID : " + funcionario2.getId());
        System.out.println("Nome : " + funcionario2.getNome());
        System.out.println("Idade : " + funcionario2.getIdade());
        System.out.println("Salario : " + funcionario2.getSalario());
        System.out.println("Setor: " + funcionario2.getSetor().getTexto());
        System.out.println("Genero: " + funcionario2.getGenero().getTexto());
        System.out.println("Estado: " + funcionario2.getUnidadeFederativa().getTexto() + "\nSigla : " + funcionario2.getUnidadeFederativa().getSigla());
    }
}
