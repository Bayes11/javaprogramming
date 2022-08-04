package day22_MultiDimensionalArray;

import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {


        int[][] Array = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}};

        System.out.println(Arrays.deepToString(Array));

        System.out.println(Arrays.toString(Array[1]));

        System.out.println(Array[1][3]);

        System.out.println("----------------------------------------------------------------");


        for (int[] eachArray : Array) {
            for (int i : eachArray) {
                System.out.print(i + " ");

            }
            System.out.println();
        }
    }
}
