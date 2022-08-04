package day37_Inheritance.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam  {
    public ProductOwner PO;
    public BusinessAnalyst BA;
    public  ScrumMaster SM;

    public ArrayList<Tester> testers = new ArrayList<>();

    public ArrayList<Developer> developers = new ArrayList<>();

    public ScrumTeam(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTester(Tester tester) {
        testers.add(tester);
    }

    public void addTesters(Tester[] tester) {
        testers.addAll(Arrays.asList(tester));
    }

    public void removeTester(int ID) {
        testers.removeIf(p -> p.ID == ID);

    }

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void addDevelopers(Developer[] developer) {
        developers.addAll(Arrays.asList(developer));
    }

    public void removeDeveloper(int ID) {
        developers.removeIf(p -> p.ID == ID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", testers=" + testers +
                ", developers=" + developers +
                ", number of testers=" + testers.size() +
                ", number of developers=" + developers.size() +
                '}';
    }
}
/*
Creat a class named ScrumTeam:
            Variables:
                PO (ProductOwner), BA (BusinessAnalyst), SM (ScrumMaster),
                testers (ArrayList<Testers>),  developers (ArrayList<Developers>)
            Methods:
                addTester(Tester tester): adds the given tester to testers arraylist
                ddTesters(Tester[] testers): adds the given testers to testers arraylist
                removeTester(int id): removes the tester with the given id from the arraylist of tester
                addDeveloper(Developer developer): adds the given developer to testers arraylist
                addDeveloper(Developer[] developer): adds the given developers to testers arraylist
                removeDeveloper(int id): removes the developer with the given id from the arraylist of developer
                toString(): displays the BA' name, SM' name, PO' name, number of testers and number of developers
 */