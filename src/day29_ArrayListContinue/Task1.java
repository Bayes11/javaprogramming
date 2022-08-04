package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,2,3,4,5,6,7,7,8,8));

        int n = 5;


        Collections.sort(list);

        int number = list.get(list.size()-5);

        System.out.println("number = " + number);





    }
}
/*
1. write a program that can return the nth largest number from an arraylist

			arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
			n = 5

			output:
				4
 */
