/*
 * Create a program which creates a circle and a triangle.  Both classes
 * should know how to calculate their area.
 *
 * Step 1: Create a Circle class (in a seperate file) which has a 
 * private radius field and the following methods: 
 *  public void setRadius(double val)
 *  public double getArea()
 *
 * Note: 1) setRadius(double val) should set the radius = val;
 *       2) Area = PI * radius * radius
 *       
 * Step 2: Create a Triangle class (in a seperate file) which has a
 * private base and private height field.  The triangle should also  
 * implement the following methods:  
 *  public void setBase(double val)
 *  public void setHeight(double val)
 *  public double getArea()
 *
 * Note: 1) setBase(double val) should set base = val
 *       2) setHeight(double val) should set height = val
 *       3) Area = .5 * base * height
 *
 *
 * Step 3: Within the main() method of this class create a Circle and
 *  Triangle and set set their fields to values of your choice.
 *  Call the getArea() method on both objects to display their area. 
*/

public class C6L1_Shape
{
   public static void main(String[] args)
   {
     //Step 3:
     //Create your Circle and Triangle objects and then display the
     //area of each below
     Circle c1 = new Circle();
     c1.setRadius(10);
     
     Triangle t1 = new Triangle();
     t1.setBase(5);
     t1.setHeight(10);

     System.out.println("Area of circle object=" + c1.getArea());
     System.out.println("Area of triangle object=" + t1.getArea());
   }
   
}
