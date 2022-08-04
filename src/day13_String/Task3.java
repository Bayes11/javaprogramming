package day13_String;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();

        int length = str1.length();


        char first = str1.charAt(0);
        char last = str1.charAt(length-1);

        if (first == last)
            System.out.println("same");
        else
            System.out.println("not same");


    }
}
