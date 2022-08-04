package InterviewQuestions;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int i = 0;
        double divide = 0 ;

        while (num1>=num2) {
            num1 = num1-num2;
            divide++;
        }
        System.out.println("divide = " + divide);

    }
}


/*
1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
 */
