import java.util.Scanner; 

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour et bienvenue dans mon programme Java !");
        
        System.out.print("Quel est votre nom ? ");
        String nom = sc.nextLine();
        System.out.println("Salut " + nom + " !");
    }
}
