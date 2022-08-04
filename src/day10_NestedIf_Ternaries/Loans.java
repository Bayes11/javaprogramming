package day10_NestedIf_Ternaries;

import java.util.*;

public class Loans {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your salary: ");
        int salary = sc.nextInt();

        System.out.println("Please enter your credit score");

        int credit = sc.nextInt();
    String result = (salary > 60000 && credit > 650)? "Loan approved" : "Loan denied";
        System.out.println(result);
    }


}
