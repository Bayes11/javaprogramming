package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Please enter a number:");
        int num = scan.nextInt();

        System.out.println("Please enter " + num + " itmes");

        String items [] = new String[num];


        for (int i = 0; i < num; i++) {
            items[i] = scan.next();

        }
        System.out.println(Arrays.toString(items));
    }
}
