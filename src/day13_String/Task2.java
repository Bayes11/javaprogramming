package day13_String;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        int length1 = str1.length();
        int length2 = str2.length();

        if (length1>length2)
            System.out.println(str1);
        else
            System.out.println(str2);
    }
}
