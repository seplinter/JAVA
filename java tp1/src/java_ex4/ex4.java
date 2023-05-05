package java_ex4;
import java.util.*;

public class ex4 {
    public static void main(String args[])
    {
        System.out.println("give a number");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=0;i<=10;i++)
        {
            System.out.println(a + " * "+ i +" = "+a*i);
        }
    }
}
