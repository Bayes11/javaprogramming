package day17_DoWhile_WhileLoop;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = scan.nextInt();

        while (!(age > 0 && age <=120)) {
            System.err.println("Invalid entry, please re enter!");
            age = scan.nextInt();
        }
        if (age>=18)
            System.out.println("You are eligible to vote!");
        else
            System.out.println("Sorry, you are not eligible to vote!");
    }
}
