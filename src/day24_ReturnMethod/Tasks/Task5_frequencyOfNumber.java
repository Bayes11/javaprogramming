package day24_ReturnMethod.Tasks;

public class Task5_frequencyOfNumber {
    public static void main(String[] args) {
        int freq = frequencyOfNumber(new int [] {1,1,1,1,1,2,2} , 1);

        System.out.println("freq = " + freq);


    }
    public static int frequencyOfNumber (int [] array , int number){

        int freq = 0;

        for (int each : array) {
            if (each == number)
                freq++;

        }
        return freq;


    }
}
/*
5. create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5
 */