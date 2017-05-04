
import java.util.*;

public class UserInterface {

    private Scanner reader;
    private Competition competition;

    public UserInterface(Scanner reader, Competition competition) {
        this.reader = reader;
        this.competition = competition;
    }

    public void start() {
        System.out.println("Kumpula ski jumping week");
        System.out.println("");

        addJumpers();
        tourneyStart();
        printResults();
    }

    private void addJumpers() {
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while (true) {

            System.out.println("  Participant name: ");
            String command = reader.nextLine();

            if (command.isEmpty()) {
                break;
            }

            Jumper jumper = new Jumper(command);
            competition.addJumper(jumper);
        }

        System.out.println("");

    }

    private void tourneyStart() {
        System.out.println("The tournament begins!");
        int round = 1;

        while (true) {

            System.out.println("Write \"jump\" to jump; otherwise you quit: ");
            String command = reader.nextLine();

            System.out.println("");
            if (!command.equals("jump")) {
                break;
            }
            // gets the jumpers who are participating
            ArrayList<Jumper> jumpers = startRound(round);
            // adds a jump to each participant
            addJumps(jumpers);
            // adds judge points, total points and prints them.
            printRound(round, jumpers);

            round++;
            System.out.println("");

        }

    }

    private ArrayList<Jumper> startRound(int round) {

        System.out.println("Round " + round);
        System.out.println("Jumping order:");

        competition.sortByPoints();
        ArrayList<Jumper> jumpers = competition.getJumpers();

        int j = 1;
        for (Jumper jumper : jumpers) {
            System.out.println("  " + j + ". " + jumper);
            j++;
        }

        return jumpers;
    }

    private void addJumps(ArrayList<Jumper> jumpers) {
        for (Jumper jumper : jumpers) {
            int jump = Competition.jump();
            jumper.addJump(jump);
        }
    }

    private void printRound(int round, ArrayList<Jumper> jumpers) {
        System.out.println("Results of round " + round);
        for (Jumper jumper : jumpers) {

            System.out.println("  " + jumper.getName());

            ArrayList<Integer> jumperJumps = jumper.getJumps();
            int thisJump = jumperJumps.get(round - 1);

            System.out.println("    length: " + thisJump);

            int[] judges = competition.judges();
            System.out.println("    judge votes: " + Arrays.toString(judges));

            int judgePoints = competition.calculateJudgepoints(judges);
            int points = judgePoints + thisJump;
            jumper.addPoints(points);

        }
    }

    private void printResults() {
        System.out.println("Thanks!");
        System.out.println("");

        System.out.println("Tournament results:");
        System.out.println("Position    Name");

        int position = 1;

        competition.sortByPoints();
        competition.reverse();
        ArrayList<Jumper> jumpers = competition.getJumpers();

        for (Jumper jumper : jumpers) {

            ArrayList<Integer> jumperJumps = jumper.getJumps();
            String jumps = "";

            for (int jump : jumperJumps) {
                jumps += " " + jump + " m";
            }

            System.out.println(position + "           " + jumper);
            System.out.println("            jump lengths:" + jumps);
            position++;
        }
    }

}
