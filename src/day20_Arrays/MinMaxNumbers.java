package day20_Arrays;

public class MinMaxNumbers {
    public static void main(String[] args) {

        int num [] = {5,3,1,4,7,8,9,6,11};

        int max = num[0];
        int min = num[0];


        for (int i = 0; i < num.length; i++) {

            if(num[i] > max)
                max= num[i];
            if(num[i] < min)
                min= num[i];

        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
