/*
 * The purpose of this lab is to demonstrate the functionality of returning
 * an array from a method.  The returned array object access is identical
 * to the other arrays we've used so far.
 * 1) Within the main method of this class create a new Student 
 *    object. The Student class can be found in the same directory as
 *    this lab and its implementation is complete.
 * 2) You will calculate the students final grade by dropping their
 *    lowest test score and calculating the average based upon their 
 *    remaining scores.  You will call the getScores() method on the Student
 *    object which will return all of the scores as an integer array.  
 * 3) Next, print the student's first and last name by calling the 
 *    getFirstName() and getLastName() methods on your Student object. 
 *    Additionally, display the student's calculated final grade from step #2.  
 *    You can use a format similar to the following:
 *    Student=Smith, Bob
 *    Final average=76.4
 */

public class C7L3_Grader {
  
  public static void main(String[] args){
      int min = 100;
      int max = 0;
      double average;
      int count = 0;
      double total = 0;
      
      Student student = new Student();
      int[] scores = student.getScores();
      
      
      for(int index = 0; index < scores.length; index++){
          if(scores[index] < min)
              min = scores[index];
          if(scores[index] > max)
              max = scores[index];
          total += scores[index];
          count++;}
       count--;
       total = total - min;
        
        average = total/count;
        
      System.out.println("Student= " + student.getLastName() + ", " + student.getFirstName());
      System.out.println("Average= " + average);
  } 
}
