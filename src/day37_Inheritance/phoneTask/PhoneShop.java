package day37_Inheritance.phoneTask;




public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 13", "Meduim", "Blue", 900);

        Samsung samsung = new Samsung("S13", "Large", "White", 700);

        Nokia nokia = new Nokia("N43" , "Small", "black", 500);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.faceTime("bayes11usmany@gmail.com");
    }
}
