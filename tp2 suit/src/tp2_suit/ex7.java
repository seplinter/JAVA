package tp2_suit;

import java.util.ArrayList;
import java.util.*;

public class ex7 {
    public static void main(String[] args) {
        ArrayList<String> str1 = new ArrayList<String>();
        ArrayList<String> str2 = new ArrayList<String>();
        ArrayList<String> str3 = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Donner la taille de la list");
        int n = sc1.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Donner la valuer de la liste numero " + (i + 1));
            str1.add(sc.nextLine());

        }

        for (int i = 0; i < n; i++) {
            System.out.println("Donner la valuer de la liste numero " + (i + 1));
            str2.add(sc.nextLine());

        }


        for (int i = 0; i < str2.size(); i++)
        {

            if (str1.get(i) == str2.get(i))
            {
                str3.add("TRUE");
            }
            else
            {
                str3.add("FALSE");
            }




        }
        System.out.println(str3);
        System.out.println(str2);
        System.out.println(str1);

    }
}
