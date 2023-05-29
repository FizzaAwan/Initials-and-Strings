
import java.util.Scanner;

/**
   A program that reads in a first name, a middle name, and a last name,
      and then print out the three initials as a single string.
   For example, if the three input names are James, Paul, and Jones,
      then the output should be JPJ.// initials
*/
public class Initials
{
   public static void main (String[] args)
   {
      // Display prompts for all three names
      System.out.println("Please enter first name, middle name, last name: ");

      // Read names
      Scanner in = new Scanner(System.in);  // initate scanner to print, 
      String name = in.nextLine();
      String[] nameArray = name.split(", ");
      
      String fname = nameArray[0];
      String mname = nameArray[1];
      String lname = nameArray[2];
      
      String firstIn = fname.substring(0,1);
      String middleIn = mname.substring(0,1);
      String lastIn = lname.substring(0,1);
      // Your work here
      
      // Print out the initials 
      System.out.println("These are your initials " + firstIn+ middleIn +lastIn );
      // Your work here

   }
}