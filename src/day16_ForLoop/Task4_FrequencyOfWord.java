package day16_ForLoop;

public class Task4_FrequencyOfWord {
    public static void main(String[] args) {

        String sentence = "javajava java jjaava java jav java java java";

        int length = sentence.length();
        int frequency =0 ;

        for (int i =0 ; i<length-4; i++){
            if (sentence.substring(i,i+4).equalsIgnoreCase("java"))
                frequency+=1; }
        System.out.println("frequency = " + frequency);



    }
}
/*
4. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create
 */