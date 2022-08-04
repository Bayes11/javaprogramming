package day27_WrapperClasses;

public class WrapperClassIntro {
    public static void main(String[] args) {
        int num1 = 200;

        Integer n1 = num1; // autoboxing

        int num2 = n1; // unboxing

        System.out.println("------------------------------");

        Byte b1 = 25;

        byte a1 = b1;
        int a2 = b1;
        long a3 = b1;

        System.out.println("-------------------------------");

        int num3 = 100;

        Integer int1 = num3;
       // Byte byte1 = num3; // you cannot autobox from int to Byte.
    }
}
