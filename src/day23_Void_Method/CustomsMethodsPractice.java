package day23_Void_Method;

public class CustomsMethodsPractice {
    public static void main(String[] args) {

        HelloWorld();
        HelloCydeo();
        EvenNumbers();

    }

    public static void HelloWorld() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");

        }

    }

    public static void HelloCydeo(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");

        }



    }


    public static void EvenNumbers(){

        for (int i = 1; i <11 ; i++) {
            if (i%2==0)
                System.out.print(i + " ");

        }

    }
}


