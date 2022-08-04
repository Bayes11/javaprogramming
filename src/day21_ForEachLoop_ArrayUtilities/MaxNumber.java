package day21_ForEachLoop_ArrayUtilities;

public class MaxNumber {
    public static void main(String[] args) {

        int [] Array = {1,2,3,5,4,7,8,95,4,} ;
        int max= Array[0];

        for(int each: Array){
            if(each>max)
                max = each;




        }
        System.out.println(max);
    }
}
