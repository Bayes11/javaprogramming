package day24_ReturnMethod;

public class ReturnMethodPractice {
    public static void main(String[] args) {

       int maxNumber=  max(100,200);

        System.out.println(maxNumber*2);

    }

    public static int max(int x , int y ){
        int max = 0;

        if(x>y)
            max=x;
        else if (y>x)
            max=y;

        return max;

    }



}
// find the max number between 100 and 200
// multiply the max number to 2