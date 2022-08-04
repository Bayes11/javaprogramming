package day32_Constructors;

public class Test{

    public Test(){
        System.out.println("a");
    }

    public Test(int a){
        this();
        System.out.println("b");
    }
    public Test(double b){
        this();
    }
}
