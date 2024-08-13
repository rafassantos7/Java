public class Atividade02 {
    public static void main(String[] args){
        String nomeUsuario = "Rafael";
        int senha = 123;

        boolean ResultadoNome = nomeUsuario.equals("Rafael");
        boolean ResultadoSenha = (senha == 456);

        System.out.println("O nome do usuario esta correto? " + ResultadoNome);
        System.out.println("a senha esta correta? " + ResultadoSenha);
    }
}
