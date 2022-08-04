package day17_DoWhile_WhileLoop;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int attempt =1 ;
        System.out.println("Username: ");
        String userName = scan.nextLine();

        System.out.println("Password: ");
        String password = scan.nextLine();

        while (!(userName.equals("Cydeo") || password.equals("Cydeo123") ) && attempt <3){

            System.out.println("Invalid, please re enter!");

            System.out.println("Username: ");
            userName = scan.nextLine();

            System.out.println("Password: ");
            password = scan.nextLine();
            attempt++;
        }
        if (attempt==3)
            System.out.println("your account is blocked!");
        else
            System.out.println("Logged in");

        scan.close();

    }
}
