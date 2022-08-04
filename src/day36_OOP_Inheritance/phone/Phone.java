package day36_OOP_Inheritance.phone;

public class Phone {

    public String brand, model, size, color;

    public int prize;

    public void setInfo(String brand, String model, String size, String color, int prize) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.prize = prize;
    }

    public void call(long phoneNumber){
        System.out.println(brand + " is calling " + phoneNumber);

    }

    public void text(long phoneNumber){
        System.out.println(brand + " is texting " + phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", prize=" + prize +
                '}';
    }
}
/*
1. Phone Task:
		1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					toString()


 */