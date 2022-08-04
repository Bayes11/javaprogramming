package day31_CustomClassConstructors.Restaurant;

import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Bayes" , "Malaga", 4);

        Server server1 = new Server("Qodos", 120, 7.5, true);
        Server server2 = new Server("Kaka", 121, 8.5, false);

        Server [] servers = {server1,server2};

        restaurant1.hireServers(servers);

        System.out.println("servers = " + Arrays.toString(servers));

        Chef chef1 = new Chef("Samo" , 150,9.5,true);
        Chef chef2 = new Chef("Maria" , 170, 10.5, true);

        Chef [] chefs = {chef1,chef2};

        restaurant1.hirechefs(chefs);

        System.out.println("chefs = " + Arrays.toString(chefs));

        System.out.println("restaurant1 = " + restaurant1);


    }
}
/*
	6.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information
 */