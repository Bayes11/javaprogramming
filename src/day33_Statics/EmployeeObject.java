package day33_Statics;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee() ;
        employee1.name = "Bayes";
        employee1.salary = 1000;

        Employee employee2 = new Employee() ;
        employee2.name = "Navid";
        employee2.salary = 2000;
        Employee employee3 = new Employee() ;
        employee3.name = "Maria";
        employee3.salary = 3000;

        System.out.println("employee1 = " + employee1.name);
        System.out.println("employee2 = " + employee2.name);
        System.out.println("employee3 = " + employee3.name);

        System.out.println("employee1 = " + employee1.salary);
        System.out.println("employee2 = " + employee2.salary);
        System.out.println("employee3 = " + employee3.salary);

        System.out.println(employee1.isHuman);
        System.out.println(employee2.isHuman);
        System.out.println(employee3.isHuman);





    }
}
