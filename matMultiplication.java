import java.util.*;
public class matMultiplication{
    public static void main(String[] args) {
        int arr1[][] = {{3, -2, 5},
                        {3, 0, 4},
                        {1 ,2, 3}};

        int arr2[][] = {{2, 3, 5},
                        {-9, 0, 6},
                        {0, 4, 7}};

        for(int i[] : matMultiplication(arr1, arr2)){
            for (int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static int[][] matMultiplication(int arr1[][], int arr2[][]){
        int c[][] =  new int[3][3];

        for(int i=0 ; i<arr1.length ; i++){
            for(int j=0 ; j<arr1[0].length ; j++){
                for(int k=0 ; k< arr2.length ; k++) {
                    c[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return c;
    }
}
