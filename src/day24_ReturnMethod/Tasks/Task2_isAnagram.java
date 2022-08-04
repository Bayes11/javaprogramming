package day24_ReturnMethod.Tasks;

import java.util.Arrays;

public class Task2_isAnagram {
    public static void main(String[] args) {
        isAnagram("bayes", "basit");

        boolean isAnagram = isAnagram("bayes", "seyab");
        System.out.println("isAnagram = " + isAnagram);

    }

    public static boolean isAnagram(String str1 , String str2){

        char [] Array1 = str1.toCharArray();
        char [] Array2 = str2.toCharArray();

        Arrays.sort(Array1);
        Arrays.sort(Array2);
        boolean isAnagram = false;

        if(Arrays.equals(Array1,Array2))
            isAnagram = true;
        else
            isAnagram = false;


        return isAnagram ;
    }
}
/*
    2. create a method named isAnagram that passes two String parameters, the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true
 */