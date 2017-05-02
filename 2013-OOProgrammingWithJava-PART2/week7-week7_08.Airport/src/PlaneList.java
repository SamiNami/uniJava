
import java.util.ArrayList;

public class PlaneList {

    private ArrayList<Plane> planelist;

    public PlaneList() {
        this.planelist = new ArrayList<Plane>();
    }

    public void addPlane(Plane plane) {
        planelist.add(plane);
    }

    public void printPlanes() {
        for (Plane plane : planelist) {
            System.out.println(plane);
        }
    }

    public void printOnePlane(String id) {
        for (Plane plane : planelist) {
            if (id.equals(plane.getId())) {
                System.out.println(plane);
            }
        }
    }

    public Plane getPlane(String id) {
        for (Plane plane : planelist) {
            if (id.equals(plane.getId())) {
                return plane;
            }

        }
        return null;
    }

}
