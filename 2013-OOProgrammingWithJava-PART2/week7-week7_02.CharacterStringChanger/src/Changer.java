
import java.util.*;

public class Changer {

    private ArrayList<Change> changes;

    public Changer() {
        this.changes = new ArrayList<Change>();
    }

    public void addChange(Change change) {
        changes.add(change);
    }

    public String change(String characterString) {

        for (Change changeObj : changes) {
            characterString = changeObj.change(characterString);
        }
        return characterString;
    }

}
