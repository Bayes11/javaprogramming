package day35_Encapsulation;

public class CredentialsObject {
    public static void main(String[] args) {

        Credentials credentials1 = new Credentials("Bayes11usmany@gmail.com", "Bayes12345!!");

        boolean result = credentials1.isStrongPassWord(credentials1.getPassword());

        System.out.println("IsStrongPassWord = " + result);

        credentials1.setPassword("Spain1243%");

        System.out.println(credentials1.getPassword());

        System.out.println("IsStrong Password = " + result);


    }
}
