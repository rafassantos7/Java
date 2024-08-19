public class Atividade19pt2 {
    public static void main(String[] args) throws Exception {

        Engenheiro engen = new Engenheiro("caio", "8897546784", "544684351", 47852.54, "78544");
        Medico med = new Medico("luis", "1213546879", "23523546", 1354.65, "54132");
        Motoboy mot = new Motoboy("breno", "897546487", "544546845 ", 4684.87, "98741");

        System.out.println(engen.toString());
        System.out.println(med.toString());
        System.out.println(mot.toString());


    }
}
