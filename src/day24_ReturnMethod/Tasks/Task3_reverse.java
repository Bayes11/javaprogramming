package day24_ReturnMethod.Tasks;

public class Task3_reverse {
    public static void main(String[] args) {


        String result = reverse("Bayes");
        System.out.println(result);

    }
    public static String reverse(String word){
        String reverse = "" ;

        for (int i = word.length()-1; i >=0 ; i--) {
            reverse+= "" + word.charAt(i);

        }
        return reverse;
    }

}
/*
3. create a method named reverse that passes one string parameter, the method can return the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ

 */