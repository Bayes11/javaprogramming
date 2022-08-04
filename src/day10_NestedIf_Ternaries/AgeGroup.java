package day10_NestedIf_Ternaries;

import org.w3c.dom.ls.LSOutput;

public class AgeGroup {
    public static void main(String[] args) {
        int age = 21;
        String result = "";

        if (age > 0 && age < 150){

            if (age < 21)
                result = "Teenager";
            else if (age>=21 && age < 55)
                result= "Adult";
            else if (age>=55)
                result = "Senior";

        }else
            System.out.println("invalid");
        System.out.println(result);
    }
}
