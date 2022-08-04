package day08_Single_If_statement;

public class Cigarettes {
    public static void main(String[] args) {
        byte age = 18;

        boolean eligible = (age >= 18);

        System.out.println("eligible = " + eligible);

        if (age >= 18){
            System.out.println("The person is eligible to buy cigarette!");

        }
        else if (age < 18){
            System.out.println("The person is not eligible to buy the cigarette!");
        }
    }


}
