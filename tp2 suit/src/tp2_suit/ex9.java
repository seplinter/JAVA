package tp2_suit;
import java.util.*;
public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la base du triangle: ");
        double base = sc.nextDouble();
        System.out.print("Entrez la hauteur du triangle: ");
        double hauteur = sc.nextDouble();
        double surface = (base * hauteur)/2;
        System.out.println("La surface du triangle est: " + surface);

    }

}