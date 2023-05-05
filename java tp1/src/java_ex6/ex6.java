package java_ex6;
import java.util.*;

public class ex6 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Donner A");

        int a=sc.nextInt();
        System.out.println("Donner B");

        int b=sc.nextInt();

        int c=a;
        a=b;
        b=c;
        System.out.println("A = "+a);
        System.out.println("B = "+b);


    }
}
