import java.util.Scanner;
public class DebugNine4
{
   enum Planet {MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE};

   public static void main(String[] args)
   {
       // Create variables
      Planet planet;
      String userEntry;
      int comparison;
      int position;
      Scanner input = new Scanner(System.in);

      // Ask for user input
      System.out.print("Enter a planet in our solar system >> ");
      userEntry = input.nextLine().toUpperCase();

      // Display
      planet = Planet.valueOf(userEntry);
      System.out.println("You entered " + planet);

      // Find position and display
      position = planet.ordinal();
      System.out.println(planet + " is " + (position + 1) + " planet(s) from the sun");
   }
}
