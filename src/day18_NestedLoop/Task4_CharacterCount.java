package day18_NestedLoop;

public class Task4_CharacterCount {
    public static void main(String[] args) {

        String word = "aaabbacc";
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
            if (frequency>0)
                result += "" + ch + frequency;

            word = word.replaceAll("" + ch , "");

        }

        System.out.println(result);




    }
}