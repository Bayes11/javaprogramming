package day12_scanner;
import java.util.Scanner;
public class SpeedCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speedlimit = 55;
        System.out.println("please enter your current speed: ");
        int speed = sc.nextInt();

        if (speed < speedlimit)
            System.out.println("Good job! you are in the speed limit range");
        else{
            int result = speed - speedlimit;
            System.out.println("You are driving " + result + " mph over the limit. Slow down!");
        }
    }
}
