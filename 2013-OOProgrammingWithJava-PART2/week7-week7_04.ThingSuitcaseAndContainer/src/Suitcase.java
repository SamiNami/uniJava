
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Thing> suitcase;
    private int things;
    private int weight;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.weight = 0;
        this.things = 0;
        this.maxWeight = maxWeight;
        this.suitcase = new ArrayList<Thing>();
    }

    public void addThing(Thing thing) {
        if (weight + thing.getWeight() > maxWeight) {
            return;
        }

        suitcase.add(thing);
        things++;
        weight += thing.getWeight();
    }

    public String toString() {

        if (this.things == 0) {
            return "empty (" + this.weight + " kg)";
        } else if (this.things == 1) {
            return this.things + " thing (" + this.weight + " kg)";
        }

        return this.things + " things (" + this.weight + " kg)";
    }

    public void printThings() {
        for (Thing things : suitcase) {
            System.out.println(things);
        }
    }

    public int totalWeight() {
        return this.weight;
    }

    public Thing heaviestThing() {

        if (suitcase.isEmpty()) {
            return null;
        }

        Thing returnThing = new Thing();

        for (Thing things : suitcase) {
            if (returnThing.getWeight() < things.getWeight()) {
                returnThing = things;
            }
        }

        return returnThing;
    }

}
