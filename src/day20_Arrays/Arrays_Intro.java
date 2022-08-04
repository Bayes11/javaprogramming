package day20_Arrays;

import java.util.Arrays;

public class Arrays_Intro{
    public static void main(String[] args) {

        // when the array size is fixed but you don't know the data inside it.

        String myGroup [] = new String [5];

        myGroup[0] = "Bayes";
        myGroup[1] = "Basit";
        myGroup[2] = "Navid";
        myGroup[3] = "Wakil";
        myGroup[4] = "Qodos";
        System.out.println(Arrays.toString(myGroup));

        // when both the array size and data is known.

        int numbers [] = {1,2,3,4,5};

        System.out.println(Arrays.toString(numbers));



    }
}
