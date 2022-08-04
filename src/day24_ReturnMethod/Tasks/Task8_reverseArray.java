package day24_ReturnMethod.Tasks;

import java.util.Arrays;

public class Task8_reverseArray {
    public static void main(String[] args) {
int [] reverse  = reverse(new int [] {1,2,3,4,5});
        System.out.println(Arrays.toString(reverse));
    }
    public static int [] reverse (int [] array){

        int [] reverse  = new int[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {
            reverse[j] = array[i];

        }
        return reverse;
    }
}
/*
	8. Create method named reverse that passes an integer array parameter, the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}

 */