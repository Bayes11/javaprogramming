package day36_OOP_Inheritance.encapsulation;

import day36_OOP_Inheritance.encapsulation.Student;

public class StudentObject {
    public static void main(String[] args) {

        Student student1 = new Student("Bayes", 100, 'D', 'R', "Cydeo");

        System.out.println(student1);

        student1.setAge(20);

        System.out.println(student1);


    }
}
