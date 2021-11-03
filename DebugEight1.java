// Application lists valid shipping codes
// then prompts user for a code
// Application accepts a shipping code
// and determines if it is valid

import java.util.*;

public class DebugEight1
{
   public static void main(String args[])
   {
      // Create new Scanner object
      Scanner input = new Scanner(System.in);
      // Create variables
      char userCode;
      String entry, message;
      boolean found = false;
      char[] okayCodes = {'A','C','T','H'};
      StringBuffer prompt = new StringBuffer("Enter shipping code for this delivery\nValid codes are: ");

      // List valid codes
      for(int x = 0; x < okayCodes.length; ++x)
      {
          prompt.append(okayCodes[x]);
          if(x != (okayCodes.length - 1)) { prompt.append(", "); }
      }

      // Ask for user input
      System.out.println(prompt);
      entry = input.next();
      userCode = entry.charAt(0);

      // Check input
      for(int i = 0; i < okayCodes.length; ++i)
      {
         if(userCode == okayCodes[i]) { found = true; }
      }

      // Display output ( code found / not found)
      if(found) { message = "Good code"; }
      else { message = "Sorry code not found"; }
      System.out.println(message);
   }
}
