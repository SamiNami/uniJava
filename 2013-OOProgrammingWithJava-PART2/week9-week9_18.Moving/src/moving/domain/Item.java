
package moving.domain;
// learn the comparable thing
public class Item implements Thing, Comparable<Thing> { 
    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }
    
    public String getName(){
        return this.name;
    }
    
    @Override
    public String toString(){
        return this.name + " ("+this.volume+ " dm^3)";
    }
    
    
    @Override
    public int getVolume() {
        return this.volume;
    }

    
    @Override
    public int compareTo(Thing other) {        
        return this.getVolume() - other.getVolume();
    }
    
    
    
    
}
