package day35_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {

        ArrayList <Candy> candies = new ArrayList<>();

        Candy candy1 = new Candy("Lollipop",10,2.5,false);
        Candy candy2 = new Candy("HelloPop",20,5.5,true);
        Candy candy3 = new Candy("HolaPop",50,3.5,true);
        Candy candy4 = new Candy("KakaPop",100,1.5,false);
        Candy candy5 = new Candy("LalaPop",200,3.5,true);


        candies.addAll(Arrays.asList(candy1,candy2,candy3,candy4,candy5));

        for (Candy candy : candies) {
            System.out.println(candy.getBrand() + " " + candy.getPrice());
        }
    }
}
/*
  1.2 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy
 */