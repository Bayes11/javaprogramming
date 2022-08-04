package day24_ReturnMethod;

public class ReturnStatement {
    public static void main(String[] args) {

        nameOfDay(7);
    }

    public static void nameOfDay(int number){


        if (number<1 || number > 7){
            System.out.println("Invalid number!");
            return; // exists nameOfDAy method
        }

        if (number==1)
            System.out.println("Monday");
        if (number==2)
            System.out.println("Tuesday");
        if (number==3)
            System.out.println("Wednesday");
        if (number==4)
            System.out.println("Thursday");
        if (number==5)
            System.out.println("Friday");
        if (number==6)
            System.out.println("Saturday");
        if (number==7)
            System.out.println("Sunday");


    }
}
