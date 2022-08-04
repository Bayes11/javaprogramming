package day15_ForLoop;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
String letter = "";
String number = "";
String character= "";
        int length = input.length();

        for (int i=0; i<length;i++){
            char r = input.charAt(i);

            if ((r >= 'a' && r<= 'z') || (r >= 'A' && r<= 'Z'))
                letter = letter + r;
            else if (r >= '1' && r<='9')
                number+=r;

            else
                character+=r;
        }
        System.out.println("letter  = " + letter);
        System.out.println("digits = " + number);
        System.out.println("characters = " + character);

    }
}
/*
5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */