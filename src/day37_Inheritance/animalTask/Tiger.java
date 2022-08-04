package day37_Inheritance.animalTask;

import day37_Inheritance.animalTask.Animal;

public class Tiger extends Animal {
    public Tiger(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }
    
    public void roar(){
        System.out.println(name + " is roaring");
    }
}
