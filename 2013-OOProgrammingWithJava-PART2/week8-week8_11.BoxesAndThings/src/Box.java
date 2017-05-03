
import java.util.ArrayList;

public class Box implements ToBeStored {

    private ArrayList<ToBeStored> stored;

    private double maxWeight;

    public Box(double maxWeight) {
        this.stored = new ArrayList<ToBeStored>();

        this.maxWeight = maxWeight;
    }

    public void add(ToBeStored tobestored) {

        if (tobestored.weight() + this.weight() > maxWeight) {
            return;
        }

        this.stored.add(tobestored);

    }

    public String toString() {
        return "Box: " + this.stored.size() + " things, total weight " + this.weight() + " kg";
    }

    public double weight() {
        double weight = 0;

        for (ToBeStored tobestored : stored) {
            weight += tobestored.weight();
        }

        return weight;
    }

}
