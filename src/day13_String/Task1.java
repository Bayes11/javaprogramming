package day13_String;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine();

        int length = sentence.length();

        System.out.print(sentence.charAt(0));
        System.out.println(sentence.charAt(length-1));

    }
}
