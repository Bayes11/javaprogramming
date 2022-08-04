package day31_CustomClassConstructors.scrumTask;

import day26_CustomsMethodPractice.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MyscrumTeam {
    public static void main(String[] args) {

        // 4 testers objects
        Tester tester1 = new Tester("bayes", "SDEt", 8896172, 120000);
        Tester tester2 = new Tester("basit", "SDET", 8896179, 150000);
        Tester tester3 = new Tester("navid", "SDET", 885522, 120000);
        Tester tester4 = new Tester("wakil", "SDET", 885522, 10000);

        Tester [] testers = {tester1,tester2,tester3,tester4};

        // 5 developers object

        Developer developer1 = new Developer("Layan", "Java developer", 1, 150000);
        Developer developer2 = new Developer("Olga", "Java developer", 2, 160000);
        Developer developer3 = new Developer("Qodos", "Java developer", 3, 170000);
        Developer developer4 = new Developer("Lola", "Java developer", 4, 180000);
        Developer developer5 = new Developer("Kaka", "Java developer", 5, 190000);

        Developer []developers = {developer1,developer2,developer3,developer4,developer5};

        ScrumTeam scrum = new ScrumTeam("Smith", "Nigara", "Wille", 14);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        System.out.println("--------------------------------------------------");

        for (Tester tester : scrum.testersList) {
            System.out.println(tester.name + " " + tester.salary);

        }
        System.out.println("---------------------------");
        for (Developer developer : scrum.developersList) {
            System.out.println(developer.name + " " + developer.salary);

        }
        System.out.println("---------------------------");


        scrum.removeDeveloper(1);
        scrum.removeDeveloper(2);
        scrum.removeTester(8896172);
        scrum.removeTester(8896179);

        for (Tester tester : scrum.testersList) {
            System.out.println(tester.name + " " + tester.salary);

        }
        System.out.println("---------------------------");
        for (Developer developer : scrum.developersList) {
            System.out.println(developer.name + " " + developer.salary);

        }

        System.out.println("scrum = " + scrum);

    }
}
/*
create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */