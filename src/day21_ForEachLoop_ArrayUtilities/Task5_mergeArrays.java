package day21_ForEachLoop_ArrayUtilities;

import java.util.Arrays;

public class Task5_mergeArrays {
    public static void main(String[] args) {
        int [] arr1 = {30, 10, 20};
        int [] arr2 = {15, 40, 25, 35};
        int [] arr3 = {8, 9, 17, 5, 4, 1};

        int [] result = new int[arr1.length+arr3.length+arr2.length];

        int i =0 ;

        for (int each : arr1) {
            result[i++] = each;}
        for (int each1 : arr2) {
            result[i++] = each1;}
        for (int each2 : arr3){
            result[i++] = each2;
        }

        System.out.println(Arrays.toString(result));

    }
}
/*
   5. Write a program that can merge 3 arrays of integers

    		Ex:
    			arr1 = {30, 10, 20};
    			arr2 = {15, 40, 25, 35};
    			arr3 = {8, 9, 17, 5, 4, 1}

			Output:
				{30,10,20,15,40,25,35,8,9,17,5,4,1}
 */