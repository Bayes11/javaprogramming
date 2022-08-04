package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setInfo("BMW", "Series5", "Black", 2022, 50000);

        System.out.println(car1);

        Car car2 = new Car();

        car2.setInfo("Audi", "X5", "White", 2020,25000);
        System.out.println(car2);

        Car car3 = new Car();

        car3.setInfo("Benz", "C" , "Red", 2018, 30000);
        System.out.println(car3);

        car1.start();
        car2.stop();
        car3.drive();


        //Car [] cars = { car1, car2, car3};

        ArrayList <Car> carList = new ArrayList<>();

        carList.addAll(Arrays.asList(car1,car2,car3));

        for (Car each : carList) {
            System.out.println(each.brand + " " + each.price);

        }

        System.out.println("======================================");

        /*
        recall:

           BMW: 2005 - 2008
           Audi: 1995-1997
         */

        carList.removeIf(p->p.brand.equals("BMW") && p.year >= 2005 && p.year <=2008);
        carList.removeIf(p->p.brand.equals("Audi") && p.year >= 1995 && p.year <=1997);




    }


}
