package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {
    public static void main(String[] args) {


        ArrayList <Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        Collections.swap(list,0,list.size()-1);

        System.out.println(list);

        System.out.println("------------------------------------");

        ArrayList <Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

       int size = numbers.size();

       numbers.removeAll(Arrays.asList(0));

        System.out.println(numbers);

        int newSize = numbers.size();

        int totalNumberOfZeros = size - newSize;

        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros);

        for (int i = 0; i < totalNumberOfZeros; i++) {
            numbers.add(0);

        }
        System.out.println(numbers);

        System.out.println("-------------------------------------------------------");

        // different approach.

        ArrayList <Integer> numbers1 =  new ArrayList<>();

        numbers1.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList <Integer> result = new ArrayList<>();

        for (Integer each : numbers1) {
            if (each!=0)
                result.add(each);

        }
        for (Integer each : numbers1) {
            if (each==0)
                result.add(each);

        }

        System.out.println(result);


        System.out.println("------------------------------------------------------------------");

        // write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists.

        // str = "ABCD123$%#@&456EFG!"

        String str = "ABCD123$%#@&456EFG!" ;

        ArrayList<Character> sentence = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            sentence.add(str.charAt(i));

        }

        System.out.println(sentence);

        ArrayList <Character> letters = new ArrayList<>();
        ArrayList <Character> digits = new ArrayList<>();
        ArrayList <Character> characters = new ArrayList<>();


        for (Character each : sentence) {
            if (Character.isLetter(each))
                letters.add(each);

        }
        for (Character each : sentence) {
            if (Character.isDigit(each))
                digits.add(each);

        }
        for (Character each : sentence) {
            if (!Character.isLetterOrDigit(each))
                characters.add(each);

        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("characters = " + characters);







    }

    }

/*
1. write a program that can swap the first and the last elements of an Arraylist

2. write a program that can move all zeros to the last indexes of Arraylist

list : {1,0,2,0,3,0,4,0}

output: [1,2,3,4,0,0,0,0]

*/
