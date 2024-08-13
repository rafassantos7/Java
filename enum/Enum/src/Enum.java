public class Enum {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario(7984, "Breno", 500, Setor.RECURSOS_HUMANOS, Genero.FEMININO, 20);

        System.out.println("ID : " + funcionario.getId());
        System.out.println("Nome : " + funcionario.getNome());
        System.out.println("Idade : " + funcionario.getIdade());
        System.out.println("Salario : " + funcionario.getSalario());
        System.out.println("Setor: " + funcionario.getSetor().getTexto());
        System.out.println("Genero: " + funcionario.getGenero().getTexto());
    }
}
