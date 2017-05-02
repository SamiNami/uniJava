
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PlaneList planelist = new PlaneList();
        FlightList flightlist = new FlightList();

        TextUI ui = new TextUI(reader, flightlist, planelist);
        ui.start();

        /*
        Plane plane = new Plane("HA-LOL",42);
        System.out.println(plane);
        Flight flight = new Flight(plane,"HEL","VAN");
        System.out.println(flight.printFlight());
        
        PlaneList planelist = new PlaneList();
        planelist.addPlane(plane);
        planelist.printPlanes();
        
        planelist.printOnePlane("HA-LOL");
        
        FlightList flightlist = new FlightList();
        flightlist.addFlight(flight);
        flightlist.printFlights();
         */
    }
}
