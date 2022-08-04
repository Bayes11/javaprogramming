package day16_ForLoop;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter two positive numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sum =0 ;
        if (num1>0 && num2>0){
        for (int i =0 ; i < num2 ; i++)
                sum = sum + num1;}
        else
            System.out.println("invalid");

        System.out.println("sum = " + sum);
    }
}
/*
3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200

 */