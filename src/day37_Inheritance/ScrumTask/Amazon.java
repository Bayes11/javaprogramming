package day37_Inheritance.ScrumTask;

public class Amazon {
    public static void main(String[] args) {
        String company = "Amazon Inc";

        ProductOwner PO = new ProductOwner("Bayes", 20,'M', "Project Owner", 200000, 1817);

        BusinessAnalyst BA = new BusinessAnalyst("Cihad", 30, 'M', "BA", 150000, 151);

        ScrumMaster SM = new ScrumMaster("Anel", 26, 'F', "SM", 145000, 160);



        Tester tester1=new Tester("Chinara",32,'F',"QA",1500000,120);

        Tester tester2=new Tester("Yasaman",31,'F', "QE",130000,1419);

        Tester tester3=new Tester("Irena",29,'F',"SDET",140000,1417);

        Tester tester4=new Tester("Cihad",26,'M',"QA",1250000,1415);
        Tester[] testers={tester1,tester2,tester3,tester4};


        Developer developer1=new Developer("Max", 40, 'M', "Senior Java Developer", 180000, 3454);
        Developer developer2=new Developer("Allison", 18, 'F', "Junior Java Developer", 200000, 364);
        Developer developer3=new Developer("Tom", 26, 'M', "Java Developer", 140000,3654 );
        Developer developer4=new Developer("Manas", 40, 'M', "Full Stack Developer", 280000,2654 );
        Developer developer5=new Developer("Evelyn", 30, 'F', "JS Developer", 350000, 788);
        Developer[] developers={developer1,developer2,developer3,developer4,developer5};

        ScrumTeam scrumTeam = new ScrumTeam(PO, BA , SM);

        scrumTeam.addDevelopers(developers);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);

        System.out.println("------------------------------------------------");

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name +" : "+tester.salary);
        }

        System.out.println("------------------------------------------------");

        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer.name+" : "+developer.salary);
        }





    }

}
