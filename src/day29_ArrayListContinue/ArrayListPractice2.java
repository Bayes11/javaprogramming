package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList <String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Ahmad", "Bayes" , "Basit", "Navid" , "Ahmad" , "David"));

        employees.retainAll(Arrays.asList("Ahmad" , "David"));

        System.out.println(employees);

        System.out.println("----------------------------------------------------");

        String [] array  = {"Ahmad", "Bayes" , "Basit", "Navid" , "Ahmad" , "David", "Bashir"};

        // remove elements that starts with B.

        ArrayList <String> list = new ArrayList<>(Arrays.asList(array));

        list.removeIf(p-> p.startsWith("B"));

       array =  list.toArray(new String[0]);
        System.out.println(Arrays.toString(array));



    }
}
