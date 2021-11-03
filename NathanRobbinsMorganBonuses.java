// Filename NathanRobbinsMorganBonuses.java
// Written by Nathan Robbins
// Course ITSE 2317-10z1
// Written on 04/20/2021
/* This program sets up a two-dimentional array,
* allows the user to continuously enter values:
* customer weeks worked [6 rows] and reviews [ 4 columns],
* and displays that element each time.
*/

// Import the Scanner class
import java.util.Scanner;

public class NathanRobbinsMorganBonuses {
   public static void main(String[] args)
   {
       // Create Scanner object and array
       Scanner inputDevice = new Scanner(System.in);
       float[][] arrBonuses = {
           {5.00F, 9.00F, 16.00F, 22.00F, 30.00F},
           {10.00F, 12.00F, 18.00F, 24.00F, 36.00F},
           {20.00F, 25.00F, 32.00F, 42.00F, 53.00F},
           {32.00F, 38.00F, 45.00F, 55.00F, 68.00F},
           {46.00F, 54.00F, 65.00F, 77.00F, 90.00F},
           {60.00F, 72.00F, 84.00F, 96.00F, 120.00F},
           {85.00F, 100.00F, 120.00F, 140.00F, 175.00F} };

       // Create variables
       int inputRow;        //6 weeks
       int inputColumn;     //4 reviews
       int isRunning = 0;

       System.out.println("Let's calculate a bonus!\n");

       // Start input loop
       do
       {
        // Ask for user input (row, column)
        System.out.print("Enter the number of full weeks worked (0-6), or 99 to quit: ");
        inputRow = inputDevice.nextInt();

        // Check user input for exit or out of bounds (array)
        if(inputRow == 99)
        {
            System.out.println("Goodbye!");
            return;
        }
        while(inputRow < 0 || inputRow > 6)
        {
            System.out.print("The number you entered was too large/small. Please retry: ");
            inputRow = inputDevice.nextInt();
        }

        System.out.print("Enter the number of positive reviews recieved (0-4): ");
        inputColumn = inputDevice.nextInt();

        // Check user input for out of bounds (array)
        while(inputColumn < 0 || inputColumn > 4)
        {
            System.out.print("The number you entered was too large/small. Please retry: ");
            inputColumn = inputDevice.nextInt();
        }

        // Print item in array
        System.out.print("The bonus would be: $");
        System.out.printf("%.2f", arrBonuses[inputRow][inputColumn]);
        System.out.print("\n\n");

       } while(isRunning != 1);
   }
}
