import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        // parcourt chaque arg de la ligne de commande
        for (String arg : args) {
            String[] numbers = arg.split(" ");
            for (String num : numbers) {
                Scanner scanner = new Scanner(num);
                // vérifie si la chaîne est un int valide
                if (scanner.hasNextInt()) {
                    array.add(Integer.parseInt(num));
                } else {
                    System.out.println(num + " invalide");
                }
            }
        }
        System.out.println(array);
   
        // affiche les propriétés de chaque nombre
        for (Integer num : array) {
            String posorneg = (num > 0) ? "positif" : "negatif";
            String pairornot = (num % 2 == 0) ? "pair" : "impair";
            System.out.println("Le nombre " + num + " est " + pairornot + " et il est " + posorneg);
        }
    }
}