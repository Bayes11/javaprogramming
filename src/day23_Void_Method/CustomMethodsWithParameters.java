package day23_Void_Method;

public class CustomMethodsWithParameters {
    // check if number is odd or even
    public static void main(String[] args) {

        oddOrEven(10);
        ageOfPerson(2001);
        printNumbers(10,100);

    }

    public static void oddOrEven(int number ){

        if (number%2==0)
            System.out.println(number + " is even number");

        else
            System.out.println(number + " is odd number");


    }

    // create a function that can display the age of the person

    public static void ageOfPerson(int birthYear){


        System.out.println("age = " +( 2022- birthYear ) );
    }

    // create a function that can print all numbers between x and y

    public static void printNumbers (int x , int y){

        for (int i = x; i <=y ; i++) {
            System.out.print(i + " ");

        }
    }



}
