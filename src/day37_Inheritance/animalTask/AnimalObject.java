package day37_Inheritance.animalTask;


public class AnimalObject {

    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky", "White", "small", 'M', 3 );

        System.out.println(dog);
        dog.bark();


        Cat cat = new Cat("Tarcin", "British", "White", "Smaill", 'F', 4);

        System.out.println(cat);

        cat.scratch();

    }
}
