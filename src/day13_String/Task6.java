package day13_String;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        int length = str.length();

        if (length==3){
            if (str.charAt(1) == 'a')
                System.out.println("Cool word");
            else
                System.out.println("Okay word");
        }
        else if (length > 3 )
            System.out.println("too long");
        else if  (length<3)
            System.out.println("too short");

    }
}
