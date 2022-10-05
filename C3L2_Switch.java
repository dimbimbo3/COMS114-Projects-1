/**
  Create a program which implements the logic of the switch statement
  * 1) Using the Scanner or JOptionPane class, prompt the user for a day 
  *    of the week in integer form: i.e. 1=Sunday, 2=Monday, 3=Tuesday, etc.
  * 2) Based upon the numeric input display the corresponding day of the week
  * 3) If an invalid number is entered display an appropriate error message
  * 4) Output your results using the console or a dialog box
  * 5) Optional challenge: Allow the user to enter any value greater than 0
  *    and use the modulus operator to calculate the remainder.  Based upon
  *    the value of the remainder, display the corresponding day.
  *    i.e. 17 divided by 7 = 2 remainder 3 = Tuesday
*/
import javax.swing.JOptionPane;

public class C3L2_Switch {
    public static void main (String [] args)
	{
      //Your code goes here...
            int num1; 
            String input;
            
            input = JOptionPane.showInputDialog("Enter the day of the week");
            num1 = Integer.parseInt(input);
            
            switch(num1){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("You have not entered a vaild day");
                break;
    }
}
}