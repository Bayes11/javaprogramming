package day23_Void_Method;


import java.util.Arrays;

public class VoidMethodTasks {
    public static void main(String[] args) {
        oddNumbers(100);
        System.out.println();
        evenNumbers(100);
        System.out.println();
        eligibleToBuyAlcohol(2001);
        eligibleToVote(19,"USA");
        areaOfCircle(5);
        characterOfString("Afghansitan");
        System.out.println();
        elementsOfArray(new int[]{10, 20, 30, 40, 50, 60});
        System.out.println();
        fullNameOfPerson("BaYes", "USmaNY");
        anagram("listen", "silent");





    }

    public static void oddNumbers(int number){
        for (int i = 0; i < number; i++) {
            if (i % 2 !=0)
                System.out.print(i + " ");

        }

    }
    public static void evenNumbers(int number){
        for (int i = 0; i < number; i++) {
            if (i%2==0)
                System.out.print(i + " ");

        }
    }
    public static void eligibleToBuyAlcohol(int birthYear){
        int age = 2022-birthYear;
        if (age>18)
            System.out.println("Eligible to buy Alcohol.");
    }
    public static void eligibleToVote(int age , String nationality){

        if (age >18 && nationality.equalsIgnoreCase("USA"))
            System.out.println("Eligible to vote!");
        else
            System.out.println("Not eligible to vote!");
    }
    public static void areaOfCircle(int radius){

        double area = 3.14 * radius*radius;

        System.out.println("area = " + area);
    }
    public static void characterOfString(String word){
        for (int i = 0; i < word.length(); i++) {
            System.out.print("" + word.charAt(i) + " ");

        }

    }
    public static void elementsOfArray (int [] Array){

        for (int each : Array) {
            System.out.print(each + " ");

        }
    }
    public static void fullNameOfPerson(String firstName, String lastName){
       firstName= firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase() ;
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName + " " + lastName);

    }
    public static void anagram (String str1 , String str2){

        char [] Array1 = str1.toCharArray();
        char [] Array2 = str2.toCharArray();

        Arrays.sort(Array1);
        Arrays.sort(Array2);

        if (Arrays.equals(Array1,Array2))
            System.out.println("Is Anagram!");


    }

}
/*
1. create a method that can print odd numbers between 1~100 in a same line saperated by space

	2. create a method that can print even numbers between 1~100 in a same line saperated by space

	3. create a method that can check if a person is eligible to buy alcohol

	4. create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!

	6. create a method that can calculate the area of a circle

	14. create a method named printEachElement that can print each elements of an integer array

	16.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"


    17. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram

 */