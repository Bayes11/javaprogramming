package day18_NestedLoop;

public class Task5_Unique {
    public static void main(String[] args) {
        String word = "aabccdeef";
        int frequency = 0 ;
        String result = "";


        while (word.length() >=1) {
            char ch = word.charAt(0);
            frequency=0;

            for (int j = 0; j < word.length(); j++) {
                if (word.substring(j, j + 1).contains("" + ch)) {
                    frequency++;
                }

            }
            if (frequency==1)
                result += "" + ch;

            word = word.replaceAll("" + ch , "");

        }

        System.out.println("Unique letters are " + result);

    }
}
/*
5. Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique
 */