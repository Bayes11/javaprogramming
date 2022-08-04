package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethod2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);

        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        // clear () : clear all the elements

        System.out.println(list.size());

        list.clear();

        System.out.println(list.size());

        System.out.println("---------------------------------------------------------------------------");
        // indexOf(Data):

        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');

       int a =  characters.indexOf('A');
       int b = characters.lastIndexOf('D');

        System.out.println(a);
        System.out.println(b);


        System.out.println("---------------------------------------------------");

        // contain();

        boolean r1 = characters.contains('A');
        System.out.println(r1);

        boolean r2 = characters.contains('Z');
        System.out.println(r2);

        System.out.println("--------------------------------");

        ArrayList <Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(200);
        ArrayList <Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1.equals(list2));

        System.out.println("-----------------------------------");

        // isEmpty();  returns true if the array size is zero.

        ArrayList <Integer> numbers = new ArrayList<>();


        System.out.println(numbers.isEmpty());

        numbers.add(10);
        System.out.println(numbers.isEmpty());

        System.out.println("---------------------------------");
        // Bulk operation : CollectionType
        ArrayList <Integer> numbers1 = new ArrayList<>();

        numbers1.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(numbers1);

    }
}
