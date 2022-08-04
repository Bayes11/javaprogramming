package InterviewQuestions;

public class StrongPassword {
    public static void main(String[] args) {

        String str = "University1!";

        boolean b = str.length() >= 8 && !str.contains(" ");
        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = false;
        boolean b4 = false;

        for (char each : str.toCharArray()) {
            if (Character.isUpperCase(each))
                b1 = true;
            else if (Character.isLowerCase(each))
                 b2 = true;
            else if (!Character.isLetterOrDigit(each))
                 b3 = true;
            else if (Character.isDigit(each))
                b4 = true;

        }
        if (b && b1 && b2 && b3 && b4)
            System.out.println("Strong Password!");
        else
            System.out.println("Weak Password!");

    }
}

