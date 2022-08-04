package day20_Arrays;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        int Array [] = {1,2,3,4,5,6};

        int reversedArray [] = new int[Array.length];

        for (int i = Array.length - 1, j=0; i >= 0; i--,j++) {
            reversedArray[j] = Array[i];
        }
        System.out.println(Arrays.toString(reversedArray));

    }
}
/*
5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */