package tp2_suit;
import java.util.Arrays;
import java.util.Scanner;

public class ex3 {
    public static void main (String[]args)
    {


        Scanner sc=new Scanner(System.in);
        System.out.println("Donner le taille de tableau");
        int n =sc.nextInt();
        int []tab=new int [n] ;

        for (int i=0 ;i<n;i++)
        {
            System.out.println("Donner la valuer de tab["+(i+1)+"]");
            tab[i]=sc.nextInt();
        }
        Arrays.sort(tab);




            System.out.println(Arrays.toString(tab));






    }
}
