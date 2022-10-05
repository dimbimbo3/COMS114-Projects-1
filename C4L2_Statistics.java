/*
 * Create a program that will calculate the min, max and average from a
 * data set(s).  The purpose of the lab is to implement a loop construct
 * along with the ability to perform file I/O.
 * 1) Place C4L2_Data1.txt, C4L2_Data2.txt, and C4L2_Data3.txt in the
 *    root directory of your project.  These are your input files.
 * 2) Each file has a list of numbers which is a combination of
 *    integer and floating point values.
 * 3) Each file has the same values, but in different order.
 * 4) Since it is likely you wouldn't know the count of values in an input
 *    file I suggest you use the while or do-while loop.
 * 5) Your program should read the data line-by-line evaluating each value
 *    to determine if it is the min or max while also accumulating the total
 *    which will be used to calculate the avergage upon reading all values.
 * 6) After you execute your program using C4L2_Data1.txt, run it again
 *    using the other two input files.  
 * 7) The purpose of having the same data amongst three files is to test
 *    the logic of your program to handle the case(s) where the min and max
 *    could be anywhere in the file.
 * 8) After you execute your program with the three files you should always
 *    obtain the same min, max, and average.  If your results differ between
 *    the input files then you have a logical error in your program
 */

import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class C4L2_Statistics {
  public static void main(String[] args) throws Exception{
      double num; //Temporary var representing a single value from the file
      double min = 1000; //The minimum value in the file
      double max = 0; //The maximum value in the file
      double average; //The average of the values
      int count = 0; //Keeps track of the number of values in the file
      double total = 0; //The accumulator
      DecimalFormat formatter = new DecimalFormat("#,##0.00");
      
      File A = new File("C4L2_Data1.txt");
      File B = new File("C4L2_Data2.txt");
      File C = new File("C4L2_Data3.txt");
      
      Scanner data1 = new Scanner(A);
      Scanner data2 = new Scanner(B);
      Scanner data3 = new Scanner(C);
      
      while(data1.hasNext()){
          num = data1.nextDouble();
          if(num < min)
              min = num;
          if(num > max)
              max = num;
          total += num;
          count++;
        }
      
      average = total/count;
      
      System.out.println("Data1 min=" + min);
      System.out.println("Data1 max=" + max);
      System.out.println("Data1 average=" + average);
      System.out.println("");
      
      while(data2.hasNext()){
          num = data2.nextDouble();
          if(num < min)
              min = num;
          if(num > max)
              max = num;
          total += num;
          count++;
        }
      
      average = total/count;
      
      System.out.println("Data2 min=" + min);
      System.out.println("Data2 max=" + max);
      System.out.println("Data2 average=" + average);
      System.out.println("");
    
      while(data3.hasNext()){
          num = data3.nextDouble();
          if(num < min)
              min = num;
          if(num > max)
              max = num;
          total += num;
          count++;
        }
      
      average = total/count;
      
      System.out.println("Data3 min=" + min);
      System.out.println("Data3 max=" + max);
      System.out.println("Data3 average=" + average);
  }
}
