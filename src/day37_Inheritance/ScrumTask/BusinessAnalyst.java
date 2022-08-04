package day37_Inheritance.ScrumTask;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, int age, char gender, String jobTitle, int salary, int ID) {
        super(name, age, gender, jobTitle, "Amazon", salary, ID);
    }

    public void analyze(){
        System.out.println(name+ " is analyzing the documents");
    }
}
