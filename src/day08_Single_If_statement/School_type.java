package day08_Single_If_statement;

public class School_type {
    public static void main(String[] args) {
        byte grade = 20;

        if (grade > 0 && grade < 6) {
            System.out.println("elementary school");
        } else if (grade > 5 && grade < 9) {
            System.out.println("middle school");
        } else if (grade > 8 && grade < 13) {
            System.out.println("high school school");
        } else if (grade > 12 && grade < 17) {
            System.out.println("college");
        }
    }
}
