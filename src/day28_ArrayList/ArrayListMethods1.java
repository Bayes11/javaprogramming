package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();

        // add() : adding elements into our arraylist. and increase the size.
        // add(index , element) : adding element into specific index.
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);

        numbers.add(1,15);

        System.out.println(numbers);

        System.out.println(numbers.size());

        int lastIndex = numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex);

        // get(index) : returns the element at the given arrayList

        Integer num = numbers.get(3);

        System.out.println("num = " + num);

        System.out.println("--------------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {

            System.out.println(numbers.get(i));

        }
        System.out.println("---------------------------------------------------");
        // set(index , Data) : replace old element in the index with the new element.

        ArrayList<String> list = new ArrayList<>();

        list.add("bayes");
        list.add("basit");
        list.add("navid");
        list.add("obaid");
        list.add("zobaid");

        System.out.println(list);

        list.set(2,"qodos");
        System.out.println(list);




    }
}
