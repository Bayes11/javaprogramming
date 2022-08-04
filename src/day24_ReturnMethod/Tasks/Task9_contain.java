package day24_ReturnMethod.Tasks;

public class Task9_contain {
    public static void main(String[] args) {
        boolean result = contain(new int[]{1,2,3,4,5}, 5);

        System.out.println(result);
    }
    public static boolean contain (int [] array , int element){
boolean isContain = false;
        for (int each : array) {
            if(each==element)
                isContain=true;
        }
        return isContain;

    }
}
/*
	9. Create a method named contains that passes one integer array and one integer parameters, the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false

 */