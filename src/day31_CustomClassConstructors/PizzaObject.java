package day31_CustomClassConstructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaObject {

    public static void main(String[] args) {

        ArrayList <Pizza> pizzas = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Pizza small = new Pizza('S', 2,3);

            Pizza meduim = new Pizza('M', 3,4);

            Pizza large = new Pizza('L', 4,5);

            pizzas.addAll(Arrays.asList(small,meduim,large));

        }

        System.out.println("The total number of pizza " + pizzas.size());

        int totalPrice = 0;
        for (Pizza pizza : pizzas) {
            totalPrice += pizza.calcCost();

        }

        System.out.println("totalPrice = $" + totalPrice);




    }
}
