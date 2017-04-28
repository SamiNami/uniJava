
import java.util.ArrayList;

public class Database {

    ArrayList<Bird> database;

    public Database() {
        this.database = new ArrayList<Bird>();
    }

    public void addBird(Bird bird) {
        database.add(bird);
    }

    public void observeBird(String name) {
        boolean check = false;
        for (Bird bird : database) {
            if (bird.getName().equals(name)) {
                bird.addObserved();
                check = true;
            }
        }
        if (!check) {
            System.out.println("It's not a bird!");
        }
    }

    public void printBirds() {
        for (Bird bird : database) {
            System.out.println(bird);
        }
    }
    
    public Bird findBird(String name) {
        Bird returnBird = new Bird();
        for (Bird bird : database) {
            if (bird.getName().equals(name)) {
                returnBird = bird;                
            }
        }
        return returnBird;
    }
}
