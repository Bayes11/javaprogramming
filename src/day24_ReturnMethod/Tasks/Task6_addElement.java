package day24_ReturnMethod.Tasks;

import java.util.Arrays;

public class Task6_addElement {
    public static void main(String[] args) {


        int [] newArray =  addElement(new int [] {1,2,3} , 4);

        System.out.println(Arrays.toString(newArray));
    }
    public static int [] addElement(int [] Array , int num){
        int[] newArray = new int[Array.length+1];

        for (int i = 0; i < Array.length; i++) {
            newArray[i] = Array[i];
            
        }
        newArray[newArray.length-1] = num;
        return newArray;

    }
}
/*
    6. create a method named addElement that takes one integer array and one integer, the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}
 */