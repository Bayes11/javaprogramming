package day15_ForLoop;

import java.util.Scanner;

public class Task7_reverse {
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
