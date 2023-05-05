package tp2_suit;
import java.util.*;
public class ex8 {
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Donner la valeur factoriel");
        int n = sc.nextInt();
int r=1;
        for (int i=1;i<=n;i++)
        {
            r=r*i;

        }
        System.out.println(r);

    }
}
