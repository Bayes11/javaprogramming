package day25_CustomMethod_Overloading;

public class MethodOverloadingIntro {
    public static void main(String[] args) {

        int sum1 = sumOfNumbers(10,20);
        int sum2 = sumOfNumbers(10,20,30);
        double sum3 = sumOfNumbers(7.7,2.5);
        double sum4 = sumOfNumbers(7.5,5.5,6.5);
        System.out.println("sum4 = " + sum4);
        System.out.println("sum3 = " + sum3);
        System.out.println("sum2 = " + sum2);
        System.out.println("sum1 = " + sum1);
    }
    public static int sumOfNumbers(int num1 , int num2){
        return num1 + num2;
    }
    public static double sumOfNumbers(double num1 , double num2){
        return num1 + num2;
    }
    public static int sumOfNumbers(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public static double sumOfNumbers(double num1 , double num2, double num3){
        return num1+num2+num3;
    }
}
