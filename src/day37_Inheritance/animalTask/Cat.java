package day37_Inheritance.animalTask;

public class Cat extends Animal {


    public Cat(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }

    public void scratch(){
        System.out.println(name + " is scratching.");
    }
}
