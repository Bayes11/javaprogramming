package day35_Encapsulation.encapsulation;

public class PersonObject {
    public static void main(String[] args) {

        Person person1 = new Person();

       // person1.name = "Bayes";
       // person1.age = 20;

        person1.setName("Daniel");
        person1.setAge(20);

        System.out.println(person1.getName() + " : " + person1.getAge());

    }
}
// we have the control of the data with the private variables. we can put restrictions in set method.