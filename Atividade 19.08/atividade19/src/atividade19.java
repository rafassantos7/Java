public class atividade19 {
    public static void main(String[] args){
        
        Fisica fisica = new Fisica("breno", "40028922", 15975384, 12876543, "13/08/2004");
        
        Juridica juridica = new Juridica("Rafael", "336699785", "45421325465132", "BA");
        
        System.out.println(fisica.toString());
        System.out.println("\n");
        System.out.println(juridica.toString());
    }
}
