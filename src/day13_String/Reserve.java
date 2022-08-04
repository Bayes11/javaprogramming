package day13_String;

import java.util.Scanner;

public class Reserve {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();

        int len = str1.length();


        if (len == 5 ){
            System.out.print( str1.charAt(len-1) );
        System.out.print( str1.charAt(len-2) );
        System.out.print( str1.charAt(len-3) );
        System.out.print( str1.charAt(len-4) );
        System.out.print( str1.charAt(len-5) );}

        else if (len > 5)
            System.out.println("too long");
        else if (len<5)
            System.out.println("too short");


    }
}
/*
1.  Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.
 */