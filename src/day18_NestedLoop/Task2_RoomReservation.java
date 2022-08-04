package day18_NestedLoop;

import java.util.Scanner;

public class Task2_RoomReservation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int price = 0 ;
        String bedroom = "";
        int num = 0;
        while (true) {

            System.out.println("Which bedroom do you want to reserve? ");

            bedroom = scan.nextLine();

            System.out.println("How many nights are you staying? ");

            num = scan.nextInt();

            System.out.println("would you like to reserve another room?");

            String a = scan.next();

            while (!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))) {

                System.err.println("Invalid input, please re-enter: ");
                a = scan.next();

            }

            if (bedroom.equalsIgnoreCase("King bed"))
                price = 120 * num;
            else if (bedroom.equalsIgnoreCase("queen bed"))
                price = 100 * num;
            else if (bedroom.equalsIgnoreCase("single bed"))
                price = 80 * num;

            System.out.println("price = " + price);


            if (a.equalsIgnoreCase("no"))
                break;

        }
    }
}
/*
2. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

 */