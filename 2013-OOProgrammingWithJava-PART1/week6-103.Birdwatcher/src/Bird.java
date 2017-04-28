
public class Bird {
    private final String name;
    private final String latinName;
    private int observed;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName =latinName;
        this.observed = 0;
    }
    
    public Bird() {
        this.name = "";
        this.latinName ="";
        this.observed = 0;
    }
    
    
    public String toString(){
        return name + " ("+latinName +"): "+ observed +" observations";
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getObserved(){
        return this.observed;
    }
    
    public void addObserved(){
        this.observed++;
    }
    
}
