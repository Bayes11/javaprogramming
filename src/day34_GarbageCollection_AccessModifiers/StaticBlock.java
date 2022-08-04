package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {
    public static void main(String[] args) {

        System.out.println("Main Method");
    }

    static { // first to Run, and only run once.
        System.out.println("Static Block");
    }


}
