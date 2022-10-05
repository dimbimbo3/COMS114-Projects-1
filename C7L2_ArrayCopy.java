/*
 * In this lab you will set (write) the elements of an array, access (read)
 * the elements of an array and copy the elements of an array into a
 * new array.
 * 1) Create a main method within this class and then create an 
 *    integer array of size 10;
 * 2) Populate the integer array with 10 random integers using the
 *    Random class in the java.util package.  Note: The method you
 *    will need to execute is called nextInt(). For example:
 *    Random rand = new Random();
 *    int num = rand.nextInt();
 * 3) Next, create a method in this class called copyArray(int[] source) 
 *    that will make a copy of the source array passed as a parameter
 *    and then display the contents of both arrays.  They should
 *    be identical.  Use the format specified below where "source" is the
 *    array passed as a parameter and "copy" is the duplicate of "source":
 *    Source            Copy
 *    ----------------- -----------------
 *    source[0] = 123   copy[0] = 123
 *    source[1] = -8556 copy[1] = -8556
 *    source[2] = 2354  copy[2] = 2354
 *    etc...
 * 4) Call the copyArray() method from step #3 above by passing the array
 *    created in step #1 and populated in step #2.
 * 5) Added challenge: after completing the lab modify the implementation
 *    of the copyArray() method by copying the source array into the copy 
 *    in reverse order.
 */
import java.util.Random;
public class C7L2_ArrayCopy {
public static void main(String[] args){
    int[] array = new int[10];
    Random rand = new Random();
        for(int i = 0; i < array.length; i++)
            array[i] = rand.nextInt(101);
        
        System.out.println("Source\n------------------------\n");
        for(int i = 0; i < array.length; i++)
            System.out.println("source[" + i + "] =" + array[i]);
        int[] array2 = copyArray(array);
        System.out.println("\nCopy\n------------------------\n");
        for(int i = 0; i < array2.length; i++)
            System.out.println("[" + i + "] = " + array2[i]);
    
}
    public static int[] copyArray(int[] array){
        int[] copy = new int[array.length];
        for(int i = 0; i < array.length; i++){
            copy[i] = array[i];
        }
        return copy;
    }

}
