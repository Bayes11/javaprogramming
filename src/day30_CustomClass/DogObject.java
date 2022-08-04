package day30_CustomClass;

import java.util.ArrayList;

public class DogObject {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "small";
        dog1.color = "white";

        System.out.println("dog1 = " + dog1);

        Dog dog2 = new Dog();

        dog2.name = "Alex";
        dog2.breed = "Husky";
        dog2.age = 2;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color  = "White & Black";

        System.out.println("dog2 = " + dog2);

        Dog dog3 = new Dog();

        dog3.setInfo("Jack", "GermanvShepherd" , 2, 'M', "Large", "Black");

        System.out.println("dog3 = " + dog3);

        dog1.eat();

        dog2.bark();

        System.out.println("--------------------------------------------------");

        Dog [] array = {dog1, dog2, dog3};

        ArrayList <Dog> femaleDogs = new ArrayList<>();
        ArrayList <Dog> maleDogs = new ArrayList<>();

        int male = 0;
        int female = 0;


        for (Dog each : array) {
            if (each.gender == 'M') {
                maleDogs.add(each);
                male++;
            }
            else {
                femaleDogs.add(each);
                female++;
            }
        }

        System.out.println("maleDogs = " + maleDogs);
        System.out.println("femaleDogs = " + femaleDogs);

        System.out.println("female = " + female);
        System.out.println("male = " + male);

    }

    }


