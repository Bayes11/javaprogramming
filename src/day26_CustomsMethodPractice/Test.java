package day26_CustomsMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int frequency =  ArraysUtility.frequencyOfElement(new int [] {1,2,3,1,2,3,5,3,4,8,6}, 3);
        System.out.println("frequency = " + frequency);
        int frequency1 = ArraysUtility.frequencyOfElement(new char [] {'a','b','c','c','c'},'c');
        System.out.println("frequency1 = " + frequency1);
        int frequency2 = ArraysUtility.frequencyOfElement(new String[] {"bayes", "bayes", "basit"},"bayes");
        System.out.println("frequency2 = " + frequency2);
        int frequency3 = ArraysUtility.frequencyOfElement(new double[] {1.5,1.5,2.5,3.5,1.5,1.5,6.5,6.5},1.5);
        System.out.println("frequency3 = " + frequency3);

        System.out.println("---------------------------------------------------");


        int array [] = ArraysUtility.uniqueElements(new int[] {2,3,2,4,5,2,5,2,1});

        System.out.println(Arrays.toString(array));

        char array1 [] = ArraysUtility.uniqueElements(new char [] {'a','b','b','c'});

        System.out.println(Arrays.toString(array1));

        String array2 [] = ArraysUtility.uniqueElements(new String []{"bayes", "bayes" , "basit"});
        System.out.println(Arrays.toString(array2));
    }
}
