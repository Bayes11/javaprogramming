package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseTheArrayAndArrayList {
    public static void main(String[] args) {


        int [] array = {1,2,3,4,5,6,7,8,9};

        int [] reverse = new int[array.length];
        int j =0;

        for (int i = array.length - 1; i >= 0; i--) {
            reverse [j++] = array[i];
        }

        System.out.println(Arrays.toString(reverse));

        System.out.println("------------------------------------------");

        ArrayList <Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        ArrayList <Integer> reversedList =  new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        System.out.println(reversedList);
    }
}
