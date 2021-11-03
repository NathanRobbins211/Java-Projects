// Program prompts user to enter a series of integers separated by spaces
// Program converts them to numbers and sums them
import java.util.*;
public class DebugSeven2
{
   public static void main(String[] args)
   {
      // Create scanner object
      Scanner in = new Scanner(System.in);
      // Create variables
      String str;
      String partStr;
      int x;
      int length;
      int start;
      int num;
      int lastSpace = -1;
      int sum = 0;

      // Ask for input
      System.out.print("Enter a series of integers separated by spaces >> ");
      str = in.nextLine();
      length = str.length();

      // Calculate and print
      for(x = 0; x <= length - 1; ++x)
      {
         if(str.charAt(x) == ' ')
         {
             partStr = str.substring(lastSpace + 1, x);     
             num = Integer.parseInt(partStr);
             System.out.println("                " + num);
             sum += num;
             lastSpace = x;
          } 
      }

      // Calculate and print
      partStr = str.substring(lastSpace + 1, length);
      num = Integer.parseInt(partStr);
      System.out.println("                " + num);
      sum += num;
      System.out.println("         -------------------" +
         "\nThe sum of the integers is " + sum);
   }
}