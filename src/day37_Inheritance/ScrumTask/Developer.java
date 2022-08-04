package day37_Inheritance.ScrumTask;

public class Developer extends Employee{


    public Developer(String name, int age, char gender, String jobTitle, int salary, int ID) {
        super(name, age, gender, jobTitle, "Amazon", salary, ID);
    }

    public void fixBugs(){
        System.out.println(jobTitle + " " + name + " is crying");
    }
}
