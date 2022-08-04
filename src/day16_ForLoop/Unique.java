package day16_ForLoop;

public class Unique {
    public static void main(String[] args) {

        String str = "aabbcddeff";
int num1;
int num2;
String result = "";
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);


            num1= str.indexOf(ch);
            num2= str.lastIndexOf(ch);

            if (num1==num2){
                result+="" + str.charAt(i);}
        }
        System.out.println(result);
    }
}
