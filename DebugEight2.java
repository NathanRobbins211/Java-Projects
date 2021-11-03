// Application sums and averages an array of integers

public class DebugEight2
{
   public static void main(String args[])
   {
       // Create variables
      int[] someNums = {4, 17, 22, 8, 35};
      int tot = 0;

      // Add up sum and average numbers (in array)
      for(int x = 0; x < someNums.length; x++)
      {
         tot = tot + someNums[x];
      }

      // Print output
      System.out.println("Sum is " + tot);
      System.out.println("Average is " + tot * 1.0 / someNums.length);
   }
}
