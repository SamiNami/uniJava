
public class Reformatory {
    
    private int times;

    public Reformatory() {
        this.times = 0;
    }
            
    public int weight(Person person) {
        this.times++;
        return person.getWeight();
        
    }
    
    public void feed(Person person){
        person.setWeight(this.weight(person) + 1);
    }
    
    public int totalWeightsMeasured(){
        return times;
    }
    
}
