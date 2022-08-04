package day31_CustomClassConstructors;

public class StudentObject {
    public static void main(String[] args) {
        
        Student student1 = new Student("Bayes", 20,20221,'M','A');

        System.out.println("student1 = " + student1);

        Student student2 = new Student("ali", 15,19999,'M','B');
        System.out.println("student2 = " + student2);
    }
}
