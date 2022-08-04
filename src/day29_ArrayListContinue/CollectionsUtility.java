package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {


        // Collections: utility class of collection.

        // sort();

        ArrayList <Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(5,6,7,8,9,10,1,2,3,4));

        Collections.sort(list);
        System.out.println(list);

        System.out.println("-------------------------------------");

        // reverse () :
        ArrayList<Character> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList('a', 'b','c','d'));

        System.out.println(list2);

        Collections.reverse(list2);

        System.out.println(list2);

        System.out.println("--------------------------------------------------");

        // swap () :

        ArrayList <Integer> list3 =new ArrayList<>();

        list3.addAll(Arrays.asList(10,20,30,40,50,60,70));
        System.out.println(list3);
        Collections.swap(list3, 1,4);
        System.out.println(list3);

        System.out.println("-------------------------------------");

        // max () : returns the maximum number
        // min () : returns the minimum number

        int max = Collections.max(list3);
        int min = Collections.min(list3);

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("---------------------------------------");

        // replaceAll (): replace all the matching elements at the same time.
        // frequency  ():

        ArrayList <Integer> list4 = new ArrayList<>();

        list4.addAll(Arrays.asList(10,10,20,30,10,10,20,50,60));

        Collections.replaceAll(list4 , 10, 1000);
        System.out.println(list4);

        System.out.println("----------------------------------------");

        ArrayList <Integer> list5 = new ArrayList<>();

        list5.addAll(Arrays.asList(10,10,20,30,10,10,20,50,60));

        int frequency = Collections.frequency(list5, 10);
        System.out.println("frequency = " + frequency);

    }
}
