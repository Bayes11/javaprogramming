package day36_OOP_Inheritance.phone;

public class Samsung extends Phone {

    public void freeze (){
        System.out.println(brand + " is freezing");
    }
}
/*
1.3 Create a sub class of Phone named Samsung:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()
 */