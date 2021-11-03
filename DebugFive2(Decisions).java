// DebugFive2.java
// Decides if two numbers are evenly divisible

import java.util.*;

public class DebugFive2
{
   public static void main(String args[])
   {
      // Create variables
      int num;
      int num2;
      // Create Scanner object
      Scanner input = new Scanner(System.in);

      // Ask for user input
      System.out.print("Enter a number ");
      num = input.nextInt();
      System.out.print("Enter another number ");
      num2 = input.nextInt();

      // Calculate and print
      if((num % num2 == 0) || (num2 % num) == 0)
         System.out.println("One of these numbers is evenly divisible into the other.");
      else
         System.out.println("Neither of these numbers is evenly divisible into the other.");
   }

}