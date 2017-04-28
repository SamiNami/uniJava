
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Database data = new Database();

        while (true) {
            System.out.println("?");
            String command = reader.nextLine();

            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                System.out.println("Name:");
                String name = reader.nextLine();
                System.out.println("Latin Name:");
                String latinName = reader.nextLine();

                Bird bird = new Bird(name, latinName);
                data.addBird(bird);
            } else if (command.equals("Observation")) {
                System.out.println("What was observed:");
                String name = reader.nextLine();

                data.observeBird(name);

            } else if (command.equals("Statistics")){
                data.printBirds();
            } else if (command.equals("Show")){
                System.out.println("What?");
                String name = reader.nextLine();
                
                System.out.println(data.findBird(name));
                
            }

        }
    }

}
