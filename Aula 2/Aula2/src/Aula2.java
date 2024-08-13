public class Aula2 {
    public static void main(String[] args) throws Exception {
        String nome = "Rafael";
    String sobrenome = "Vitor";
    
    // Tamanho das variaveis

    System.out.println("Tamanho do nome: " + nome.length());
    System.out.println("Tamanho do sobrenome: " + sobrenome.length());

    //Concatenando variaveis

    String nomeCompleto = nome.concat(" ").concat(sobrenome);

    System.out.println("Concatenacao maiuscula " + nomeCompleto.toUpperCase());
    System.out.println("Concatenacao minuscula " + nomeCompleto.toLowerCase());

    }
}