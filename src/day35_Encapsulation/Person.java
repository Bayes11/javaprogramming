package day35_Encapsulation;

public class Person {

    public String name, language;
    public int age;
    public char gender;
    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHeads;

    public Person(String name, String language, int age) {
        this.name = name;
        this.language = language;
        this.age = age;
    }

    static {

        planet = "earth";
        isHuman = true;
        hasNose = true;
        numberOfHeads = 1;
        numberOfWings = 0;

    }

    public static void printPlanetName(){
        System.out.println("planet name is " + planet );
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }
    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
