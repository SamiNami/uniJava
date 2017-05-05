package application;

import java.util.Random;

public class Thermometer implements Sensor {

    private boolean on;

    public Thermometer() {
        this.on = false;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void on() {
        this.on = true;
    }

    @Override
    public void off() {
        this.on = false;
    }

    @Override
    public int measure() {
        if (this.on) {
            Random random = new Random();
            int number = random.nextInt(60) - 30;
            return number;
        }
        throw new IllegalStateException("Thermo is not on");
    }

}
