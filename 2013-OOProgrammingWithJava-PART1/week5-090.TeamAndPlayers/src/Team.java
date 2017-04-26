
import java.util.ArrayList;

/**
 *
 * @author John
 */
public class Team {

    private String name;
    private ArrayList<Player> team = new ArrayList<Player>();
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.maxSize = 16;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        if (team.size() >= maxSize) {
            return;
        }
        this.team.add(player);
    }

    public void printPlayers() {
        for (Player player : this.team) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.team.size();
    }

    public int goals() {
        int goals = 0;
        for (Player player : team) {
            goals += player.goals();
        }
        return goals;
    }
}
