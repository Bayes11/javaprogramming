package day35_Encapsulation.encapsulation;

public class Employee {

    private String name;
    private char gender;
    private int age;
    private int salary;

    public Employee(String name, char gender, int age, int salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
    public int getSalary(){
        return salary;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            System.err.println("Invalid name");
            return;
        }

        this.name = name;
    }

    public void setGender(char gender) {

        if (gender != 'M' && gender != 'F'){
            System.err.println("Invalid Gender");
            return;

        }
        this.gender = gender;
    }

    public void setAge(int age) {
        if (age < 16 && age >90){
            return;
        }
        this.age = age;
    }

    public void setSalary(int salary) {
        if (salary <=0)
            return;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
/*
1. Create an employee Class:
private variables:
       name, gender, age, salary

       Encapsulate all the private fields

       1. Name can not be empty
       2. gender can not anything other than female or male
       3. age can not be less than 16, and greater than 90
       4. salary can not be zero or negative
 */