package day37_Inheritance.ScrumTask;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, int age, char gender, String jobTitle, int salary, int ID) {
        super(name, age, gender, jobTitle, "Amazon", salary, ID);
    }
}
