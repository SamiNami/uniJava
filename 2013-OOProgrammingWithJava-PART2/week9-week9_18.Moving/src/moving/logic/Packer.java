package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

public class Packer {

    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {

        List<Box> list = new ArrayList<Box>();

        Box box = new Box(boxesVolume);

        for (Thing thing : things) {
            if (!box.addThing(thing)) {
                list.add(box);
                box = new Box(boxesVolume);
                box.addThing(thing);
            }

        }
        list.add(box);

        return list;

    }

}
