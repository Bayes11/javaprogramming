package day35_Encapsulation;

public class SquareObject {
    public static void main(String[] args) {

        Task1_Square square1 = new Task1_Square(10);

        System.out.println(square1.calcArea());
        System.out.println(square1.calcPerimeter());

        System.out.println(square1.getSide());


    }
}
