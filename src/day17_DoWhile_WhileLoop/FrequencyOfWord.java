package day17_DoWhile_WhileLoop;

import java.util.Scanner;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String str = "java java python java";

        int frequency =0 ;

        while (str.contains("java")){

            str = str.replaceFirst("java", "");
            frequency++;
        }
        System.out.println("frequency = " + frequency);
    }
}
