import java.util.*;

public class Exofive {
    static void search(String str, String phrase) {
        String strtosearch = str;
        String phr = phrase;

        System.out.println("Methode search à trouvé");
        String[] mots = phr.split(" ");
        System.out.println(Arrays.toString(mots));

        for (String mot : mots) {
            if (strtosearch.equals(mot)) {
                System.out.println("Methode search à trouvé");
                System.out.println(strtosearch);
                return;
            }
        }
        System.out.println("PAS DE MOT TROUVE");
    };
    
    public static void main(String[] args) {
        String charone = "test";
        String chartwo = "testtwo";
        String charthree = "test de la phrase";

        String concatstr = charone + chartwo;
        String concatmethode = charone.concat(chartwo);

        System.out.println("-----------------Premier exo----------------------------");
        System.out.println(concatstr);
        System.out.println(concatmethode);
        System.out.println("-----------------Deuxieme exo----------------------------");
        search(charone, charthree);

    }
    
}
