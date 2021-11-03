// Application contains a starting list of three products for sale
// The user is prompted for additional items
// After each new entry, the alphabetically sorted list is displayed
import java.util.*;
public class DebugNine3
{
   public static void main(String[] args)
   {
      // Create variables
      ArrayList products = new ArrayList<String>();
      products.add("shampoo");
      products.add("moisturizer");
      products.add("conditioner");
      Collections.sort(products);
      display(products);
      final String QUIT = "quit";
      String entry;
      Scanner input = new Scanner(System.in);

      // Ask for user input
      System.out.print("\nEnter a product or " + QUIT + " to quit >> ");
      entry = input.nextLine();

      // Sort
      while(!entry.equals("quit"))
      {
         products.add(entry);
         Collections.sort(products);
         display(products);
         System.out.print("\nEnter a product or " + QUIT + " to quit >> ");
         entry = input.nextLine();
      }
   }

   // Custom method to display
   public static void display(ArrayList products)
   {
      System.out.println("\nThe size of the list is " + products.size());
      for(int x = 0; x < products.size(); ++x)
         System.out.println(products.get(x));
   }
}
