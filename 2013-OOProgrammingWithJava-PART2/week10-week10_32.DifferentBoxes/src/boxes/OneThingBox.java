
package boxes;


public class OneThingBox extends Box{

    private Thing oneThing;
     
    public OneThingBox(){       
        
    }
    
    
    @Override
    public void add(Thing thing) {
        if(oneThing == null){
            oneThing = thing;
        }
        
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        
        if(oneThing == null){
            return false;
        }
        
        if(oneThing.equals(thing)){
            return true;
        }
        return false;
    }
    
}
