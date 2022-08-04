package day04_Variables;

/*


	3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
			PI, radius, diameter, area, perimeter

					Hints: 	PI = 3.14
							area = radius * radius * PI
							Perimeter = 2 * radius * PI

 */
public class AreaOfCircle {
    //Task 3
    public static void main(String[] args) {

        double PI = 3.14;
        int R = 5;
        double Area = PI * R*R;
        double perimeter = 2 * PI * R;
        System.out.println("The Area of the circle is "+ Area + " and the perimeter is "+ perimeter);

    }


}


