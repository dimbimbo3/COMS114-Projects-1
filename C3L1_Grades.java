/**
  Create a program which displays the letter grade for a test score
  * 1) Prompt the user for a test score using the Scanner or JOptionPane class
  * 2) Determine the letter grade using the following table:
  *    90 -to- 100 = 'A'
  *    80 -to- 89 = 'B'
  *    70 -to- 79 = 'C'
  *    60 -to- 69 = 'D'
  *    0 -to- 59 = 'F'
  * 3) Display an appropriate error message if the score entered is 
  *    less than 0 or greater than 100
  * 4) Output your results using the console or a dialog box
*/
import javax.swing.JOptionPane;

public class C3L1_Grades
{
	public static void main (String [] args)
	{
            //Your code goes here...
            int score;
            String input;
            
            input = JOptionPane.showInputDialog("Enter your test score to" +
                                                " find out the grade: ");
            score = Integer.parseInt(input);
            
            if (score <= -1)
                System.out.println("Invalid score.");
            else if (score <= 59)
                System.out.println("Your grade is F.");
            else if (score <= 69)
                System.out.println("Your grade is D.");
            else if (score <= 79)
                System.out.println("Your grade is C.");
            else if (score <= 89)
                System.out.println("Your grade is B.");
            else if (score <= 100)
                System.out.println("Your grade is A.");
            else
                System.out.println("Invalid input.");
	}
}
