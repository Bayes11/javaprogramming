package day34_GarbageCollection_AccessModifiers;


import day30_CustomClass.Car;

public class GarbageCollection {
    public static void main(String[] args) {

        String str = null; // null can only set to non-primitives.
        String word = "Wooden Spoon"; // it is not eligible for Garbage.
        word = null; // now it is eligible for garbage.



    }
}