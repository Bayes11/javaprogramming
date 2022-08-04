package day16_ForLoop;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        String word = scan.nextLine();

        int length = word.length();
        System.out.println("length = " + length);

        int cat = 0 ;
        int dog = 0;

        for (int i =0 ; i < length-3  ; i++){
            if (word.substring(i,i+3).equalsIgnoreCase("cat"))
                cat+=1;
            else if (word.substring(i,i+3).equalsIgnoreCase("dog"))
                dog+=1;

        }
        boolean result = (dog==cat);

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("result = " + result);
    }
}
