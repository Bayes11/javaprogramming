package day17_DoWhile_WhileLoop;

import java.util.Scanner;

public class Task2_sum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scan.nextInt();
        int sum = 0 ;

        while (num>0) {
            sum = sum + num;
            System.out.println("sum = " + sum);
            System.out.println("enter a number: ");
            num = scan.nextInt();
                    }
        System.out.println("invalid number!");


    }
}
/*
 Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop

 */