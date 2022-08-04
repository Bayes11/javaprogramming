package day17_DoWhile_WhileLoop;

public class BranchStatement_Continue {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {

            if (i%2==1)
                continue;
            System.out.println(i);

        }
    }
}
