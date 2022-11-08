/**
 * This is the cargo subclass of the class Ship
 * Authors: Ethan Campbell and Justin Delgado
 * Modified on 9/13/2022
 */

public class Cargo extends Ship{
    
    private int maxWeight;
    private int storage;
    
    public Cargo(int mWeight, int stor,
            String nam,  String nat,  int yer, int len, int dra, int bem){
        
        super(nam, nat, yer, len, dra, bem);
        
        maxWeight = mWeight;
        storage = stor;
    }
    public String toString()
    {
        String stuff = super.toString() + " Max Weight: " + maxWeight + " Storage: " + storage;
             return stuff;}
   
    public int getMaxWeight() {
        return maxWeight;
    }

    public int getStorage() {
        return storage;
    }
    
}

