import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
    
        float media, primeiraNota, segundaNota;
    
        System.out.print("Digite sua primeira nota: ");
        primeiraNota = ler.nextFloat();
        
        System.out.print("Digite sua segunda nota: ");
        segundaNota = ler.nextFloat();
    
        media = (primeiraNota + segundaNota)/2;
    
        System.out.println("Media final: " + media);
    
        if (media >=7 ){
            System.out.println("Voce foi aprovado.");
        }
        else if (media > 5 && media <6.9){
            System.out.println("Verificacao suplementear");
        }
        else if (media<5){
            System.out.println("Recuperacao");
        }
        ler.close();
        }
    }