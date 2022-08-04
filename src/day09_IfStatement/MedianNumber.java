package day09_IfStatement;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 20,
                b = 50,
                c = 10;


        if ((a > b && a < c) || (a>c && a<b) )
            System.out.println(a + " is the median number");
        else if ((b > a && b < c) || (b<a && b>c))
            System.out.println(b + " is the median number");
        else if ((c > a && c < b) || (c<a && c>b))
            System.out.println(c + " is the median number");


    }
}
