package day24_ReturnMethod.Tasks;

import java.util.Arrays;

public class Task7_merge {
    public static void main(String[] args) {
        int [] newArray = merge(new int[] {1,2,3} , new int[] {3,4,5});

        System.out.println(Arrays.toString(newArray));
    }

    public static int [] merge (int[] array1 ,int[]array2){

        int [] newArray = new int[array1.length + array2.length];

        int i =0;

        for (int each : array1) {
            newArray[i++] = each;}
        for (int each : array2) {
            newArray[i++] = each;}

        return newArray;


    }
}
/*
7. Create a method named merge that passes two integer array parameters, the method can merge two integer arrays and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}

					merge(arr1, arr2) ====> {1,2,3,4,5,6}


 */