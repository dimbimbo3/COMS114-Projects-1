/*
 * Create a program which utilizes methods to display the day of the week
 * and converts temperatures
 *
 * Step 1: Create a method named displayDayOfWeek(int day) which will
 *  display the day of the week that corresponds the day parameter.
 *  i.e. 1=Sunday, 2=Monday, 3=Tuesday, etc.
 *  Call the displayDayOfWeek() method with an appropriate argument
 *
 * Step 2: Create a method to convert celcuis to farenheit.
 *  Define the method as celciusToFarenheit(double celcius) which will
 *  use the following formula to convert celcius to farenheit and return the 
 *  result as a double.  Call celciusToFarenheit(int celcius)
 *  Formula: Farenheit = 32 + ((9.0/5.0) * celcius) 
 *
 * Step 3: Create a method to convert farenheit to celcuis.
 *  Define the method as farenheitToCelcius(double farenheit) which will
 *  use the following formula to convert farenheit to celciusand return the 
 *  result as a double. Call farenheitToCelcius(farenheight)
 *  Formula: Celcius = (5.0/9.0) * (farenheit - 32) 
*/
import java.util.Scanner;
public class C5L1_Method
{
   public static void main(String[] args)
   {
     //Step 1: 
     //Call displayDayOfWeek(int day) below
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Please enter the day of the week");
       displayDayOfWeek(keyboard.nextInt());
     
     //Step 2:
     double celcius = 100.0;
     double celciusConverted = 0; //Variable to store result of method call
     
     //Call conversion method here and store result in celciusConverted
     celciusConverted = celciusToFarenheit(celcius);
     

     //Output celcius to farenheight conversion
     System.out.println(celcius + " celcius to farenheight="  + celciusConverted);
     
     //Step 3:
     double farenheight = 212.0;
     double farenheightConverted= 0;//Variable to store result of method call

     //Call conversion method here and store result in farenheightConverted
     farenheightConverted = fahrenheitToCelcius(farenheight);

     //Output farenheight to celcius conversion
     System.out.println(farenheight + " farenheight to celcius="  + farenheightConverted);
   }
   public static void displayDayOfWeek(int day){
       if (day == 1)
           System.out.println("Sunday");
       if (day == 2)
           System.out.println("Monday");
       if (day == 3)
           System.out.println("Tuesday");
       if (day == 4)
           System.out.println("Wednesday");
       if (day == 5)
           System.out.println("Thursday");
       if (day == 6)
           System.out.println("Friday");
       if (day == 7)
           System.out.println("Saturday");
       if (day < 1 || day > 7)
           System.out.println("Invaild");
   }
   public static double celciusToFarenheit(double celcius){
       double farenheit = 32 + ((9.0/5.0) * celcius);
       return farenheit;
   }
    public static double fahrenheitToCelcius(double farenheit){
       double celcius = (5.0/9.0) * (farenheit - 32);
       return celcius;
   }
}
