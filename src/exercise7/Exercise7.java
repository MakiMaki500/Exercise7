/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise7;

/**
 *
 * @author PHOTON
 */
public class Exercise7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Location celadon = new Location("Celadon City", "Department Store");
        Trainer ash = new Trainer("Ash", celadon);
        FireType flareon = new FireType("Flareon", 100, 30);
        NPC departmentStoreClerk = new NPC("Department Store Clerk", celadon, "Welcome? Would you like to buy or sell anything?");
        
        ash.inspect(celadon);
        ash.inspect(flareon);
        ash.inspect(departmentStoreClerk);
    }
    
}
