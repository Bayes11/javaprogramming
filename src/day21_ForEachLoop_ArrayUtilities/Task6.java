package day21_ForEachLoop_ArrayUtilities;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        String sentence = "Hello i have learned java but i want to learn python i love python and java";

       String [] Array =  sentence.split(" ");

        System.out.println(Arrays.toString(Array));

        int countJava = 0;
        int countPython = 0;

        for (String each : Array) {
            if(each.equals("java"))
                countJava++;
            else if (each.equals("python"))
                countPython++;


        }
        System.out.println("countPython = " + countPython);
        System.out.println("countJava = " + countJava);

    }
}
/*
	6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)
 */