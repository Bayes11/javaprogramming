package day27_WrapperClasses;

public class Retrieve {
    public static void main(String[] args) {

        String str = "Wooden Spoon!$123";

        String letters = "";
        String digits = "";
        String specialChars = "";
        for (char each : str.toCharArray()) {
            if (Character.isLetter(each)){
            letters+=each;
            continue;
        }
        if (Character.isDigit(each)){
        digits+=each;
        continue;}

        if (!Character.isLetterOrDigit(each)){
        specialChars+=each;
        continue;}


        }

        System.out.println("specialChars = " + specialChars);
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);



    }
}
/*
    3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";
 */