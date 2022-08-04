package day20_Arrays;

public class Task1 {
    public static void main(String[] args) {

        String classmates [] = {"Basit Usmany", "Bayes Usmany", "Navid Haydari", "Wakil Wasiq"};
String initials = "";
        for (int i = 0; i < classmates.length; i++) {
           initials = ("" + classmates[i].charAt(0) + "."+  classmates[i].charAt(classmates[i].indexOf(" ") +1));
            System.out.println(initials);

        }


    }
}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */