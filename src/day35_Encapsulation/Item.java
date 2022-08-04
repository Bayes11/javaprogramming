package day35_Encapsulation;


import utilities.StringUtility;

public class Item {

    private String name;
    private int unitPrice;
    private int quantity;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name.isEmpty())
            return;

        char [] array = name.toCharArray();

        for (char each : array) {
            Character ch = each;

            if (!Character.isLetterOrDigit(ch))
                return;

        }

        if (!Character.isLetter(name.charAt(0)))
            return;

this.name = name;

    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        if (unitPrice < 0)
            return;
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity<0)
            return;
        this.quantity = quantity;
    }

    public Item(String name, int unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public double calcCost(){
        double totalCost = unitPrice * quantity;
        return totalCost;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total cost =" + calcCost() +
                '}';
    }
}
/*
4.1create a class called Item
	            private variables:
	            	name, unitPrice, quantity

            	Encapsulate all the fields:
            		Conditions:
            			name can not be empty or blank
            			name can not contain any special characters other than space
            			name must start with letters
            			unit price can not be negative
            			quantity can not be negative
            			if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1


            Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()

 */