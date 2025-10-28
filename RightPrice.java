import java.util.Scanner;

public class RightPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 1;
        int max = 100;
        boolean continuer = true;

        while (continuer) {
            int numberToFind = (int) (Math.random() * (max - min + 1)) + min;
            int nbrtest = 0;
            boolean found = false;

            System.out.println("Bienvenue au juste prix");
            System.out.println("Choisir entre 1 et 100 :");

            while (!found) {
                String usernumber = scan.nextLine();
                int formatnum = Integer.parseInt(usernumber);
                nbrtest++;

                if (numberToFind > formatnum) {
                    System.out.println("Plus");
                } else if (numberToFind < formatnum) {
                    System.out.println("Moins");
                } else {
                    System.out.println("Gagné :" + nbrtest + " coup");
                    found = true;
                }
            }

            System.out.println("Rejouer ? (o/n)");
            String replay = scan.nextLine();

            if (replay.equals("o")) {
                continuer = true; 
            } else {
                continuer = false; 
                System.out.println("Fini");
            }
        }

        scan.close();
    }
}
