package day37_Inheritance.phoneTask;

public class Nokia extends Phone {
    public Nokia( String model, String size, String color, double price) {
        super("Nokia", model, size, color, price);
    }

        public void selfDefence(){
            System.out.println("you can use " + brand + " as a self defence");
        }


}
