package java_ex4;
import java.util.*;
import java.lang.*;
public class java_ex4 {
    public static void main(String[] args) {

        Scanner ch= new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str= ch.nextLine();
        ch.close();

        StringBuilder strb = new StringBuilder(str);
        String strInv = strb.reverse().toString();

        System.out.println(str);
        System.out.println(strInv);

        if (str.equals(strInv)) {
            System.out.println("Is palindrom : true");
        } else {
            System.out.println("Is palindrom : false");
        }
    }
    }

