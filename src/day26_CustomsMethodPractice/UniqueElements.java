package day26_CustomsMethodPractice;

import utilities.ArraysUtility;

public class UniqueElements {

    public static int [] uniqueElements(int[] array){

        int [] result = {};
        int freq = 0;
        int i =0;

        for (int each : array) {
            freq = ArraysUtility.frequencyOfElement(array,each);

            if (freq==1){
               result =  ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }
}
