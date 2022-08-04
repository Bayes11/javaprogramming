package day31_CustomClassConstructors;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", totalPrice= $" + calcCost() +
                 '}';
    }

    public double calcCost(){
        double totalCost = 0;
        double price = 0;

        if (size == 'S')
            price = 10;
        else if (size == 'M')
            price = 12;
        else
            price = 14;

        totalCost = price + numberOfCheeseTopping *2 + numberOfPepperoniTopping *2 ;

        return totalCost;

    }




}


/*
Pizza Task:
    	Attributes:
    		size, numberOfCheeseTopping, numberOfPepperoniTopping
    		Add a constructor that can set all the fields
		Actions:
			calcCost(): returns the totalCost of the pizza
			toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */