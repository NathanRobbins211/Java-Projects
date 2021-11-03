// Filename NathanRobbinsMenu.java
// Written by Nathan Robbins
// Course ITSE 2317-10z1
// Written on 03/18/2021
/* Program starts on a menu with 3 choices: Factorials, Perfect Numbers, and Exit
* User inputs '1', '2', or '3'
* Program then asks the user for input to give a respective output
* Program asks user to do it again or return to menu
*/

// Import the Scanner class
import java.util.Scanner;

public class NathanRobbinsMenu {
    public static void main(String args[]) {
        // Create variables
        int intChoice = 0;
        
        // Start menu loop
        do {
            // Display menu (call function)
            intChoice = menu();

            // Choose, calculate, and display (call functions)
            switch(intChoice) {
                case 1: factorials(); break;
                case 2: perfectNumbers(); break;
                case 3: intChoice = 3; break;
            }

            // Reset loop if not Exit (3)
            if(intChoice != 3) { intChoice = 0; }
        } while(intChoice == 0);
        System.out.println("Goodbye!");
    }

    public static int menu()
    {
        // Create Scanner object and variables
        Scanner inputDevice = new Scanner(System.in);
        int intChoice = 0;

        // Display menu and take input
        System.out.println("--- MENU ---");
        System.out.println("Press '1' for a factorial.");
        System.out.println("Press '2' for perfect numbers.");
        System.out.println("Press '3' to exit.");
        System.out.print("Input: ");
        intChoice = inputDevice.nextInt();
        return intChoice;
    }

    public static void factorials()
    {
        // Create Scanner object and variables
        Scanner inputDevice = new Scanner(System.in);
        int intCondition = 0;
        int intInput;
        int intProduct;

        // Start loop
        System.out.println("");
        System.out.println("--- FACTORIALS ---");
        do {
            // Reset loop variables
            intInput = 0;
            intProduct = 1;
            // Get input
            System.out.print("Enter an integer to find it's factorial: ");
            intInput = inputDevice.nextInt();
            // Calculate
            for(int i = intInput; i > 0; i--)
            {
                intProduct = intProduct * i;
            }
            // Display
            System.out.println("The factorial is: " + intProduct);
            System.out.print("Enter '0' to find another factorial. Enter any other integer to return to the menu: ");
            intCondition = inputDevice.nextInt();
        } while(intCondition == 0);

        // Exit back to menu
        System.out.println(""); return;
    }
    public static void perfectNumbers()
    {
        // Create Scanner object and variables
        Scanner inputDevice = new Scanner(System.in);
        int intCondition = 0;
        int intInput;
        int intProduct;

        // Start loop
        System.out.println("");
        System.out.println("--- PERFECT NUMBERS ---");
        do {
            // Reset loop variables
            intInput = 0;
            intProduct = 1;
            // Get input
            System.out.print("Enter an integer to find perfect numbers: ");
            intInput = inputDevice.nextInt();
            System.out.println("The perfect numbers between 1 and " + intInput + " are...");

            // Calculate and display all perfect numbers
            for(int intCounter = 1; intCounter <= intInput; intCounter++)
            {
                intProduct = 0;
                for(int i = 1; i <= intCounter/2; i++) {
                    if(intCounter % i == 0) {
                        intProduct = intProduct + i;
                    }
                }
                if(intProduct == intCounter )
                {
                    System.out.println(intCounter);
                }
            }

            System.out.print("Enter '0' to find more perfect numbers. Enter any other integer to return to the menu: ");
            intCondition = inputDevice.nextInt();
        } while(intCondition == 0);

        // Exit back to menu
        System.out.println(""); return;
    }
}
