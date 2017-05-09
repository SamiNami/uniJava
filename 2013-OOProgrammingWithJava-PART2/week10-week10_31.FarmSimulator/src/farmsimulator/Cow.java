package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive {

    private String name;
    private double capacity;
    private double volume;
    
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    public Cow(){
       int index = new Random().nextInt(NAMES.length); 
       this.name = NAMES[index];
       this.capacity = 15+ new Random().nextInt(26);
       this.volume = 0;
    }
    
    public Cow(String name){
        this.name = name;
        this.capacity = 15+ new Random().nextInt(26);
        this.volume = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getCapacity(){
        return this.capacity;
    }
    
    public double getAmount(){
        return this.volume;
    }
    
    @Override
    public String toString(){
       return this.name  + " " + Math.ceil(this.volume) + "/" +Math.ceil(this.capacity);
    }
    
    
    @Override
    public double milk() {
        double taken = volume;
        volume = 0;
        return taken;
    }

    @Override
    public void liveHour() {
        double milk= (new Random().nextInt(13) + 7) / (double)10;
        
        if(milk + this.volume <= this.capacity){
            volume += milk;
        }
        else{
            volume = capacity;
        }
        
    }
}
