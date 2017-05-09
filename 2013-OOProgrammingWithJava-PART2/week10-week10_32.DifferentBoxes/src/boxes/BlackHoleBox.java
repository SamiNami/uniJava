
package boxes;

public class BlackHoleBox extends Box{
    
    private Thing oneThing;
    
    public BlackHoleBox(){
        
    }
    
    
    
    
    @Override
    public void add(Thing thing) {
        oneThing = thing;
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
    
    
}
