package exosix;
import java.util.ArrayList;
import java.util.Arrays;

public class Matrice {
    /**
     * affiche un triangle d'étoiles basé sur un tableau de nombres
     */
    static void triangle() {
        int etage = 7;

        // parcourt chaque étage du triangle
        for (int i = 0; i < etage; i++) {
            // ajoute les espaces pour centrer le triangle
            for (int j = etage; j > i; j--) {
                System.out.print(" ");
            }
            // affiche les étoiles 
            for (int z = 0; z < (2 * i - 1); z++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
    /**
     * trouve les deux plus grands nombres et retourne leur somme
     */
    static int twomaxnum() {
        int [] nums = {1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums) {
            list.add(num);
        }
        ArrayList<Integer> res = new ArrayList<>();
        int maxi = 0;
        int maxitwo = 0;
        // trouve le premier maximum
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maxi) {
                maxi = list.get(i);
            }
        }
        res.add(maxi);
        list.remove(Integer.valueOf(maxi));
        // trouve le deuxième maximum
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maxitwo) {
                maxitwo = list.get(i);
            }
        }
        res.add(maxitwo);
        return Operation.add(res.get(0), res.get(1));
    }
    
    /**
     * convertit une matrice 2d en liste linéaire
     */
    static ArrayList<Integer> decomposematrice(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        // parcourt chaque ligne et colonne
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
            list.add(matrix[i][j]);
            }
        }
        return list;
    }
    
    /**
     * affiche une matrice ligne par ligne
     */
    static void displaymatrice(int[][] list) {
        for (int i = 0; i < 3; i++) {
            for(int num : list[i]) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
    /**
     * affiche une arraylist sous forme de matrice avec un nombre de colonnes donné
     */
    static void displayArraylist(ArrayList<Integer> list, int cols) {
        ArrayList<int[]> res = new ArrayList<>();
        // découpe la liste en sous-tableaux de taille cols
        for (int i = 0; i < list.size(); i += cols) {
            int[] sub = new int[cols];
            for (int j = 0; j < cols; j++) {
                sub[j] = list.get(i + j);
            }
            res.add(sub);
        }
        // affiche chaque ligne
        for (int[] arr : res) {
            System.out.println(Arrays.toString(arr));
        }
    }
    
    /**
     * additionne deux matrices et affiche le résultat
     */
    static void matrix() {
    	//  int[][] fst = {{5,4}, {3,2}, {2,1}};
    	//  int[][] scd = {{1,3}, {6,0}, {4,8}};
        int[][] fst = {{5,4,3}, {3,2,1}, {2,1,0}};
        int[][] scd = {{1,1,3}, {6,0,3}, {4,8,9}};
        int cols = fst[0].length; 
        
        // convertit les matrices en listes
        ArrayList<Integer> list1 = decomposematrice(fst);
        ArrayList<Integer> list2 = decomposematrice(scd);
        displaymatrice(fst);
        System.out.println("  +   ");
        displaymatrice(scd);
        System.out.println("---------------------Result---------------------");
        // additionne élément par élément
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < list1.size(); i++) {
            result.add(list1.get(i) + list2.get(i));
        }
        displayArraylist(result, cols);
    }
	
    /**
     * teste les différentes méthodes sur matrices et tableaux
     */
    public static void main(String[] args) {
        System.out.println("---------------------Exo 1---------------------");
        System.out.println(Operation.add(2,7));
        System.out.println("---------------------Exo 2---------------------");
        triangle();
        System.out.println("---------------------Exo 3---------------------");
        System.out.println(twomaxnum());
        System.out.println("---------------------Exo 4---------------------");
        matrix();
    }
}