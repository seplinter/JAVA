package java_ex2;
import java.util.Scanner;

public class java_ex2 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
                System.out.println("Donner  un nombre");
                int a=sc.nextInt();


                if (a>0)
                {
                    System.out.println(a + " est un nombre positive");
                } else if (a<0) {
                    System.out.println(a + " est un nombre negative");
                } else if (a==0) {
                    System.out.println(a + " est zero");

                }
                if (a % 2 == 0)
                {
                    System.out.println(a +  " est un nombre pair");
                } else {System.out.print(a + " est un nombre impair");
                }
    }
}
