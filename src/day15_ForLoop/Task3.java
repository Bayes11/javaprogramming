package day15_ForLoop;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();
        int sum = 0;

        for(int i =0; i<=input; i++){
            sum= sum+i;}
        System.out.println("sum = " + sum);
    }
}
