package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Replace_task {
    public static void main(String[] args) {

        int [] newArray = replace(new int[]{1,2,3,4,5}, 4,100);

        System.out.println(Arrays.toString(newArray));

        int [] newArray2 = ArraysUtility.replace(new int[]{1,2,3,4,5}, 2,30);
        System.out.println(Arrays.toString(newArray2));

    }


// create a method names replace that passes three parameters: integer array, integer index, integer newElement.
// The method replaces the element of the array at the given index with the new element, and returns the new array.

    public static int[] replace(int[] array, int index, int newElement) {
        if(index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }


        int[] newArray = new int[array.length];
        int i = 0;

        for (int each : array) {
            if (i == index)
                newArray[i++] = newElement;
            else
                newArray[i++] = each;
        }

        return newArray;
    }


}