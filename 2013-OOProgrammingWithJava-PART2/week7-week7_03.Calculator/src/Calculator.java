
import java.util.Scanner;

public class Calculator {

    private Reader reader;
    private int calculations;

    public Calculator() {
        this.reader = new Reader();
        this.calculations = 0;
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

    private void sum() {
        int[] values = readTwoValues();

        System.out.println("Sum of the values " + (values[0] + values[1]));

    }

    private void difference() {
        int[] values = readTwoValues();

        System.out.println("Difference of the values : " + (values[0] - values[1]));

    }

    private void product() {
        int[] values = readTwoValues();

        System.out.println("Product of the values " + (values[0] * values[1]));
    }

    private void statistics() {
        System.out.println("Calulations done " + this.calculations);
    }

    private int[] readTwoValues() {
        this.calculations++;
        int[] values = new int[2];

        System.out.println("value1: ");
        values[0] = reader.readInteger();

        System.out.println("value2:");
        values[1] = reader.readInteger();

        return values;
    }
}
