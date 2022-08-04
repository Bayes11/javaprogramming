package day11_switch;
/* 	3.  write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary*/
public class Browser {
    public static void main(String[] args) {

        String browserName = "kmkme";

        switch(browserName){
            case "chrome":
                System.out.println("Chrome browser selected");
                break;
            case "safari":
                System.out.println("Safari browser selected");
                break;
            case "opera":
                System.out.println("Opera browser selected");
                break;
            case "edge":
                System.out.println("Edge browser is selected");
                break;
            default:
                System.out.println("Invalid browser");




        }

    }
}
