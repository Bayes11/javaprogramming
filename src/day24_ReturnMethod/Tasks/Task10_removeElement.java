package day24_ReturnMethod.Tasks;

import java.util.Arrays;

public class Task10_removeElement {
    public static void main(String[] args) {

        int [] newArray = removeElement(new int[]{ 10,20,30,40,50,60,70}, 2 );

        System.out.println(Arrays.toString(newArray));
    }
    public static int [] removeElement(int [] array , int index){

        int [] newArray = new int[array.length-1];
        for (int i = 0,j=0; i < array.length; i++) {
            if (i==index)
                continue;
            newArray[j++] = array[i];


        }
        return newArray;
    }
}
/*
	10. create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}

 */
