package day17_DoWhile_WhileLoop;

import java.util.Scanner;

public class Task5_RoomReservation {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int price = 0 ;

        System.out.println("Do you want to reserve a room? ");

        String reserve = scan.next();

        while (!(reserve.equalsIgnoreCase("yes") || reserve.equalsIgnoreCase("no"))) {
            System.out.println("Please re enter you answer! ");
            reserve = scan.next();
        }

        if (reserve.equalsIgnoreCase("no"))
            System.out.println("have a nice day");
        else if (reserve.equalsIgnoreCase("yes")){
scan.nextLine();
            System.out.println("please enter your room size?");
            String room = scan.nextLine();


            while (!(room.equalsIgnoreCase("king bed") || room.equalsIgnoreCase("queen bed") || room.equalsIgnoreCase("single bed"))) {

                System.out.println("please re enter room : ");
                room = scan.nextLine();
            }

            if (room.equalsIgnoreCase("king bed"))
                price = 120;
            else if (room.equalsIgnoreCase("queen bed"))
                price = 110;
            else if (room.equalsIgnoreCase("single bed"))
                price = 80;


            System.out.println("price = " + price);


        }

    }
}
/*
5. Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)

 */
