package tp2_suit;
import java.util.*;
public class ex6 {
    public static void main(String[]args)
    {
        ArrayList<String> str =new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        System.out.println("Donner la taille de la list");
        int n=sc1.nextInt();

        for (int i=0 ;i<n;i++)
        {
            System.out.println("Donner la valuer de la liste numero "+(i+1));
            str.add(sc.nextLine());

        }

        System.out.println("Donner la chaine qui vous recherche dans la liste");
        String ch=sc.nextLine();
        for (String i : str)
        {
            if(i.contains(ch))
            {
                System.out.println(true);


            }else
            { System.out.println(false);
            }
        }




    }
}
