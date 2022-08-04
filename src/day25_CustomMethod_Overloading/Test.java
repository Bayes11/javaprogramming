package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {

        String str = " Java Programming";

        StringUtility.printEachChar(str);
        System.out.println("------------------------------------");
        String reverse = StringUtility.reverse(str);
        System.out.println("reverse = " + reverse);

        System.out.println("------------------------------------");

        String word = "civic";

        boolean isPalindrome = StringUtility.isPalindrome(word);
        System.out.println("isPalindrome = " + isPalindrome);
        System.out.println("-------------------------------------");

        String str1 = "silent";
        String str2 = "bayes";

        boolean isAnagram = StringUtility.isAnagram(str1,str2);

        System.out.println("isAnagram = " + isAnagram);
        System.out.println("--------------------------------------");

        String word1 = "aaaaaaaaabbbbbccccdddefr";

        word1 = StringUtility.removeDuplicates(word1);

        System.out.println(word1);



    }
}
