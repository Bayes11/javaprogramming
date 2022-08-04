package day16_ForLoop;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        char c = scan.next().charAt(0);
        int length = str.length();
        int result = 0;

        for(int i= 0 ; i < length ; i++){
            if (str.charAt(i) == c)
                result+=1; }
        System.out.println("result = " + result);



    }
}
/*
2. Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4

 */