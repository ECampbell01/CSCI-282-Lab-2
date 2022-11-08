/**
 * This is the FlotillaDriver class
 * Authors: Ethan Campbell and Justin Delgado
 * Modified on 9/13/2022
 */

import javax.swing.*;
import java.io.*;
import java.util.*;

public class FlotillaDriver{
   
    public static void main(String[] args) {
        
        String[] options = {"Cruise Ships", "Cargo Ships", "Yachts", "Quit"};
        
        String selectIcon = "icons/select.png";
        ImageIcon firstIcon = new ImageIcon(selectIcon);
        
        String yachtIcon = "icons/yacht.png";
        ImageIcon secondIcon = new ImageIcon(yachtIcon);
        
        String cruiseIcon = "icons/CruiseShip.png";
        ImageIcon thirdIcon = new ImageIcon(cruiseIcon);
        
        String cargoIcon = "icons/CargoShip.png";
        ImageIcon fourthIcon = new ImageIcon(cargoIcon);
        
        ArrayList<Ship> fleet = new ArrayList<Ship>();
        
        String fileName = "CSV/flotilla_data.csv";
        File inFile = new File (fileName);
        
        String cruiseInfo = "";
        String cargoInfo = "";
        String yachtInfo = "";
        String shipInfo = "";
        
        int choice = 0;
        
        try{
           
            Scanner inScan = new Scanner(inFile).useDelimiter("[,\n]");
            
            while(inScan.hasNext()){
                
                String type = inScan.next();
                String name = inScan.next();
                int yearBuilt = inScan.nextInt();
                String nation = inScan.next();
                int length = inScan.nextInt();
                int draft = inScan.nextInt();
                int beam = inScan.nextInt();
               
                if(type.equals("CG")){
                    
                    int maxWeight = inScan.nextInt();
                    int storage = inScan.nextInt();
                
                    fleet.add(new Cargo(maxWeight, storage, name, nation, yearBuilt, length,
                    draft, beam));
                }
                
                if(type.equals("CR")){
                    
                    int executiveRooms = inScan.nextInt();
                    int doubleRooms = inScan.nextInt();
                    int quadRooms = inScan.nextInt();
                
                    fleet.add(new Cruise(executiveRooms, doubleRooms, quadRooms, name, nation, yearBuilt, length,
                    draft, beam));
                }

                if(type.equals("YT")){
                    
                    int numStateRooms = inScan.nextInt();
                     int poolSize = inScan.nextInt();
                     int numDecks = inScan.nextInt();
                     int power = inScan.nextInt();
                
                    fleet.add(new Yacht(numStateRooms, poolSize, numDecks, power, name, nation, yearBuilt, length, 
                            draft, beam));
                }
            }
                for(int currentShip = 0; currentShip < fleet.size(); currentShip++){
                    
                    if(fleet.get(currentShip) instanceof Cargo){
                       
                        cargoInfo+= fleet.get(currentShip) + "\n";
                        shipInfo += "     "+ fleet.get(currentShip).getName()+", "+fleet.get(currentShip).getNation()+
                        ", "+fleet.get(currentShip).getYearBuilt()+"\n";
                    }
                   
                    if(fleet.get(currentShip) instanceof Cruise){
                        
                        cruiseInfo += fleet.get(currentShip) + "\n";
                        shipInfo += "     "+ fleet.get(currentShip).getName()+", "+fleet.get(currentShip).getNation()+
                        ", "+fleet.get(currentShip).getYearBuilt()+"\n";
                    }
                    
                    if(fleet.get(currentShip) instanceof Yacht){
                       
                        yachtInfo += fleet.get(currentShip) + "\n";
                        shipInfo += "     "+ fleet.get(currentShip).getName()+", "+fleet.get(currentShip).getNation()+
                        ", "+fleet.get(currentShip).getYearBuilt()+"\n";
                    }
                }
                    while(choice != 3){
                    
                         choice = JOptionPane.showOptionDialog(null, shipInfo, "Our Ships: Ethan Campbell and Justin Delgado",
                         0, 1, firstIcon, options, options[0]);
                    
                    
                    if(choice == 1){
                    
                        JOptionPane.showMessageDialog(null, cargoInfo, "All Cargo Ships",0, fourthIcon);
                    }
                    
                    if(choice == 0){
                    
                        JOptionPane.showMessageDialog(null, cruiseInfo, "All Cruise Ships",0, thirdIcon);
                    }
                    
                    if(choice == 2){
                    
                        JOptionPane.showMessageDialog(null, yachtInfo, "All Yacht Ships",0, secondIcon);
                    }
                }
        }
        catch(IOException ioe)
        {
             JOptionPane.showMessageDialog(null, "Cannot see file!", "Warning!", JOptionPane.ERROR_MESSAGE);
        }
        }
    }

