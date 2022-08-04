package day20_Arrays;

public class Task7 {
    public static void main(String[] args) {

        String common = "";

        int Array1 [] = {1,2,3,4,5};
        int Array2 [] = {4,5,6,7,8};

        for (int i = 0; i < Array1.length; i++) {
            for (int j = 0; j < Array1.length; j++) {
                if (Array1[i]==Array2[j])
                    common+=Array1[i] + " ";
            }

        }
        System.out.println(common);

    }
}
/*
7. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */