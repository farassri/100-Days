package javaapplication157;

import java.util.Arrays;


public class days81_PerkalianMatriks{
    public static void main(String[] args) {
        //deklarasi matriks A dan B
        int[][] a = {{2,1,3}, {1,3,4}, {5,3,2}};
        int [][] b = {{1,4,3}, {2,4,3}, {3,5,1}};
        int [][] c =  new int [a.length][b[0].length];//deklarasi matriks hasil perkalian
        for(int i = 0; i < a.length; i++){ //perulangan untuk melakukan perkaliann matriks
            for(int j = 0; j< b[0].length; j++){
                for(int k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
       }//mencetak matriks hasil perkalian
        System.out.println("hassl perkalian matriksnya adalah: ");
        for(int i = 0; i < c.length; i++){
            System.out.println(Arrays.toString(c[i]));
        }
    }
}
