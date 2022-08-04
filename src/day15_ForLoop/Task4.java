package day15_ForLoop;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();
        int factorial =1;
        for(int i =1 ; i <= input ; i++ ){
            factorial= factorial * i ; }
        System.out.println("factorial = " + factorial);

    }
}
