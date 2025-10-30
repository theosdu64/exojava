package exosix;
import java.util.ArrayList;
import java.util.Arrays;

public class Matrice {
    static void triangle() {
        int [] array = {1,3,5,7,9,11,13};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static int twomaxnum() {
        int [] nums = {1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums) {
            list.add(num);
        }
        ArrayList<Integer> res = new ArrayList<>();

        int maxi = 0;
        int maxitwo = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maxi) {
                maxi = list.get(i);
            }
        }
        res.add(maxi);
        list.remove(Integer.valueOf(maxi));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maxitwo) {
                maxitwo = list.get(i);
            }
        }
        res.add(maxitwo);
        return Operation.add(res.get(0), res.get(1));
    }
    static ArrayList<Integer> decomposematrice(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
            list.add(matrix[i][j]);
            }
        }
        return list;
    }

    static void displaymatrice(int[][] list) {
        for (int i = 0; i < 3; i++) {
            for(int num : list[i]) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static void displayArraylist(ArrayList<Integer> list, int cols) {
        ArrayList<int[]> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i += cols) {
            int[] sub = new int[cols];
            for (int j = 0; j < cols; j++) {
                sub[j] = list.get(i + j);
            }
            res.add(sub);
        }

        for (int[] arr : res) {
            System.out.println(Arrays.toString(arr));
        }
    }
    
    static void matrix() {
    	//  int[][] fst = {{5,4}, {3,2}, {2,1}};
    	//  int[][] scd = {{1,3}, {6,0}, {4,8}};

        int[][] fst = {{5,4,3}, {3,2,1}, {2,1,0}};
        int[][] scd = {{1,1,3}, {6,0,3}, {4,8,9}};

        int cols = fst[0].length; 
        
        ArrayList<Integer> list1 = decomposematrice(fst);
        ArrayList<Integer> list2 = decomposematrice(scd);

        displaymatrice(fst);
        System.out.println("  +   ");
        displaymatrice(scd);
        System.out.println("---------------------Result---------------------");
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < list1.size(); i++) {
            result.add(list1.get(i) + list2.get(i));
        }
        displayArraylist(result, cols);
    }
	
	
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
