package day15_ForLoop;

public class Task1 {
    public static void main(String[] args) {
        int num = 0, sum =0;

        for(num=0; num<=100;num+=2)
            sum=sum+num;
        System.out.println("sum = " + sum);

    }
}
