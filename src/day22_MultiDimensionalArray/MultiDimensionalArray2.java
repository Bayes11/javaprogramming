package day22_MultiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3};
        int [] arr2 = {4,5,6};
        int [] arr3 = {7,8,9};

        int [][] arr2d = {{1,2,3},{4,5,6},{7,8,9}};

        int [][][]  arr3d = { {{1,2,3},{4,5,6},{7,8,9}}, {{10,20,30},{40,50,60},{70,80,90}}};

        System.out.println(Arrays.deepToString(arr3d));
        System.out.println(Arrays.deepToString(arr3d[0]));
        System.out.println(Arrays.toString(arr3d[0][0]));
        System.out.println(arr3d[0][0][0]);

        for (int[][] each : arr3d) {
            for (int[] each1 : each) {
                for (int i : each1) {
                    System.out.print(i + " ");

                }
                System.out.println();

            }
            System.out.println();

        }

    }
}
