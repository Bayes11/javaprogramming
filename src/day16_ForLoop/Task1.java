package day16_ForLoop;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i =0 ; i < 5 ; i++) {
            int num = scan.nextInt();

            if (num>0)
                positive+=1;
            else if (num<0)
                negative+=1;
            else
                zero+=1;
        }
        System.out.println(positive + " positive " + negative + " negative " + zero + " zero.");
    }
}
/*
1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */