
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.

        Scanner reader = new Scanner(System.in);
        Competition competition = new Competition();

        UserInterface ui = new UserInterface(reader, competition);
        ui.start();

    }
}
