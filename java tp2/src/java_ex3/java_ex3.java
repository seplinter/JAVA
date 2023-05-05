package java_ex3;
import java.util.*;
public class java_ex3 {
    public static void main(String[]args)
    {
        int [] tab=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Donner le nombre d'occurance");
        int a=sc.nextInt();
int n=10;
int nb=0;
int i=0;
        for(i=0;i<n;i++) {
            Scanner st=new Scanner(System.in);
            System.out.println("Donner la valuer de tableau no [" + i +" ] =");
             tab[i]=st.nextInt();


        }

        for(i=0;i<n;i++) {
         if (a==tab[i])
         {nb++;}
        }
System.out.println(a + " est a un nombre d'occurance de "+ nb+" fois ");
        }
    }

