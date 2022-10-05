/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class SlotMachine {
    public static void main(String[] args){
        C6L2_SlotMachine slot = new C6L2_SlotMachine(100);
        for(int i = 0; i < 100; i++){
            slot.spin();
            slot.SlotDisplay();
        }
        System.out.println("Final Balance:" + slot.SlotReturn());
    }
    
}
