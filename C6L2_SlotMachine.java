/*
 * The purpose of this lab is to implement additional methods of this
 * class to create a complete virtual slot machine.
 * 1) Create a public constructor which takes a parameter to initialize the
 *    balance of the slot machine.  The constructor should take a double
 *    data type and assign its value to the balance field.
 * 2) Create a public method which will return the value of 
 *    the balance field.
 * 3) Create a public method to display the value of the balance field.
 *    System.out.println(...) is sufficient.
 * 4) A) Create another class which will create a single C6L2_SlotMachine
 *       object using the constructor from step #1 above with an initial
 *       value of 100 (to represent $100).
 *    B) Call the spin() method 100 times using a loop of your choice.
 *       During each iteration of the loop display the current balance
 *       of your slot machine using the method from step #3 above.
 *    C) After the loop is complete display a message indicating the
 *       final balannce of your machine using the method from step #2 above.
 *    D) Once you're done, experiment with other scenarios such as a 
 *       larger/smaller starting balance, more/less spin(), stop playing
 *       anytime you have a positive credit balance, play until the machine
 *       has no balance keeping track of number of times you called 
 *       the spin() method, etc...
 */
import java.util.Random;

public class C6L2_SlotMachine {
  double balance;
  boolean cherry1, cherry2, cherry3;
  boolean lemon1, lemon2, lemon3;
  boolean seven1, seven2, seven3;
  final int CHERRY_PRIZE = 4;
  final int LEMON_PRIZE = 10;
  final int SEVEN_PRIZE = 12;
  final int COST = 1;

  //Task #1 goes here
public C6L2_SlotMachine(double amount){
    balance = amount;
}
  
  //Task #2 goes here
public double SlotReturn(){
        return balance;
}
  
  //Task #3 goes here
public void SlotDisplay(){
    System.out.println("Balance:" + balance);
}
  
  /**
   * Calling this method simulates a single spin of the slot machine.  No
   * parameters are used.  After the spin() executes the balance field
   * will be updated based upon the random outcomes.  You do not need
   * to understand the logic of this method to complete the lab.
   */
  public void spin(){
    resetFields();

    Random rand = new Random();

    //Spin first wheel
    int wheel_1 = rand.nextInt(3);
    
    switch(wheel_1){
      case 0:
        cherry1 = true;
        break;
      case 1:
        lemon1 = true;
        break;
      case 2:
        seven1 = true;
        break;
    }
    
    //Spin second wheel
    int wheel_2 = rand.nextInt(3);
    
    switch(wheel_2){
      case 0:
        cherry2 = true;
        break;
      case 1:
        lemon2 = true;
        break;
      case 2:
        seven2 = true;
        break;
    }

    //Spin third wheel
    int wheel_3 = rand.nextInt(3);
    
    switch(wheel_3){
      case 0:
        cherry3 = true;
        break;
      case 1:
        lemon3 = true;
        break;
      case 2:
        seven3 = true;
        break;
    }
    
    //Always reduce balance by the cost per spin
    balance -= COST;

    //Check for win
    if(cherry1 == true && cherry2 == true && cherry3 == true){
      balance += CHERRY_PRIZE;
    }
    else if(lemon1 == true && lemon2 == true && lemon3 == true){
      balance += LEMON_PRIZE;
    }
    else if(seven1 == true && seven2 == true && seven3 == true){
      balance += SEVEN_PRIZE;
    }

  }
  
  /**
   * Private method to reset the "wheels"
   */
  private void resetFields(){
    //reset all fields to false
    cherry1 = false;
    cherry2 = false;
    cherry3 = false;
    lemon1 = false;
    lemon2 = false;
    lemon3 = false;
    seven1 = false;
    seven2 = false;
    seven3 = false;
  }
}
