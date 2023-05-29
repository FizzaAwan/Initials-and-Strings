
import java.util.Scanner;

/**
   A program reads in a string,
   prints out the last character of the string,
   followed by the first character, and then
   followed by the three middle character of the string.
   All input strings should be of odd length.
*/
public class StringGames
{
   public static void main (String[] args)
   {
      // Display prompt for input string
      System.out.println("Please enter a string: ");

      // Read string
      Scanner in = new Scanner(System.in);
      String input = in.next();
      
      int stringSize= input.length();
    

      // Put together new string and print
      String lChar = input.substring( stringSize -1,stringSize);
      String fChar = input.substring(0,1);
      int pos = stringSize/ 2; 
      String mChar= input.substring(pos-1,pos+2);
      
      // Your work here
      System.out.println("First character is " + fChar + " Last character is " + lChar + 
          " The three middle characters are " + mChar
      );

   }
}

