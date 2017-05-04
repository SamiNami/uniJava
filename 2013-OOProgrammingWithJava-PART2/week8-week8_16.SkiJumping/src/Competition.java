
import java.util.*;

public class Competition {

    private ArrayList<Jumper> jumpers;

    public Competition() {
        this.jumpers = new ArrayList<Jumper>();
    }

    public void addJumper(Jumper jumper) {
        jumpers.add(jumper);
    }

    public void sortByPoints() {
        Collections.sort(jumpers);
    }

    public void reverse() {
        Collections.reverse(jumpers);
    }

    // can be moved to UI
    public static int jump() {
        Random random = new Random();
        return random.nextInt(60) + 60;
    }

    // can be moved to UI
    public int[] judges() {
        int[] judges = new int[5];
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int points = random.nextInt(10) + 10;
            judges[i] = points;
        }
        return judges;
    }

    public ArrayList<Jumper> getJumpers() {
        return jumpers;
    }

    public int calculateJudgepoints(int[] array) {

        Arrays.sort(array);

        int sum = 0;
        for (int i = 1; i < 4; i++) {
            sum += array[i];
        }

        return sum;
    }

}
