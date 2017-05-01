
import java.util.ArrayList;

public class Container {

    private ArrayList<Suitcase> container;
    private int weight;
    private int weightLimit;

    public Container(int weightLimit) {
        this.weightLimit = weightLimit;
        this.weight = 0;
        this.container = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {

        if (this.weight + suitcase.totalWeight() > this.weightLimit) {
            return;
        }

        this.container.add(suitcase);
        this.weight += suitcase.totalWeight();

    }

    public String toString() {
        return container.size() + " suitcases (" + this.weight + "kg)";
    }

    public void printThings() {
        for (Suitcase suitcase : container) {
            suitcase.printThings();
        }
    }

}
