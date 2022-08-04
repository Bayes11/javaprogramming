package day35_Encapsulation;

public class Credentials {
    private String username , password;

    public boolean isStrongPassWord(String password){

        boolean isStrongPassWord = false;
        boolean containLetter = false;
        boolean containDigit = false;
        boolean containSpecial = false;
        boolean length = false;

        if (password.length() >= 8 && !password.contains(" "))
            length = true;
        char [] ch = password.toCharArray();

        for (char each : ch) {
            Character c = each;

            if (Character.isLetter(c)) {
                containLetter = true;
                continue;
            }
            if (Character.isDigit(c)) {
                containDigit = true;
                continue;
            }
            if (!Character.isLetterOrDigit(c))
                containSpecial = true;
            continue;
        }

        if (containDigit && containLetter && containSpecial && length)
            isStrongPassWord = true;

        return isStrongPassWord;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
/*
2. create a class named Credentials
            Variables:
                username, password

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                getPassword(): reads the password
                getUsername(): reads the username
                setUsername(): sets the username
                setPassword(): sets a new password
                                    the new password MUST be a strong password

                toString():

            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

 */