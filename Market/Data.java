package Market;

import java.util.HashMap;

public class Data {
    public static HashMap<Integer, String>[] menu = new HashMap[5];

    static {
        menu[0] = new HashMap<>();
        menu[0].put(1, "SALADE");
        menu[0].put(2, "SOUPE");
        menu[0].put(3, "QUICHE");
        menu[0].put(4, "AUCUNE");

        menu[1] = new HashMap<>();
        menu[1].put(1, "POULET");
        menu[1].put(2, "BOEUF");
        menu[1].put(3, "POISSON");
        menu[1].put(4, "VÉGÉTARIEN");
        menu[1].put(5, "VEGAN");
        menu[1].put(6, "AUCUN");

        menu[2] = new HashMap<>();
        menu[2].put(1, "RIZ");
        menu[2].put(2, "PÂTES");
        menu[2].put(3, "FRITES");
        menu[2].put(4, "LÉGUMES");
        menu[2].put(5, "AUCUN");

        menu[3] = new HashMap<>();
        menu[3].put(1, "EAU PLATE");
        menu[3].put(2, "EAU GAZEUSE");
        menu[3].put(3, "SODA");
        menu[3].put(4, "VIN");
        menu[3].put(5, "AUCUNE");

        menu[4] = new HashMap<>();
        menu[4].put(1, "TARTE MAISON");
        menu[4].put(2, "MOUSSE AU CHOCOLAT");
        menu[4].put(3, "TIRAMISU");
        menu[4].put(4, "AUCUN");
    }
}

