/*
 * Implementation of a Student
 */

public class Student{
  //Private fields
  private String firstName;
  private String lastName;

  /**
   * Default constructor
   */
  public Student(){
    firstName = "Bob";
    lastName = "Smith";
  }
  
  /**
   * Get the Student's first name
   */
  public String getFirstName(){
    return firstName;
  }
  
  /**
   * Get the Student's last name
   */
  public String getLastName(){
    return lastName;
  }
  
  /**
   * Get all of the Student's test scores
   */
  public int[] getScores(){
    int[] scores = {94, 74, 79, 62, 66, 98, 500, 69, 80, 87, 55};
    return scores;
  }
}
