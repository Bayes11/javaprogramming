package day36_OOP_Inheritance.phone;

public class phoneObject {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.setInfo("Iphone", "13 pro max" , "Meduim", "Azul", 1000);
        iphone.call(643065713);
        iphone.faceTime("bayes11usmany");
        iphone.faceTime(643065713);
        System.out.println(iphone);

        Samsung samsung = new Samsung();
        samsung.setInfo("Samsung", "S20", "Large", "Black", 700);
        samsung.freeze();
        System.out.println(samsung);

        Nokia nokia = new Nokia();
        nokia.setInfo("Nokia", "N144", "Small", "White", 500);
        nokia.selfDefence();

        System.out.println(nokia);
    }
}

/*
		1.5 Create a class named Phone Objects and test of the sub class' objects

 */