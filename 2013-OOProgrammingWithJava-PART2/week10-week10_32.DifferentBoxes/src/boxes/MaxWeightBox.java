
package boxes;

import java.util.ArrayList;
import java.util.List;


public class MaxWeightBox extends Box{
    
    private List<Thing> box;
    private int maxWeight;
    
    public MaxWeightBox(int maxWeight){
        this.box = new ArrayList<Thing>();
        this.maxWeight = maxWeight;
    }
    
    public int getBoxWeight(){
        int weight = 0;
        for(Thing thing : box){
            weight += thing.getWeight();
        }
        return weight;                
    }
    
    @Override
    public void add(Thing thing) {
        if(this.getBoxWeight() + thing.getWeight() <= maxWeight){
            box.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        for(Thing thingy : box){
            if(thingy.equals(thing)){
                return true;
            }
        }
        return false;
    }

    
}
