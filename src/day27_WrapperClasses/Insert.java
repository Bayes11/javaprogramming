package day27_WrapperClasses;

import java.util.Arrays;

public class Insert {

    public static void main(String[] args) {

        int [] result = insert(new int[]{1,2,3,4,5,6}, 2 , 100);

        System.out.println(Arrays.toString(result));

    }

    public static int [] insert(int [] array, int index, int element){

        int [] result = new int[array.length+1];

        int i=0;
        for (int each : array) {
            if (i==index){
                result[i]=element;
            i++;}
                result[i++] = each;


        }
        return result;

    }

}
/*
1. Insert Task:
		1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element. the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array

 */