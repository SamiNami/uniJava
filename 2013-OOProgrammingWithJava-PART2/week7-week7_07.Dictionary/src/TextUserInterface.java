
import java.util.Scanner;
import java.util.HashMap;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.println("Statement: ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            handleStatement(command);

        }
        System.out.println("Cheers!");
    }

    private void handleStatement(String command) {

        if (command.equals("add")) {
            add();
        } else if (command.equals("translate")) {
            translate();
        } else {
            System.out.println("Unkonwn statement");
        }
    }

    private void add() {
        System.out.println("In Finnish: ");
        String fin = reader.nextLine();

        System.out.println("Translation: ");
        String trans = reader.nextLine();

        this.dictionary.add(fin, trans);
    }

    private void translate() {
        System.out.println("Give a Word");
        String word = reader.nextLine();
        System.out.println("Translation: " + this.dictionary.translate(word));
    }

}
