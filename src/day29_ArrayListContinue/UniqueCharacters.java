package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aaaabccccdeeef";

       String [] array =  str.split("");

        ArrayList <String> list = new ArrayList<>(Arrays.asList(array));

        System.out.println("list = " + list);

        String unique = "";

        for (String each : list) {
           int freq =  Collections.frequency(list, each);
           if (freq == 1)
               unique+=each;

        }

        System.out.println("unique = " + unique);


    }
}
