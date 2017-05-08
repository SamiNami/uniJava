package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {

    private List<Movable> construction;

    public Group() {
        this.construction = new ArrayList<Movable>();
    }

    @Override
    public String toString() {
        String positions = "";
        for (Movable movable : construction) {
            positions += movable + "\n";
        }
        return positions;
    }

    public void addToGroup(Movable movable) {
        this.construction.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : construction) {
            movable.move(dx, dy);
        }
    }

}
