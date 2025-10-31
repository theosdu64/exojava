import java.util.Scanner;

public class FTest {
    public static void main(String[] args) {
        int nombre;
        
        // récupère le nombre depuis les arguments ou depuis l'input
        if(args.length > 0) {
            nombre = Integer.parseInt(args[0]);
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choisissez un entier");
            
            // valide que l'entrée soit bien un int
            while(!sc.hasNextInt()) {
                System.out.println("Ce n'est pas un entier valide. Recommencez:");
                sc.next();
            }
            
            nombre = sc.nextInt();
        }
        
        String posorneg;
        String pairornot;
        
        // détermine si le nombre est positif, négatif ou nul
        if(nombre > 0) {
            posorneg = "positif";
        } else if(nombre < 0) {
            posorneg = "négatif";
        } else {
            posorneg = "nul";
        }
        
        // détermine si le nombre est pair, impair ou zéro
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