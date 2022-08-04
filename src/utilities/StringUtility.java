package utilities;

import java.util.Arrays;

public class StringUtility {

    // prints each character of the given String
    public static void printEachChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }

    }
    // return the reverse of the given String
    public static String reverse (String str){

        String reverse = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);

        }
        return reverse;
    }
    // check if the String is Palindrome
    public static boolean isPalindrome(String str){
        return reverse(str).equalsIgnoreCase(str);


    }
    // checks if the given String is anagram, return boolean.
    public static boolean isAnagram(String str1 , String str2){

        char [] array1 = str1.toCharArray();
        char [] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);
        boolean isAnagram = false;
        if (Arrays.equals(array1,array2)){
            isAnagram = true; }

        return isAnagram;


    }
    // removes the duplicates from the given string, return string.
    public static String removeDuplicates (String str){

        String newString  = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (! newString.contains("" + ch))
                newString+= "" +ch;

        }
        return newString;
    }



}


