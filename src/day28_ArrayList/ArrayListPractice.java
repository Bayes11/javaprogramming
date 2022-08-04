package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * 2);

        }
        System.out.println(list);


        System.out.println("--------------------------------------");

        // remove(): remove an element from the Arraylist.

        ArrayList<String> employees = new ArrayList<>();

        employees.add("bayes");
        employees.add("basit");
        employees.add("navid");
        employees.add("wakil");
        employees.add("obaid");

        System.out.println(employees);

        employees.remove(1);
        System.out.println(employees);

        employees.remove("obaid");

        System.out.println(employees);

        employees.remove(employees.size()-1);
        System.out.println(employees);
    }
}
