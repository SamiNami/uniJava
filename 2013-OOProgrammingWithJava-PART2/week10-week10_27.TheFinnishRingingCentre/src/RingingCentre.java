
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {

    private Map<Bird, List<String>> observations;

    public RingingCentre() {
        this.observations = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place) {

        if (!observations.containsKey(bird)) {
            List<String> places = new ArrayList<String>();
            places.add(place);
            this.observations.put(bird, places);
        } else {
            this.observations.get(bird).add(place);
        }

    }

    public void observations(Bird bird) {

        if (observations.containsKey(bird)) {
            List<String> places = observations.get(bird);
            System.out.println(bird + " observations: " + places.size());

            for (String place : places) {
                System.out.println(place);
            }
        } else {
            System.out.println(bird + " observations: 0");
        }
    }
}
