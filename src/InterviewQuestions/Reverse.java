package InterviewQuestions;

import java.util.Scanner;



public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result = "";
        String input = scan.nextLine();

        int length = input.length();
        length-=1;
        for (int i = length ; i>=0; i--){
            result += (input.charAt(i) + "");
        }
        System.out.println("result = " + result);
    }
}
