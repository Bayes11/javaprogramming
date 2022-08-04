package day21_ForEachLoop_ArrayUtilities;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        String [] words = {"java programming", "cydeo school", "wooden spoon", "early birds", "angry birds"};

        String letters = "";
        for (String each : words) {
            letters = "" + each.charAt(0) + each.charAt(each.length()-1);
            System.out.println(letters);

        }
        System.out.println("----------------------------------------");

        String [] names = {"bayes", "basit", "navid", "wakil","bayes","bayes", "basit","navid"};


        for (String each : names) {
            int freq = 0;
            for (String name : names) {
                if (name.equals(each))
                    freq++;

            }
            if (freq==1)
                System.out.println(each);
        }

    }
}
