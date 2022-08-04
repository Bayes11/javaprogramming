package day20_Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        String word[] = {"java", "java", "python", "C#", "python"};

        for (int j = 0; j < word.length; j++) {
            int freq = 0;
            String element = word[j];

            for (int i = 0; i < word.length; i++) {
                if (word[i].equals(element)){
                    freq++ ;}

            }
            if (freq == 1)
                System.out.println(element);
        }

    }
}
