package day21_ForEachLoop_ArrayUtilities;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "dbac";

        char [] char1 = str1.toCharArray();
        char [] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        boolean Anagram = Arrays.equals(char1,char2);
            System.out.println(Anagram);
    }
}
