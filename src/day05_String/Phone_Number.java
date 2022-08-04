package day05_String;
/*
1. create a class named Phone Number and declare the following variables:
            countryCode, areaCode, localNumber

            use string concatenation to display the phone number

            ex:
                if  countryCode = 1
                    areaCode = 703
                    localNumber = 4512625

                output:
                    +1(703)-4512625
 */
public class Phone_Number {

    public static void main(String[] args) {

        String countryCode = "34";
        String areacode = "643";
        String localNumber = "065713";

        System.out.println("Phone number: +" + countryCode + areacode + localNumber);

    }
}
