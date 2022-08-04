package day36_OOP_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.setInfo("Max", "Husky", "White", "Small", 'M', 2 );

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();


        System.out.println(dog);

        Cat cat = new Cat();

        cat.setInfo("Tarcin", "British", "White", "Smaill", 'F', 4);

        cat.eat();
        cat.sleep();
        cat.scratch();
        cat.move();
        cat.drink();

        System.out.println(cat);


        Tiger tiger = new Tiger();
        tiger.setInfo("Sher", "Bengal", "Black","large", 'M',4);
        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.roar();
        tiger.move();
        tiger.hunt();

        System.out.println(tiger);
    }
}
