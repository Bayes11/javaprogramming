package day07_operators;

public class SwapTwonumbers {
    public static void main(String[] args) {
        int a = 15;
        int b = 5;

        a=a-b;
        b= a+ b;
        a = b-a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
