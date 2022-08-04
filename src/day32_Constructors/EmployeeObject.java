package day32_Constructors;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Bayes");

        System.out.println(employee1);

        Employee employee2 = new Employee("Basit", 'M');

        System.out.println(employee2);

        Employee employee3 = new Employee("Navid", 'M' , "SDET");

        System.out.println(employee3);

        Employee employee4 = new Employee("Wakil", 'M' , "QA" , 2000);

        System.out.println(employee4);
    }
}
