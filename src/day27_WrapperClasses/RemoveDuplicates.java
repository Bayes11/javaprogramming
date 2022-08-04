package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int [] result = removeDuplicates(new int[]{1,1,2,3,3,2,5,4,6,6});
        System.out.println(Arrays.toString(result));

    }

    public static int [] removeDuplicates(int [] array){

        int [] result = {};

        for (int each : array) {

            if (!ArraysUtility.contains(result,each))
                result = ArraysUtility.addElement(result,each);

        }

        return result;



    }

}
