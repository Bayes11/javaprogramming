package day35_Encapsulation;

public class CyberTekStudents {

    public String name, fieldOfStudy, batchNumber;
    public char gender;
    public int age, groupNumber;
    public static String secretCode;

    public static String schoolName;
    public static String programmingLanguage;




    public CyberTekStudents(String name, String fieldOfStudy, String programmingLanguage, String batchNumber, char gender, int age, int groupNumber) {
        this.name = name;
        this.fieldOfStudy = fieldOfStudy;
        this.batchNumber = batchNumber;
        this.gender = gender;
        this.age = age;
        this.groupNumber = groupNumber;
    }

    static {

        schoolName = "Cydeo";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";
    }

    public static void schoolName(){
        System.out.println(schoolName);
    }

    public static void ProgrammingLanguage(){
        System.out.println(programmingLanguage);
    }

    public void attendClass(){
        System.out.println(name + " is attending the class");

    }

    public void study(){
        System.out.println(name + " is studying at " + batchNumber + " " + fieldOfStudy + " " + groupNumber + " " + schoolName);
    }

    public String toString() {
        return "CyberTekStudents{" +
                "name='" + name + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", batchNumber='" + batchNumber + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
