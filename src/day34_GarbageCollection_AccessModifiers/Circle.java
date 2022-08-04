package day34_GarbageCollection_AccessModifiers;


import java.util.ArrayList;

public class Circle {

    // it is not beneficial to initialize static variable in constructors.

    public double radius;
    public static double pi;

    public static String name;

    public static ArrayList<Integer> numbers = new ArrayList<>();

    public Circle(double radius){

        this.radius = radius;
       // pi = 3.14;
    }

    // we should use static block to set the statics.
    static {
        pi = 3.14;
        name = "Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

    }
}
