
package farmsimulator;

public class BulkTank {

    private double capacity;
    private double volume;
    
    public BulkTank(){
        this.capacity = 2000;
        this.volume = 0;
    }
    
    public BulkTank(double capacity){
        this.capacity = capacity;
        this.volume = 0;
    }
    
    public double getCapacity(){
        return this.capacity;
    }
    
    public double getVolume(){
        return this.volume;
    }
    
    public double howMuchFreeSpace(){
        return this.capacity - this.volume;
    }
    
    public void addToTank(double amount){
        
        if(this.howMuchFreeSpace() >= amount){
            volume += amount;
        }
        else{
            volume += this.howMuchFreeSpace();
        }
        
    }
    
    public double getFromTank(double amount){
        if(amount > volume){
            double toTake = volume; 
            volume = 0;
            return toTake;
        }
        else{
            volume -= amount;
            return amount;
        }
    }
    
    
    @Override 
    public String toString(){
        return Math.ceil(this.volume)+ "/" + Math.ceil(this.capacity);
    }
            
    
}
