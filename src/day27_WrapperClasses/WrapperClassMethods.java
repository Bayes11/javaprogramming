package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "12345";
// parse method usually use to convert string to integer or double.
        int num = Integer.parseInt(str);

        System.out.println(num + 1);

        System.out.println(str + 1);


        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        // ValueOf: converts String into wrapper class.

        System.out.println("-----------------------------");

        String s2 = "123";

       Integer num1 =  Integer.valueOf(s2);

       int n1 = num1; // unboxing

        System.out.println(num1);
        System.out.println(n1);

        System.out.println("-----------------------------------------------");

        //isDigit() : it is one of the method of Character Wrapper. and returns boolean
        //isLetter() :

        char ch1 = 'A';

       boolean r2 =  Character.isDigit(ch1);

        System.out.println(r2);

       boolean r3 =  Character.isLetter(ch1);
        System.out.println(r3);

        boolean r4 =!Character.isLetterOrDigit(ch1);
        System.out.println(r4);

        // uppercase

        boolean r5 = Character.isUpperCase(ch1);
        System.out.println(r5);

        boolean r6 = Character.isLowerCase(ch1);

        System.out.println(r6);

        String s = "ab1cde2efg3hi4";

        int sum = 0;

        for (char each : s.toCharArray()) {

            if (Character.isDigit(each))
                sum+=Integer.parseInt(String.valueOf(each));

        }
        System.out.println("sum = " + sum);

    }
}
