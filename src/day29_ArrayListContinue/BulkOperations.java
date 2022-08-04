package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list);

        list.removeAll(Arrays.asList(2,3,5));

        System.out.println(list);

        // retainAll(): opposite of removeAll method, it will remove non-matching elements.

        System.out.println("----------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90));

        System.out.println(list1);

        list1.retainAll(Arrays.asList(10,50,90));

        System.out.println(list1);

        System.out.println("----------------------------------------------");

        // containsAll():

        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,8,9,10));
        System.out.println(numbers);

        boolean r1 = numbers.contains(10);

        boolean r2 = numbers.contains(2);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        boolean r3= numbers.containsAll(Arrays.asList(2,5,10));

        System.out.println("r3 = " + r3);

        boolean r4 = numbers.containsAll(Arrays.asList(1,2,1000));

        System.out.println("r4 = " + r4);

        System.out.println("----------------------------------------");


        // Array
        // asList(array of values) ====> returns the array as collectionType

// converting non-primitive array to arrayList or Collection.
        String [] names = {"Bayes" , "Basit", "Navid", "Wakil"};

        ArrayList <String > namesList = new ArrayList<>(Arrays.asList(names));
        /*
        namesList.addAll(Arrays.asList(names));

        System.out.println(namesList);

*/

        System.out.println("---------------------------------------------------------");

        Integer [] arr = {1,2,3,4,5,6,7,8,9};

        ArrayList <Integer> list2 = new ArrayList<>(Arrays.asList(arr));

        System.out.println(list2);

        System.out.println("------------------------------------------------------------");

        int [] arr2 = {1,2,3,4,5,6};

        ArrayList <Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2));

        System.out.println(list3);



    }


    public static ArrayList <Integer> convertArrayToArrayList(int [] array){

        ArrayList <Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);

        }
        return list;
    }
}
