package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstUniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        numbers.add(1);
        numbers.add(3);
        numbers.add(3);
        numbers.add(5);

        System.out.println(numbers);


        for (Integer each : numbers) {
            int freq = 0;

            for (Integer element : numbers) {
                if (element == each) {
                    freq++;
                }

            }
            if (freq==1){
                System.out.println(each);
            break;}

        }

    }
}
