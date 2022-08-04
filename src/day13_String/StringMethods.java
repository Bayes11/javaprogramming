package day13_String;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int length= word.length();

        if (length % 3 ==1 && length >=3 ){
            char letter = word.charAt(length/2);
            System.out.println(letter);}
        else if (length == 1)
            System.out.println(word.repeat(3));
        else if (length >= 4 && length % 2 == 0){
            char letter1 = word.charAt(length/2-1);
            System.out.print(letter1);
            char letter2 = word.charAt(length/2);
            System.out.print(letter2);
        }
        else if (length == 2)
            System.out.println(word.repeat(2));



    }
}
