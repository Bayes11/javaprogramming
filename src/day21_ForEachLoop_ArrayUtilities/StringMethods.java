package day21_ForEachLoop_ArrayUtilities;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "java";
        char [] chars= str.toCharArray();

        System.out.println(Arrays.toString(chars));
        for(char each:chars){
            System.out.println(each);
        }

        System.out.println("------------------------");
    }
}
