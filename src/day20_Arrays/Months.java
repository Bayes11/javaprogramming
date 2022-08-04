package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Months {
    public static void main(String[] args) {

        String months [] = {"Jan", "Feb" , "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};

        for (int i = 0; i < months.length; i++) {
            System.out.print(months[i] + " ");
        }
        System.out.println("");
            System.out.println("------------------------------");
for ( int j = months.length-1; j>=0 ; j--)
    System.out.print(months[j] + " ");
        }
    }

