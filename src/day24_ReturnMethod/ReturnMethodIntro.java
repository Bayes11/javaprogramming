package day24_ReturnMethod;


public class ReturnMethodIntro {
    public static void main(String[] args) {
        String str = "Java";

        String reverse = reverse(str);
        System.out.println(reverse);

        if(str.equalsIgnoreCase(reverse)){
            System.out.println(str + " is palindrome");
        }
        else
            System.out.println(str + " is not palindrome");

    }

    public static String reverse(String word){

        String reverse = "";

        for(int i = word.length()-1; i>=0;i--){
            reverse+=word.charAt(i);}
        return reverse;

    }
}


