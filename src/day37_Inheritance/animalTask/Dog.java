package day37_Inheritance.animalTask;

public class Dog extends Animal{

    public Dog(String name, String breed, String color, String size, char gender, int age){
        super(name, breed, color, size, gender, age);

    }

    public void bark(){

        System.out.println(name + " is barking");
    }

}
