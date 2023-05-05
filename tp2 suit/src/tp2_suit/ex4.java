package tp2_suit;

import java.util.*;

public class ex4 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner la taille de matrice");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        int[][] matt = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                System.out.println("Donner la valuer de tab[" + (i + 1) + "][" + (j + 1) + "]");
                mat[i][j] = sc.nextInt();
            }

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {

                matt[j][i] = mat[i][j];
            }


        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++) {

                System.out.println(mat[i][j]);
            }
        System.out.println("\n");
    }

        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {

                System.out.println(matt[i][j]);
            }
            System.out.println("\n");
        }





    }
}
