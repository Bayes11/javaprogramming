package day17_DoWhile_WhileLoop;

import java.util.Scanner;

public class Task6_InsuranceQuote {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double price = 0 ;

        System.out.println("enter your name: ");
        String name = scan.nextLine();

        System.out.println("Enter your gender: ");
        String gender = scan.nextLine();

        while (!(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))) {
            System.out.println("Invalid input! re enter your gender: ");
            gender = scan.nextLine();}


            System.out.println("Are you married: ");
            String isMarried = scan.next();

            while (!(isMarried.equalsIgnoreCase("yes") || isMarried.equalsIgnoreCase("no"))) {
                System.out.println("Invalid input! re enter your answer: ");
                isMarried = scan.next();}

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        while (age > 120 && age < 0 ) {
            System.out.println("Invalid input! re enter your answer: ");
            age = scan.nextInt();}

        System.out.println("How manu miles you drive in a day? ");
        int mile = scan.nextInt();

        while ( mile < 5  ) {
            System.out.println("Invalid input! re enter your answer: ");
            mile = scan.nextInt();}

        System.out.println("Do you want full coverage or liability insurance?");
        scan.nextLine();
        String insuranceType = scan.nextLine();
        while (!(insuranceType.equalsIgnoreCase("yes") || insuranceType.equalsIgnoreCase("no"))) {
            System.out.println("Invalid input! re enter your answer: ");
            insuranceType = scan.next();}



        System.out.println("Did you have any accident in the last 5 years? ");
        String accident = scan.next();

        while (!(accident.equalsIgnoreCase("yes") || accident.equalsIgnoreCase("no"))) {
            System.out.println("Invalid input! re enter your answer: ");
            accident = scan.next();}


        System.out.println("does your car have any anti theft device? ");
        String device = scan.next();

        while (!(device.equalsIgnoreCase("yes") || device.equalsIgnoreCase("no"))) {
            System.out.println("Invalid input! re enter your answer: ");
            device = scan.next();}


        if (age > 25)
            price+=90;
        else if (age<=25)
            price+=50;

        if (mile<=10)
            price+=10;
        else if(mile>10 && mile < 50)
            price+=30;
        else
            price+=50;

        if (insuranceType.equalsIgnoreCase("yes")){
            if (age > 25)
                    price+=120;
            else if (age<=25)
                price+=160;

        }


        if (device.equalsIgnoreCase("yes"))
            price= price - price * 0.05;
        if (accident.equalsIgnoreCase("yes"))
            price = price + price*0.15;
        else if (accident.equalsIgnoreCase("no"))
            price = price - price * 0.1;

        if (isMarried.equalsIgnoreCase("yes"))
            price = price - price * 0.05;


        System.out.println("price = " + price);







    }
}
/*
Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user povides a vralid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount

 */