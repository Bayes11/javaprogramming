package day13_String;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        String str = scan.nextLine();

        boolean empty = str.isEmpty();

        int length = str.length();

        if(empty)
            System.out.println("String is empty");
        else if (length>3){
            System.out.print(str.charAt(length-3));
        System.out.print(str.charAt(length-2));
        System.out.print(str.charAt(length-1));}

        else if (length <=3)
            System.out.println(str);




    }
}
