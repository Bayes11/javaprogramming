package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {

        int [][] MultiArray = { {1,2,3}, {4,5,6,7,8}, {9,10,11,12,13}};


        for (int i = 0; i < MultiArray.length; i++) {
            for (int j = MultiArray[i].length - 1; j >= 0; j--) {
                System.out.print( MultiArray[i][j] + " ");

            }
            System.out.println();

        }

        System.out.println("-----------------------------------");

        for (int i = MultiArray.length - 1; i >= 0; i--) {
            for (int j = 0; j < MultiArray[i].length; j++) {
                System.out.print (MultiArray[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("-------------------------------------");

        for (int i = MultiArray.length - 1; i >= 0; i--) {
            for (int j = MultiArray[i].length - 1; j >= 0; j--) {
                System.out.print(MultiArray[i][j] + " ");

            }
            System.out.println();

        }
        
    }
}
