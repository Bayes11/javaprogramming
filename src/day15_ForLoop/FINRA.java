package day15_ForLoop;

public class FINRA {
    public static void main(String[] args) {

        for (int i =1 ; i<=100; i++){

            if (i % 3 == 0 && i % 5 ==0 )
                System.out.print("FINRA ");
            else if (i % 3 == 0)
                System.out.print("FIN ");
            else if (i % 5 == 0)
                System.out.print("RA ");
            else
                System.out.print(i + " ");
        }


    }
}
/*
2. Write a method which prints oUt the numbers from to 100 but for numbers
which are o multiple of both 3 and 5, print "FINRA" instead of the number,
for numbers which are multiple of 3, print "FIN" instead of the number and for numbers
which are a multiple of 5, print "RA" instead of the number.
EX
1 2 FTN4 RA FTN 7 8 FTN RA 11 FTN 13 14 FINRA 16 17 FIN
 */