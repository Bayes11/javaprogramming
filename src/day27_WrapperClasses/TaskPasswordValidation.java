package day27_WrapperClasses;

public class TaskPasswordValidation {
    public static void main(String[] args) {

        String str = "University1!  ";

        int length = str.trim().length();
        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = false;
        boolean b4 = false;

        for (char each : str.toCharArray()) {
            b1 = Character.isUpperCase(each);
            if (b1)
                break;
        }
        for (char each : str.toCharArray()) {
            b1 = Character.isUpperCase(each);
            if (b1)
                break;
        }
        for (char each : str.toCharArray()) {
            b2 = Character.isLowerCase(each);
            if (b2)
                break;
        }
        for (char each : str.toCharArray()) {
            b3 = !Character.isLetterOrDigit(each);
            if (b3)
                break;
        }
        for (char each : str.toCharArray()) {
            b4 = Character.isDigit(each);
            if (b4)
                break;
        }
        if (b1 && b2 && b3 && b4 && length>=8)
            System.out.println("Strong Password!");
        else
            System.out.println("Weak Password!");
        System.out.println(length);

    }
}
/*
PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit


 */