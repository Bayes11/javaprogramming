package day21_ForEachLoop_ArrayUtilities;

import java.util.Arrays;

public class ArrayUtility {
    public static void main(String[] args) {
        int [] Array = {1,2,3,4,5,6,7,8,9,10};

        int [] ArrayCopy = Arrays.copyOfRange(Array,5,Array.length);

        System.out.println(Arrays.toString(ArrayCopy));
    }
}
