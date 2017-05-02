
import java.util.Scanner;
import java.util.HashMap;

public class TextUI {

    private Scanner reader;
    private FlightList flightlist;
    private PlaneList planelist;

    public TextUI(Scanner reader, FlightList flightlist, PlaneList planelist) {
        this.reader = reader;
        this.flightlist = flightlist;
        this.planelist = planelist;
    }

    public void start() {

        airportPanel();
        flightService();

    }

    private void airportPanel() {

        System.out.println("Airport panel\n"
                + "--------------------");

        while (true) {
            System.out.println("Choose operation:\n"
                    + "[1] Add airplane\n"
                    + "[2] Add flight\n"
                    + "[x] Exit");

            String command = reader.nextLine();

            if (command.equals("1")) {
                addPlane();
            } else if (command.equals("2")) {
                addFlight();
            } else if (command.equals("x")) {
                break;
            }
        }
    }

    private void addPlane() {
        System.out.println("Give plane ID: ");
        String id = reader.nextLine();

        System.out.println("Give plane capacity: ");
        int cap = Integer.parseInt(reader.nextLine());

        Plane plane = new Plane(id, cap);
        planelist.addPlane(plane);
    }

    private void addFlight() {
        System.out.println("Give plane ID: ");
        String planeid = reader.nextLine();

        System.out.println("Give departure airport code: ");
        String dep = reader.nextLine();

        System.out.println("Give destination airport code: ");
        String dest = reader.nextLine();

        Plane plane = planelist.getPlane(planeid);
        Flight flight = new Flight(plane, dep, dest);
        flightlist.addFlight(flight);
    }

    private void flightService() {

        System.out.println("Flight service\n"
                + "------------");

        while (true) {
            System.out.println("Choose operation:\n"
                    + "[1] Print planes\n"
                    + "[2] Print flights\n"
                    + "[3] Print plane info\n"
                    + "[x] Quit");

            String command = reader.nextLine();

            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                planelist.printPlanes();
            } else if (command.equals("2")) {
                flightlist.printFlights();
            } else if (command.equals("3")) {
                printPlaneInfo();
            }

        }

    }

    private void printPlaneInfo() {
        System.out.println("Give plane ID: ");
        String planeid = reader.nextLine();

        Plane plane = planelist.getPlane(planeid);
        System.out.println(plane);
    }

}
