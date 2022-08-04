package day15_ForLoop;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int sum =0 ;
        int length = input.length();

        for(int i=0; i<length; i++){
            char r = input.charAt(i);

            if ((r >= 'a' && r<= 'z') || (r >= 'A' && r<= 'Z'))
                System.out.print("");
            else if (r >= '1' && r<='9')
                sum = sum+(r - 48);
            else
                System.out.println("");
        }
        System.out.println("sum = " + sum);



    }
}
/*
6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...
 */