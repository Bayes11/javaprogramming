package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays_practice1 {
    public static void main(String[] args) {

        int numbers [] = {10 , 20 , 50, 70};// size = 4



        System.out.println(Arrays.toString(numbers));

        System.out.println("-----------------------------");


        int scores [] = new int[5];

        scores[0]= 60;
        scores[1]= 70;
        scores[2]= 80;
        scores[3]= 90;
        scores[4]=100;
        // scores[scores.length-1]= 100;

        System.out.println(Arrays.toString(scores));

    }
}
