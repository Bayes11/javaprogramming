package day30_CustomClass;

import java.util.ArrayList;

public class StudentObject {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.setInfo("Aygun", 'F', 20,2210,'A');

        System.out.println(student1);

        Student student2 = new Student();

        student2.setInfo("Bayes", 'M', 20,1197,'B');

        Student student3 = new Student();

        student3.setInfo("Basit" , 'M', 27, 1200, 'A');

        Student student4 = new Student();

        student4.setInfo("elena", 'F',29,1300,'C');

        Student student5 = new Student();

        student5.setInfo("julia", 'F', 25,1400,'D');


        Student [] students = {student1,student2,student3,student4,student5};

        for (Student each : students) {
            System.out.println(each);

        }

        System.out.println("---------------------------------------------------");

        ArrayList <Student> earlyBird = new ArrayList<>(); // grade = 'A'
        ArrayList <Student> angryBird = new ArrayList<>();

        for (Student student : students) {
            if (student.grade == 'A')
                earlyBird.add(student);
            else
                angryBird.add(student);

        }

        System.out.println("angryBird = " + angryBird);
        System.out.println("earlyBird = " + earlyBird);





    }
}
