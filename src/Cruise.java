/**
 * This is the cruise subclass of the class Ship
 * Authors: Ethan Campbell and Justin Delgado
 * Modified on 9/13/2022
 */

public class Cruise extends Ship{
    
    private int executiveRooms;
    private int doubleRooms;
    private int quadRooms;
    
    public Cruise(int execRooms, int doubRooms, int qRooms,
            String nam,  String nat,  int yer, int len, int dra, int bem){
    
        super(nam, nat, yer, len, dra, bem);
       
        executiveRooms = execRooms;
        doubleRooms = doubRooms;
        quadRooms = qRooms;
    }

    public String toString()
    {
        String stuff2 = super.toString() + " Executive Rooms: " + executiveRooms + " Double Rooms: " + doubleRooms +
                " Quad Rooms: " + quadRooms;
             return stuff2;}
   
     
    public int getExecutiveRooms() {
        return executiveRooms;
    }
  
    public int getDoubleRooms() {
        return doubleRooms;
    }

    public int getQuadRooms() {
        return quadRooms;
    }
    
}
