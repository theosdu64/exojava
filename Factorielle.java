import java.util.ArrayList;

public class Factorielle {
	
	static int facto(int n) {
		System.out.println(n);
		if(n == 0) {
			return 1;
		} else {
			return n * facto(n - 1);
		}
	}
	
	static int factodeux(int n) {
	    int resultat = 1;
	    for (int i = 1; i <= n; i++) {
	        resultat *= i;
	    }
	    return resultat;
	}
	
	public static void main(String[] args) {
		System.out.println(factodeux(5));
	}
}
