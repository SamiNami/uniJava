
import java.util.Scanner;

public class Reader {

    private final Scanner reader = new Scanner(System.in);

    public String readString() {

        return reader.nextLine();
    }

    public int readInteger() {
        return Integer.parseInt(reader.nextLine());
    }

}
