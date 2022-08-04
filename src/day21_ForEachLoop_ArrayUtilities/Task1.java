package day21_ForEachLoop_ArrayUtilities;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int [] Array = {1,2,5,4,9,7,6,2,8};

        int [] Reverse = new int[Array.length];

        Arrays.sort(Array);

        for (int i = Array.length-1, j=0; i >=0; i--,j++) {
            Reverse[j] = Array[i];

        }
        System.out.println(Arrays.toString(Reverse));

    }
}
/*
	1. Write a program that sort the array of integer in descending order
 */