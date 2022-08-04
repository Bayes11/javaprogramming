package utilities;

public class MathUtility {

    //2.1 Create a method that can return the sum of two integers
    public static int sumOfTwoInteger(int num1 , int num2){
        int sum = num1 +num2 ;

        return sum;
    }

    //2.2 Create a method that can return the sum of two decimal numbers
    public static double sumOfTwoDecimals(double num1, double num2){

        double sum = num1 + num2;

        return sum;
    }

    //2.3 Create a method that can return the subtraction of two integers
    public static int subtractionOfTwoInteger(int num1 , int num2){
        int sub = num1-num2;

        return sub;
    }

    //2.4 Create a method that can return the subtraction of two decimals
    public static double subtractionOfTwoInteger(double num1 , double num2){
        double sub = num1-num2;

        return sub;
    }

    //2.5 Create a method that can return the multiplication of two integers
    public static int multiplicationOfTwoIntegers(int num1 , int num2){

        int mul = num1 * num2;

        return mul;
    }

    //2.6 Create a method that can return the multiplication of two decimals
    public static double multiplicationOfTwoIntegers(double num1 , double num2){

        double mul = num1 * num2;

        return mul;
    }

    //2.7 Create a method that passes two double parameters and return the division result
    public static double division(double num1, double num2){
        double division = num1/num2;

        return division;

    }

    //2.8 Create a method that can check if an integer is even number
    public static void evenNumber(int num){
        if (num%2==0)
            System.out.println("Integer is even!");
        else
            System.out.println("Integer is not even!");
    }

    //2.9 Create a method that can check if an integer is odd number
    public static void oddNumber(int num){
        if (num%2!=0)
            System.out.println("Integer is odd!");
        else
            System.out.println("Integer is not odd!");
    }

    //2.10 Create a method that can return the maximum number between two integers
    public static int maxNumber(int num1 , int num2){
        if (num1>num2)
            return num1;
        else
            return num2;
    }

    //2.11 Create a method that can return the maximum number between two decimal numbers
    public static double MaxNumber(double num1 , double num2){
        if (num1>num2)
            return num1;
        else
            return num2;
    }

    //2.12 Create a method that can return the minimum number between two integers
    public static int minNumber (int num1 , int num2){
        if (num1>num2)
            return num2;
        else
            return num1;

    }

    //2.13 Create a method that can return the minimum number between two decimal numbers
    public static double minNumber (double num1, double num2){
        if (num1>num2)
            return num2;
        else
            return num1;
    }

    //2.14 Create a method that can return the square of an integer
    //					Ex: square(2) ==> 4
    public static int squareOfNumber(int num){
        int square = num * num;
        return square;
    }

    //2.15 Create a method that can return the square of a double
    public static double squareOfNumber(double num){
        double square = num * num;

        return square;
    }

    //2.16 Create a method that can return the cube of an integer
    public static int cubeOfNumber (int num){
        int cube = (int) Math.pow(num,3);

        return cube;
    }

    //2.17 Create a method that can return the cube of a double
    public static double cubeOfNumber(double num){
        double cube = Math.pow(num,3);
        return cube;
    }




}
