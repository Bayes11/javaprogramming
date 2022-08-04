package day20_Arrays;

public class Task2 {
    public static void main(String[] args) {

        String classmates []= {"Basit", "Bayes", "Navid", "Wakil"};

        String reverse = "";
        String word = "";

        for (int i = 0; i < classmates.length; i++) {
            word = classmates[i];
            reverse = "";
            for (int j = word.length()-1; j >=0; j--) {
                reverse+= "" + word.charAt(j);
            }
            System.out.println(reverse);

        }
    }
}
/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */