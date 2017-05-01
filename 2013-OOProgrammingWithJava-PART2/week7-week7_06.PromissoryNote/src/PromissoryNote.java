import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> promissoryNote; 

    public PromissoryNote() {
        this.promissoryNote = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value){
        this.promissoryNote.put(toWhom,value);
    }
    
    public double howMuchIsTheDebt(String whose){
        Double value = promissoryNote.get(whose);
        if (value == null){
            return 0;
        }
        
        return value;
    }
    
}
