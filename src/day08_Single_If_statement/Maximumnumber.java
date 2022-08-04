package day08_Single_If_statement;

public class Maximumnumber {
    public static void main(String[] args) {
        int num1 = 300;
        int num2 = 300;

        if (num1 > num2) {
            System.out.println(num1 + " is maximum number!");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the maximum number!");
        }
        else {
            System.out.println("equal!");
        }
    }
}
