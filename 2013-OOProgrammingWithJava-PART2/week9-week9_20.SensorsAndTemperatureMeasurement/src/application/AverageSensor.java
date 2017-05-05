package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensorlist;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensorlist = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    public void addSensor(Sensor additional) {
        this.sensorlist.add(additional);
    }

    @Override
    public boolean isOn() {

        if (sensorlist.isEmpty()) {
            return false;
        }

        for (Sensor sensor : sensorlist) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        
        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : sensorlist) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        for (Sensor sensor : sensorlist) {
            sensor.off();
        }
    }

    @Override
    public int measure() {

        if (!this.isOn() || this.sensorlist.isEmpty()) {
            throw new IllegalStateException("The sensor is off or empty");
        }

        int sum = 0;
        int amount = 0;

        for (Sensor sensor : sensorlist) {
            sum += sensor.measure();
            amount++;
        }

        int average = sum / amount;
        readings.add(average);
        return average;
    }

    public List<Integer> readings() {

        return this.readings;

    }
}
