package day37_Inheritance.ScrumTask;

public class Employee extends Person{

    public String jobTitle, companyName;
    public int salary, ID;

    public Employee(String name, int age, char gender, String jobTitle, String companyName, int salary, int ID) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.ID = ID;
    }

    public void word(){
        System.out.println(name + " is working");
    }

    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", ID=" + ID +
                '}';
    }
}
/*
name, gender, age, jobTitle, id, salary, companyName
 work(), toString()
 */