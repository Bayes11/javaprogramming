package day27_WrapperClasses;

public class Task4 {
    public static void main(String[] args) {

        String str = "JAVA java";

        int upper = 0;
        int lower = 0;

        for (char each : str.toCharArray()) {
            if (Character.isUpperCase(each)) {
                upper++;
                continue;
            }

            if (Character.isLowerCase(each)) {
                lower++;
                continue;
            }
        }
        boolean result = false;
        if (lower==upper) {
            result = true;
        }

        System.out.println(result);
    }
}
/*
4. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true
 */