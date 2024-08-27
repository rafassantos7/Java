public class Atividade2608pt3 {
    public static void main(String[] args) throws Exception {
        Soma2608 soma = new Soma2608();
        Divisao2608 div = new Divisao2608();
        Subtracao2608 sub = new Subtracao2608();
        Multiplicacao2608 mult = new Multiplicacao2608();

        System.out.println("Soma: " + soma.calcular(10, 5));
        System.out.println("Divisao: " + div.calcular(10, 5));
        System.out.println("Subtracao: " + sub.calcular(10, 5));
        System.out.println("Multiplicacao: " + mult.calcular(10, 5));
    }
}
