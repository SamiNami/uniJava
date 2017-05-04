package moving.domain;

import java.util.ArrayList;

public class Box implements Thing {

    private int maximumCapacity;
    private ArrayList<Thing> box;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.box = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing) {

        int usedVolume = this.getVolume();

        if (usedVolume + thing.getVolume() > this.maximumCapacity) {
            return false;
        }

        this.box.add(thing);
        return true;
    }

    @Override
    public int getVolume() {
        int volume = 0;
        for (Thing thing : box) {
            volume += thing.getVolume();
        }
        return volume;
    }

}
