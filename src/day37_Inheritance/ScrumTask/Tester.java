package day37_Inheritance.ScrumTask;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, String jobTitle, int salary, int ID) {
        super(name, age, gender, jobTitle, "Amazon", salary, ID);
    }

    public void createTicket(){
        System.out.println(jobTitle + " " + name + " is creating ticket");
    }
}
