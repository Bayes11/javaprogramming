package day12_scanner;
import java.io.Closeable;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your hourly rate:");
        double hourlyRate = sc.nextDouble();
        System.out.println("how many hours a week do you work?");
        double hours = sc.nextDouble();
        System.out.println("enter the state tax:");
        double tax = sc.nextDouble();
        tax/=100;
        System.out.println("enter the federal tax:");
        double Ftax = sc.nextDouble();
        Ftax /= 100;

        double salary = hourlyRate * hours *52;
        System.out.println("salary = " + salary);

        double stateTax = salary * tax;
        System.out.println("stateTax = " + stateTax);

        double federalTax = salary * Ftax;
        System.out.println("federalTax = " + federalTax);

        double totalTax = federalTax + stateTax;
        System.out.println("totalTax = " + totalTax);

        double netincome= salary - totalTax;
        System.out.println("netincome = " + netincome);

    }
}
