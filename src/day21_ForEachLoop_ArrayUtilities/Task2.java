package day21_ForEachLoop_ArrayUtilities;

public class Task2 {
    public static void main(String[] args) {

        int [] Array = {1,5,4,7,8,3,6,10,45};
        int even = 0;
        int odd = 0;
        for (int i : Array) {

            if (i%2==0)
                even++;
            else
                odd++;


        }
        System.out.println("odd = " + odd);
        System.out.println("even = " + even);


    }
}
/*
2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */