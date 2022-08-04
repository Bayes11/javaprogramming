package day05_String;

import org.w3c.dom.ls.LSOutput;

/*
2.create a class named FlightTicket, and declare the following variables:
                1. from
                2. to
                3. ticketPrice

    use concatenation to display the full info of the ticket

    ex:
            From Las Vegas to McLean is $425.5
 */
public class FlightTicket {
    public static void main(String[] args) {
        String from = "Madrid";
        String to = "Barcelona";
        double ticketPrice = 50;
        System.out.println("From " + from + " To " + to + " is $" + ticketPrice);

    }



}
