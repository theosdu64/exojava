package exosix;
import java.util.ArrayList;

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
	
	
    public static void main(String[] args) {
        System.out.println("---------------------Exo 1---------------------");
        System.out.println(Operation.add(2,7));
        System.out.println("---------------------Exo 2---------------------");
        triangle();
        System.out.println("---------------------Exo 3---------------------");
        System.out.println(twomaxnum());
    }
}
