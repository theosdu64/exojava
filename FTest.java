import java.util.Scanner;

public class FTest {
    public static void main(String[] args) {
        int nombre;
        
        if(args.length > 0) {
            nombre = Integer.parseInt(args[0]);
        } else {

            Scanner sc = new Scanner(System.in);
            System.out.println("Choisissez un entier");
            
            while(!sc.hasNextInt()) {
                System.out.println("Ce n'est pas un entier valide. Recommencez:");
                sc.next();
            }
            
            nombre = sc.nextInt();
        }
        
        String posorneg;
        String pairornot;
        
        if(nombre > 0) {
            posorneg = "positif";
        } else if(nombre < 0) {
            posorneg = "négatif";
        } else {
            posorneg = "nul";
        }
        
        if(nombre == 0) {
            pairornot = "égal à zéro";
        } else if(nombre % 2 == 0) {
            pairornot = "pair";
        } else {
            pairornot = "impair";
        }

        System.out.println("Le nombre est " + pairornot + " et il est " + posorneg);
    }
}