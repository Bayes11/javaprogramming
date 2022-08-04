package day10_NestedIf_Ternaries;

public class Grade {
    public static void main(String[] args) {
        char grade = 'B';
        String result = "";
        if (grade>='A' && grade<= 'F') {
            if (grade == 'A'){
                System.out.println("excellent");
            } else if (grade=='B') {
                result = "great job";

            } else if (grade=='C') {
                result = "Good";

            } else if (grade=='D') {
                result = "passed";

            }else {
                result = "Failed";
            }

        }else {
            System.out.println("Invalid");
        }
        System.out.println(result);
    }
}