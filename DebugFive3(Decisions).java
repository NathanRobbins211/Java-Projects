// DebugFive3.java
// Determines whether item number on order is valid
// Over 999 invalid
// Less than 111 Invalid
// Valid and less than 500 - Automotive Department
// Valid and 500 or higher Housewares Department

import java.util.*;

public class DebugFive3
{
   public static void main (String args[])
   {
      // Create variables
      int item;
      String output;
      final int LOW = 111;
      final int HIGH = 999;
      final int CUTOFF = 500;
      // Create Scanner object
      Scanner input = new Scanner(System.in);

      // Ask for user input
      System.out.println("Please enter item number:");
      item = input.nextInt();

      // Calculate
      if(item < LOW)
         output = "Item number too low.";
      else
        if(item > HIGH)
          output = "Item number too high";
        else
          if(item < CUTOFF)
             output = "Valid - in Automotive Department";
          else
             output = "Valid - Item in Housewares Department";
       System.out.println(output);
   }
}