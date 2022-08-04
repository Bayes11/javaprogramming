package day26_CustomsMethodPractice;


import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {

       int [] result =  ArraysUtility.removeElement(new int[]{1,2,3,4,5,6,7},3);
        System.out.println(Arrays.toString(result));

    }

}