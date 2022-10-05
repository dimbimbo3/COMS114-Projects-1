/*
 * The purpose of this lab is to illustrate the basics of array
 * manipulation by loading the contents of an array from
 * keyboard input.
 * 1) Create a main method within this class.  You do not need
 *    to create any additional classes.
 * 2) Within the main method, prompt the user to enter 5 unique scores
 *    on a test.  Store each test score in an array of type int.  You
 *    may use the Scanner or JOptionPane Java classes to capture
 *    the input as you have done in the past.
 * 3) Next, determine the maximum, minimum, and average score.
 * 4) Display the results from step #3 above.
 */
import java.util.Scanner;

public class C7L1_ArrayIntro {
    public static void main(String[] args){
        int[] scores = new int[5];
        int min = 100;
        int max = 0;
        double average;
        int count = 0;
        double total = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        for(int index = 0; index < scores.length; index++)
        {System.out.println("Please the score for Test Score #" + (index + 1) + ": ");
        int input = scores[index] = keyboard.nextInt();
          if(input < min)
              min = input;
          if(input > max)
              max = input;
          total += input;
          count++;}
        
        average = total/count;
        
        System.out.println("Test Scores:");
        for (int index = 0; index < scores.length; index++)
            System.out.print(scores[index] + " ");
        System.out.println("\nLowest Score:" + min);
        System.out.println("Highest Score:" + max);
        System.out.println("Average:" + average);
    }
}
