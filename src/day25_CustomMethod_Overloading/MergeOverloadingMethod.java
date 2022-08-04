package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MergeOverloadingMethod {
    public static void main(String[] args) {

        int [] newArray = merge(new int[] {1,2,3} , new int[]{4,5,6});
        System.out.println("newArray = " + Arrays.toString(newArray));

        char[] newArray1 = merge(new char[]{'A','B','C'}, new char[]{'D','E','F'});
        System.out.println("newArray1 = " + Arrays.toString(newArray1));

        double[] newArray2 = merge(new double[]{2.5,3.5,4.5}, new double[]{5.5,6.5,7.5});
        System.out.println("newArray2 = " + Arrays.toString(newArray2));

        String [] newArray3 = merge(new String[]{"bayes", "basit", "navid"}, new String[]{"wakil", "obaid", "khalid"});
        System.out.println("newArray3 = " + Arrays.toString(newArray3));

    }

    public static int [] merge (int [] array1 , int[] array2){

        int i =0 ;
        int [] newArray = new int[array1.length + array2.length];
        for (int each : array1) {
            newArray[i] = each;
            i++;}
            for (int each1 : array2) {
                newArray[i]=each1;
                i++;
            }
            return newArray;
    }
    public static char [] merge (char [] array1 , char[] array2){

        int i =0 ;
        char [] newArray = new char[array1.length + array2.length];
        for (char each : array1) {
            newArray[i] = each;
            i++;}
        for (char each1 : array2) {
            newArray[i]=each1;
            i++;
        }
        return newArray;
    }
    public static double [] merge (double [] array1 , double[] array2){

        int i =0 ;
        double [] newArray = new double[array1.length + array2.length];
        for (double each : array1) {
            newArray[i] = each;
            i++;}
        for (double each1 : array2) {
            newArray[i]=each1;
            i++;
        }
        return newArray;
        
    }
    public static String [] merge (String [] array1 , String[] array2){

        int i =0 ;
        String [] newArray = new String[array1.length + array2.length];
        for (String each : array1) {
            newArray[i] = each;
            i++;}
        for (String each1 : array2) {
            newArray[i]=each1;
            i++;
        }
        return newArray;
    }
}
