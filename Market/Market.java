package Market;

import java.util.*;

public class Market {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menuNbr = 1;
        String[] plats = {"entrée", "plats", "accompagnements", "boissons", "dessert"};

        Map<String, ArrayList<String>> ticket = new HashMap<>();
        ArrayList<String> commande = new ArrayList<>();

        System.out.println("Combien de menu ?");
        int userInput = scan.nextInt();

		// boucle de création des commandes
		do {
			System.out.println("Commande n°" + menuNbr);
			// parcourt chaque catégorie de plats
			for(int i = 0; i < plats.length ; i++) {
				System.out.println("Choix " + plats[i]);
				// affiche les options disponibles pour cette catégorie
				for(Integer key : Data.menu[i].keySet()) {
					System.out.println(key + " - " + Data.menu[i].get(key));
				}
				int userChoice = scan.nextInt();
				String userChoiceToStr = Data.menu[i].get(userChoice);
				System.out.println("");
				System.out.println("vous avez choisi : " + userChoiceToStr);
				System.out.println("");
				commande.add(userChoiceToStr);
			}
			System.out.println("");
			System.out.println("------------------------------------------------");
			System.out.println("resume de la dernière commande : " + commande);
			System.out.println("------------------------------------------------");
			// enregistre la commande dans le ticket
			ticket.put("commande n°" + menuNbr, commande);
			System.out.println("Toute les commandes en cours : ");
			System.out.println("");
			// affiche toutes les commandes enregistrées
			for(Map.Entry<String, ArrayList<String>> entry : ticket.entrySet()) {
				System.out.println(entry.getKey() + entry.getValue());
			}
			commande.clear();
			menuNbr++;
			System.out.println("-------------------------------------------------");
		} while(userInput == menuNbr);
	}
}