import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }
    
        
    public boolean add(RegistrationPlate plate, String owner){
        // if the plate does not have an owner
        // add the plate + owner
        // can also use .containsKey()
        if(this.owners.get(plate) == null){
           this.owners.put(plate, owner);
           return true;  
        }
        
        return false;           
       
    }

    
    
    public String get(RegistrationPlate plate){
        // if there is not owner
        if(this.owners.get(plate) == null){
            return null;
        }
        
        return this.owners.get(plate);
        
    }
    
    public boolean delete(RegistrationPlate plate){
        // if there is not owner
        if(this.owners.get(plate) == null){
            return false;
        }
        
        this.owners.put(plate,null);
        return true;
    }
    
    public void printRegistrationPlates(){
        for(RegistrationPlate plate : owners.keySet()){
            System.out.println(plate);
        }
    }
    
    public void printOwners(){
       
       ArrayList<String> theOwners = new ArrayList<String>();
        
       for(String owner : owners.values()){
           
           if(!theOwners.contains(owner)){
               System.out.println(owner);
               theOwners.add(owner);
           }           
        } 
              
       
    }
    
}
