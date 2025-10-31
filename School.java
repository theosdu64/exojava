import java.util.*;

public class School {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int notes[] = {};
        HashMap<String, Integer> studentName = new HashMap<>();
        boolean continueNote = true;
        // boucle principale de saisie des étudiants
        while (continueNote) {
            System.out.println("Nom");
            String nom = scan.nextLine();
            System.out.println("Prenom");
            String prenom = scan.nextLine();
            String complete_name = nom + " " + prenom;
            // vérifie si l'étudiant existe déjà
            if(!searchIfPresent(complete_name, studentName)) {
            		continue;
            }
            System.out.println("saisir les notes");
            String note = scan.nextLine();
            ArrayList<Integer> listeNote = toInt(note);
            int average = average(listeNote);
            studentName.put(complete_name, average);
            System.out.println("Mr " + nom + " " + prenom + " a une moyenne de " + average);
            System.out.println("Avez vous fini ? (o/n)");
            String path = scan.nextLine();
            // affiche les résultats triés si terminé
            if (path.equals("o")) {
                continueNote = false;
                System.out.println("Ordre decroissant");
        			System.out.println(sortedDescMap(studentName));
                System.out.println("Ordre croisant");
                System.out.println(sortedCroisMap(studentName));
                scan.close();
            }
        }
    }
    
    /**
     * trouve et affiche la note minimale et maximale
     */
    static void minandmax(int[] notes) {
        int minNote = notes[0];
        int maxNote = notes[0];
        for (int note : notes) {
            if (note < minNote) {
                minNote = note;
            }
            if (note > maxNote) {
                maxNote = note;
            }
        }
        System.out.println("Le mini est de " + minNote);
        System.out.println("Le max est de " + maxNote);
    }
    
    /**
     * calcule la moyenne des notes
     */
    static int average(ArrayList<Integer> notes) {
        int total = 0;
        for (int note : notes) {
            total += note;
        }
        int moyenne = total / notes.size();
        System.out.println("La moyenne est de" + moyenne);
        return moyenne;
    }
    
    /**
     * convertit une chaîne de notes séparées par espaces en liste d'entiers
     */
    static ArrayList<Integer> toInt(String notes) {
        ArrayList<Integer> note = new ArrayList<>();
        String[] formatedStr = notes.split(" ");
        for (String str : formatedStr) {
            note.add(Integer.parseInt(str));
        }
        return note;
    }
    
    /**
     * vérifie si un étudiant est déjà enregistré
     */
    static boolean searchIfPresent(String name, HashMap<String, Integer> liste) {
        if (liste.containsKey(name)) {
            System.out.println(name + " est deja dans la liste");
            System.out.println(liste);
            return false;
        } else {
            System.out.println(name + " n'est pas dans la liste");
            return true;
        }
    }
    
    /**
     * trie la map par ordre décroissant des clés
     */
    static Map<String, Integer> sortedDescMap(HashMap<String, Integer> studentName) {
        TreeMap<String, Integer> sorted = new TreeMap<>(Comparator.reverseOrder());
        sorted.putAll(studentName);
        return sorted;
    }
    
    /**
     * trie la map par ordre croissant des clés
     */
    static Map<String, Integer> sortedCroisMap(HashMap<String, Integer> studentName) {
    		TreeMap<String, Integer> sorted = new TreeMap<>(studentName);
        return sorted;
    }
}
