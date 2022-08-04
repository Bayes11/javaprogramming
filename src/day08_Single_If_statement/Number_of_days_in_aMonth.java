package day08_Single_If_statement;
import java.util.*;
public class Number_of_days_in_aMonth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of the month:");

        int number = sc.nextInt();

        if (number == 1 || number == 3 || number == 5 || number == 8 || number == 10 || number == 12 || number == 7){
            System.out.println("This month has 31 days.");
        }
        else if (number == 4 || number == 6 || number == 9 || number == 11) {
            System.out.println("This month has 30 days.");
        }
        else if (number == 2){
            System.out.println("This month has 28 days.");
        }

    }
}
