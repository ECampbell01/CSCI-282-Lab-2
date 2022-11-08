/**
 * This is the yacht subclass of the class Ship
 * Authors: Ethan Campbell and Justin Delgado
 * Modified on 9/3/2022
 */
public class Yacht extends Ship{
    
    private int numStateRooms;
    private double poolSize;
    private int numDecks;
    private int power;
    
    public Yacht(int nsr, int pSiz, int numDec, int pow,
            String nam,  String nat,  int yer, int len, int dra, int bem)
    {
        super(nam, nat, yer, len, dra, bem);
       
        numStateRooms = nsr;
        poolSize = pSiz;
        numDecks = numDec;
        power = pow;
    }

   public String toString()
    {
        String stuff3 = super.toString() + " State Rooms: " + numStateRooms + " Pool Size: " + poolSize +
                " Number of decks: " + numDecks + " Engine Power: " + power;
             return stuff3;}
   
 
    public int getNumStateRooms() {
        return numStateRooms;
    }
    
    public double getPoolSize() {
        return poolSize;
    }

    public int getNumDecks() {
        return numDecks;
    }
    
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
