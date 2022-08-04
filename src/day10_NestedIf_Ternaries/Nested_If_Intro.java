package day10_NestedIf_Ternaries;

public class Nested_If_Intro {
    public static void main(String[] args) {
        int grade  = 25;

        String grade_level = "";

        if (grade > 0 && grade < 19) {

            if (grade >= 1 && grade <= 5)
                grade_level = "Elementary school";
            if (grade >= 6 && grade <= 8)
                grade_level = "Middle school";
            if (grade >= 9 && grade <= 12)
                grade_level = "High school";
            if (grade >= 13 && grade <= 16)
                grade_level = "College";
            if (grade >= 17 && grade <= 18)
                grade_level = "Grad school";
        }else{
            System.out.println("Invaled grade level given");
        }
        System.out.println(grade_level);
    }
}
