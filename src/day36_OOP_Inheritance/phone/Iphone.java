package day36_OOP_Inheritance.phone;

public class Iphone extends Phone {

    public void faceTime(long phoneNumber){
        System.out.println(brand + " is facetiming " + phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(brand + " is faceTiming " + email);
    }


}
/*
1.2 Create a subclass of  phone named Iphone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()
 */