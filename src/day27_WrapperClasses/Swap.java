package day27_WrapperClasses;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {

        int [] result = swap(new int[] {1,2,3,4,5,6}, 2 , 4);

        System.out.println(Arrays.toString(result));

    }

    public static int [] swap(int [] array , int i , int j ){

        int [] newArray = new int[array.length];
int num=0;
        for (int each : array) {

            if (num==i){
              newArray[num++] = array[j];
              continue;}
            if (num==j){
                newArray[num++] = array[i];
                continue;}

            newArray[num] = each;
num++;
        }

        return newArray;

    }
}
/*
2. Swap Task:
	2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j. the method swaps the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array
 */
