package day09_IfStatement;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2000;

        if (year % 4 == 0)
            System.out.println(year + " is a Leap year");
        else
            System.out.println(year + " is not a Leap year");
    }
}
