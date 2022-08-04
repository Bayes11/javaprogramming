package day24_ReturnMethod.Tasks;

public class Task1_frequencyOfWord {
    public static void main(String[] args) {

        frequencyOfWord("Java java java python python", "java");

        int freq = frequencyOfWord("Java java java python python", "java");

        System.out.println("freq = " + freq);
    }

    public static int frequencyOfWord(String sentence , String word){

        int freq = 0;

        sentence = sentence.toLowerCase();

        while(sentence.contains(word)){
            freq++;
            sentence = sentence.replaceFirst(word,"");
        }
        return freq;


    }
}
/*
1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3

 */