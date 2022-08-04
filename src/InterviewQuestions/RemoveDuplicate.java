package InterviewQuestions;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String word = "AAAABBBBCCDDDFFD";
String result  = "";
char ch ;

        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            if (!result.contains("" + ch)){

            result+=ch;}


        }
        System.out.println(result);

    }
}
