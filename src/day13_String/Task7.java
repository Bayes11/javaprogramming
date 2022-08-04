package day13_String;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        String str3 = scan.nextLine();
        int length1= str1.length();
        int length2= str2.length();
        int length3= str3.length();

        if (length1==length2 && length2== length3)
            System.out.println("All words are same length.");
        else if (length1==length2 || length2 == length3 || length1==length3)
            System.out.println("Not same nor Different lengths");
        else if (length1!=length2 && length2!=length3)
            System.out.println("All different length.");


    }
}

/*7. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
*/