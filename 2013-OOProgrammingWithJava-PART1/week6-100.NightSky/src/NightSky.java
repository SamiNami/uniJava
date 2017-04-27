
import java.util.*;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height) {
        this.density = 0.1;
        this.width = width;
        this.height = height;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {
        //int lineLength= this.width;
        //double probablity = this.density;

        Random random = new Random();

        for (int i = 0; i < this.width; i++) {
            if (random.nextDouble() <= this.density) {
                System.out.print("*");
                this.starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }

    }

    public void print() {
        this.starsInLastPrint = 0;
        for (int i = 0; i < this.height; i++) {
            this.printLine();
            System.out.println("");
        }
    }

    public int starsInLastPrint() {
        int stars = this.starsInLastPrint;
        return stars;

    }

}
