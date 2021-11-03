// Filename MeadowdaleEggs.java
// Written by Nathan Robbins
// Course ITSE 2317-10z1
// Written on 01/26/2021
/* This program asks the user for an amount of eggs,
* adds the cost of the eggs,
* and then displays the cost and amount data.
*/

// Import the Scanner class
import java.util.Scanner;

public class MeadowdaleEggs {
    public static void main(String args[]) {
        // Create variables
        final float COST_PER_DOZEN = 3.25F;
        final float COST_PER_EGG = 0.45F;
        int totalEggsOrdered = 0;
        int remainingEggs = 0;
        int eggsInADozen = 0;
        int dozenEggs = 0;

        float costDozen = 0F;
        float costLoose = 0F;
        float costTotal = 0F;

        // Create Scanner object
        Scanner inputDevice = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Welcome to the Meadowdale Dairy Farm!");
        System.out.println("How many eggs would you like to order?");
        totalEggsOrdered = inputDevice.nextInt();

        // Calculate
        remainingEggs = totalEggsOrdered % 12;                //Get the extra eggs
        eggsInADozen = totalEggsOrdered - remainingEggs;      //Get the multiple of 12
        dozenEggs = eggsInADozen / 12;                        //Get how many dozens

        costDozen = COST_PER_DOZEN * dozenEggs;               //Get cost of dozens
        costLoose = COST_PER_EGG * remainingEggs;             //Get cost of extra eggs
        costTotal = (dozenEggs * COST_PER_DOZEN) + costLoose; //Get total cost

        // Round costs (multiply by 100, add 0.5, cast to integer, divide by 100)
        costDozen = (int) ((costDozen * 100) + 0.5);
        costDozen = costDozen / 100;

        costLoose = (int) ((costLoose * 100) + 0.5);
        costLoose = costLoose / 100;
        
        costTotal = (int) ((costTotal * 100) + 0.5);
        costTotal = costTotal / 100;

        // Display calculations
        System.out.println("Thank you for ordering " + totalEggsOrdered + " eggs!");
        System.out.println("That will be $" + costDozen + " for " + dozenEggs + " dozen eggs at $" + COST_PER_DOZEN + " per dozen.");
        System.out.println("And $" + costLoose + " for " + remainingEggs + " loose eggs at " + COST_PER_EGG + " cents each.");
        System.out.println("The total cost will be $" + costTotal + ".");
    }
}