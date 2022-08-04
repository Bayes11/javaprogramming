package day10_NestedIf_Ternaries;
import java.util.*;

public class BiggerNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

      String result =   (n1>n2 && n1>n3)? "n1 is bigger" :(n2>n1 && n2>n3)? "n2 is bigger" : "n3 is bigger";

        System.out.println( result);
    }
}
