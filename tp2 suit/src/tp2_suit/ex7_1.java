package tp2_suit;

import java.util.*;
public class ex7_1 {
    public static void main(String[] args) {
        ArrayList<String> list3 = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Java");
        list1.add("PHP");
        list1.add("Python");
        list1.add("Pascal");

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("PHP");
        list2.add("Java");
        list2.add("Python");
        list2.add("Pascal");

        System.out.println("list1 = "+list1);
        System.out.println("list2 = "+list2);

        for(int i=0; i < list1.size(); i++) {

            if(list1.get(i)==list2.get(i)) {
                list3.add("TRUE");}
            else{
                list3.add("FALSE");}


        }
        System.out.println("list3 = "+list3);

    }
}
