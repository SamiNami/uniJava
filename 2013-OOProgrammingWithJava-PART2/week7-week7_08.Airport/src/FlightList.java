
import java.util.ArrayList;

public class FlightList {

    private ArrayList<Flight> flightlist;

    public FlightList() {
        this.flightlist = new ArrayList<Flight>();
    }

    public void addFlight(Flight flight) {
        flightlist.add(flight);
    }

    public void printFlights() {
        for (Flight flight : flightlist) {
            System.out.println(flight.printFlight());
        }
    }

}
