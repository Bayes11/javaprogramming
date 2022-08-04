package day24_ReturnMethod.Tasks;

public class Task4_isPalindrome {
    public static void main(String[] args) {
    String reverse = reverse("Level");
        System.out.println(reverse);

    boolean isPalindrome = isPalindrome("Level", reverse);
        System.out.println(isPalindrome);


}
    public static String reverse(String word){
        String reverse = "" ;

        for (int i = word.length()-1; i >=0 ; i--) {
            reverse+= "" + word.charAt(i);

        }
        return reverse;
    }

    public static boolean isPalindrome(String word , String reverse){
        boolean isPalindrome = false;
        if (word.equalsIgnoreCase(reverse))
            isPalindrome = true;
        else
            isPalindrome = false;

        return isPalindrome;
    }
}
