package InterviewQuestions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String reverse ="";
        String str  = scan.nextLine();;
        int length = str.length();
        length-=1;
        for (int i=length; i>=0; i--){

            reverse+=str.charAt(i);

        }
        boolean isPalindrome = str.equalsIgnoreCase(reverse);
        System.out.println("isPalindrome = " + isPalindrome);
    }
}
