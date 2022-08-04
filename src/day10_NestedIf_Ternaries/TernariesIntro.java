package day10_NestedIf_Ternaries;

public class TernariesIntro {
    public static void main(String[] args) {

        int n = 100;

        if (n%2==0)
            System.out.println("even");
        else
            System.out.println("odd");


        System.out.println("---------------------");

        String result = (n%2==0)? "even" : "odd" ;

        System.out.println(result);
    }
}
