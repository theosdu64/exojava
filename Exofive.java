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
 
    static void motToReplace(String str, String phrase, String replacement) {
        String strtoreplace = str;
        String userstr = replacement;
        String phrtoreplace = phrase;

        ArrayList<String> phraseToChange = new ArrayList<String>();
        for (String mot : phrtoreplace.split(" ")) {
            phraseToChange.add(mot);
        }

        if (phrtoreplace.contains(strtoreplace)) {
            System.out.println("true");
            int index = phraseToChange.indexOf(strtoreplace);
            phraseToChange.remove(index);
            phraseToChange.add(index, userstr);
            System.out.println(phraseToChange.toString());
        }
    }

    static String ispalyndromefst(String str) {
        str = str.replace(" ", "");
        String reversed = new StringBuilder(str).reverse().toString();
        return reversed.equals(str) ? "Palyndrome" : "Pas un palyndrome";
    }

    static String ispalyndromescd(String str) {
        // Can be opti by Stringbuilder
        str = str.replace(" ", "");
       int len = str.length();
       String reversedword = "";
       for (int i = 0; i < str.length(); i++) {
           reversedword += str.charAt(len - i - 1);
       }
        return reversedword.equals(str) ? "Palyndrome" : "Pas un palyndrome";
    }
    
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
        System.out.println("-------------------Troisieme exo--------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Mot remplacent : ");
        String motremplacent = scan.nextLine();
        motToReplace(charone, charthree, motremplacent);
        System.out.println("-------------------Quatrieme exo--------------------------");
        System.out.println(ispalyndromefst("elu par cette crapule"));
        System.out.println("-------------------Quatrieme exo deuxieme solution--------------------------");
        System.out.println(ispalyndromescd("elu par cette crapule"));
    }
    }
    
