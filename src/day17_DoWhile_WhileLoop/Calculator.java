package day17_DoWhile_WhileLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("enter the first number: ");
        int num1 = scan.nextInt();
        System.out.println("enter the second number: ");
        int num2 = scan.nextInt();
        System.out.println("enter the math operator: ");
        char ch = scan.next().charAt(0);

        while (!(ch == '+' || ch == '-')){

            System.err.println("Invalid operator, please reenter!");
            ch = scan.next().charAt(0);

        }
        System.out.println((ch=='+')? num1+num2 : num1-num2);


    }
}
