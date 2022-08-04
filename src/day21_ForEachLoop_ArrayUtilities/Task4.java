package day21_ForEachLoop_ArrayUtilities;

public class Task4 {
    public static void main(String[] args) {

        String [] Array =  {"anna", "level", "Java", "mom"};

        boolean isPalindrome;
        int count = 0;
            for (String each : Array) {
                String reverse = "" ;
                for (int i = each.length() - 1; i >= 0; i--) {
                    reverse += each.charAt(i);}

                    if (each.equals(reverse)) {
                        isPalindrome = true;
                        count++;}

            }

        System.out.println(count);
    }
}
/*
  4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */