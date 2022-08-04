package day15_ForLoop;

public class Task2 {
    public static void main(String[] args) {
        int num = 1, sum =0;

        for(num=1; num<=100;num+=2)
            sum=sum+num;
        System.out.println("sum = " + sum);

    }
}
