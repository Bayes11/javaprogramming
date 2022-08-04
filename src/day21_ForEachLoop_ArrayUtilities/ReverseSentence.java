package day21_ForEachLoop_ArrayUtilities;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Today is a good day to learn java";

        String [] Array = sentence.split(" ");
        String reverse = "";
        for(int i = Array.length-1; i>=0 ; i--){
            reverse+=Array[i] + " ";}

        System.out.println(reverse);


        System.out.println("-------------------------------------------");

        // write a program to reverse the second word of the sentence

        String words = "i love java";

       String [] Array1 =  words.split(" ");
       String reverse1 = "";

        for (int i = 0; i < Array1.length; i++) {
            if (i==1){
                for (int j = Array1.length; j>=0; j--)
                    reverse1+=Array1[i].charAt(j);
            }
        }
        words = words.replaceFirst(Array1[1], reverse1);

        System.out.println(words);

    }
}
