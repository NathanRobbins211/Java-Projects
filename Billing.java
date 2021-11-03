// Filename Billing.java
// Written by Nathan Robbins
// Written on 02/21/2021
/* This program asks the user for a price, quantity, and coupon.
* That information is run through 3 overloaded functions
* and then displayed for the user.
*/

// Import the Scanner class
import java.util.Scanner;

public class Billing
{
   public static void main(String args[])
   {
       // Create Scanner object
      Scanner inputDevice = new Scanner(System.in);

       // Create variables
      float flPrice;
      int intQuantity;
      float flCoupon;

      float flTotalOne;
      float flTotalTwo;
      float flTotalThree;
      
       // Prompt the user for input (price, quantity, coupon)
      System.out.print("What is the price of your item: $");
      flPrice = inputDevice.nextFloat();

      System.out.print("How many items are you buying: ");
      intQuantity = inputDevice.nextInt();

      System.out.print("What is the coupon value (%): ");
      flCoupon = inputDevice.nextFloat();
      System.out.println("");
      
       // Call all 3 functions
      flTotalOne = computeBill(flPrice);
      flTotalTwo = computeBill(flPrice, intQuantity);
      flTotalThree = computeBill(flPrice, intQuantity, flCoupon);
      
       // Round totals (multiply by 100, add 0.5, cast to integer, divide by 100)
      flTotalOne = (int) ((flTotalOne * 100) + 0.5);
      flTotalOne = flTotalOne / 100;

      flTotalTwo = (int) ((flTotalTwo * 100) + 0.5);
      flTotalTwo = flTotalTwo / 100;

      flTotalThree = (int) ((flTotalThree * 100) + 0.5);
      flTotalThree = flTotalThree / 100;

       // Display information
      System.out.println("Function #1 returns: $" + flTotalOne);
      System.out.println("Function #2 returns: $" + flTotalTwo);
      System.out.println("Function #3 returns: $" + flTotalThree);

   }
   public static float computeBill(float flPrice)
   {
       // Create variables
      final float SALES_TAX = 0.0825F;
      float flTotal;
      
       // Calculate
      flTotal = flPrice + (flPrice * SALES_TAX);
      return flTotal;
   }
   public static float computeBill(float flPrice, int intQuantity)
   {
       // Create variables
      final float SALES_TAX = 0.0825F;
      float flTotal;
      
       // Calculate
      flTotal = (flPrice * intQuantity) + ((flPrice * intQuantity) * SALES_TAX);
      return flTotal;
   }
   public static float computeBill(float flPrice, int intQuantity, float flCoupon)
   {
       // Create variables
      final float SALES_TAX = 0.0825F;
      float flTotal;
      
       // Calculate
      flTotal = ((flPrice * intQuantity) - ((flPrice * intQuantity) * (flCoupon * 0.01F)));
      flTotal = flTotal + (flTotal * SALES_TAX);
      return flTotal;
   }
}