package day24_ReturnMethod;

public class WarmUpTasks {
    public static void main(String[] args) {

        initials("Bayes", "Usmany");
        domainOfEmail("Bayes11usmany@gmail.com");
        nameOfMonth(10);
        daysOfmonths("october");



    }

    public static void initials(String firstName, String lastName){
        System.out.println( "" + firstName.charAt(0) + "." +  lastName.charAt(0));

    }

    public static void domainOfEmail(String email){

        System.out.println(email.substring(email.indexOf('@') +1, email.indexOf('.')));

    }

    public static void nameOfMonth(int number){
        if (number==10)
            System.out.println("October");

    }

    public static void daysOfmonths(String month){
        if (month.equalsIgnoreCase("october"))
            System.out.println("October has 31 days." );


    }
}
