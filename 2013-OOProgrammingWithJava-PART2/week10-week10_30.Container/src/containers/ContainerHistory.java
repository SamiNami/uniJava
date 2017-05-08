package containers;

import java.util.ArrayList;
import java.util.List;

public class ContainerHistory {

    private List<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }

    public void add(double situation) {
        this.history.add(situation);
    }

    public void reset() {
        history.clear();
    }

    @Override
    public String toString() {
        return history.toString();
    }

    public double maxValue() {

        if (history.isEmpty()) {
            return 0;
        }

        double max = history.get(0);
        for (double value : history) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public double minValue() {

        if (history.isEmpty()) {
            return 0;
        }

        double min = history.get(0);
        for (double value : history) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public double average() {

        if (history.isEmpty()) {
            return 0;
        }

        double sum = 0;

        for (double value : history) {
            sum += value;

        }
        return sum / history.size();
    }

    public double greatestFluctuation() {

        if (history.size() == 1 || history.isEmpty()) {
            return 0;
        }

        double last = history.get(0);
        double current = 0;
        double currentFlux = 0;
        double bigFlux = 0;

        for (int i = 1; i < history.size(); i++) {

            current = history.get(i);
            currentFlux = Math.abs(last - current);

            if (currentFlux > bigFlux) {
                bigFlux = currentFlux;
            }

            last = history.get(i);
        }

        return bigFlux;
    }

    public double variance() {

        if (history.size() == 1 || history.isEmpty()) {
            return 0;
        }

        double average = this.average();
        double sum = 0;
        int amountOfNumbers = 0;
        for (double value : history) {
            double valueMinuesAverage = (value - average);
            valueMinuesAverage = valueMinuesAverage * valueMinuesAverage;
            sum += valueMinuesAverage;
            amountOfNumbers++;
        }
        return sum / (amountOfNumbers - 1);
    }

}
