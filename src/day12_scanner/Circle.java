package day12_scanner;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the radius:");
        double Radius = sc.nextDouble();
         double PI = 3.14;

         double Area = PI * Math.pow(Radius,2) ;
         double Perimeter = 2 * PI * Radius;

        System.out.println("Area = " + Area + "  Perimeter = " + Perimeter);

    }
}
