package day10_NestedIf_Ternaries;

import org.w3c.dom.ls.LSOutput;

public class CrewAndPassenger {
    public static void main(String[] args) {
        int number = 90;
        int crew = 0;
        int passengers = 0;
        if (number < 100) {
            if (number > 75) {
                crew = number * 30 / 100;
                passengers = number * 70 / 100;
            }
            else if (number >= 50) {

                crew = number * 70 / 100;
                passengers = number * 30 / 100;
            }

        } else
            System.out.println("Invalid number.");
        System.out.println("Total: " + number + " ===> " + crew + " crew "+ ","+ passengers+ " passengers");
    }
}