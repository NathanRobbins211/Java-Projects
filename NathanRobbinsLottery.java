// Filename NathanRobbinsLottery.java
// Written by Nathan Robbins
// Written on 03/01/2021
/* This program generates 3 numbers (between 0 and 9),
* the user guesses 3 numbers,
* and those 6 numbers are displayed,
* along with a sum of money that the user won.
*/

// Import the Scanner and Random class
import java.util.Scanner;
import java.util.Random;

public class NathanRobbinsLottery {
    public static void main(String args[]) {
        // Create variables
        int numOne, numTwo, numThree;
        int randOne, randTwo, randThree;
        int moneyWon;
        
        // Create Scanner and Random object
        Scanner inputDevice = new Scanner(System.in);
        Random randomNumber = new Random();

        // Generate random numbers (three, between 0 and 9)
        randOne = randomNumber.nextInt(10);
        randTwo = randomNumber.nextInt(10);
        randThree = randomNumber.nextInt(10);

        // Prompt user for input (three numbers)
        System.out.print("Enter a number between 0 and 9: ");
        numOne = inputDevice.nextInt();
        System.out.print("Enter another number between 0 and 9: ");
        numTwo = inputDevice.nextInt();
        System.out.print("Enter a final number between 0 and 9: ");
        numThree = inputDevice.nextInt();
        
        // Calculate matches and money (call function)
        moneyWon = calculate(numOne, numTwo, numThree, randOne, randTwo, randThree);
        
        // Display calculations
        System.out.println("Numbers entered: " + numOne + " " + numTwo + " " + numThree);
        System.out.println("Numbers generated: " + randOne + " " + randTwo + " " + randThree);
        System.out.println("Money won: $" + moneyWon);
    }

public static int calculate(int numOne, int numTwo, int numThree, int randOne, int randTwo, int randThree)
   {
        // Create variables
        int moneyWon = 0;
        int matches = 0;
        int randZeros = 0, randOnes = 0, randTwos = 0, randThrees = 0, randFours = 0, randFives = 0, randSixes = 0, randSevens = 0, randEights = 0, randNines = 0;
        int numZeros = 0, numOnes = 0, numTwos = 0, numThrees = 0, numFours = 0, numFives = 0, numSixes = 0, numSevens = 0, numEights = 0, numNines = 0;

        // Check if order is correct ($1,000,000) and count how many of each number there are
        if(numOne == randOne && numTwo == randTwo && numThree == randThree)
            moneyWon = 1000000;
        else
            switch(numOne) {
                case 0: numZeros++; break;
                case 1: numOnes++; break;
                case 2: numTwos++; break;
                case 3: numThrees++; break;
                case 4: numFours++; break;
                case 5: numFives++; break;
                case 6: numSixes++; break;
                case 7: numSevens++; break;
                case 8: numEights++; break;
                case 9: numNines++; break; }
            switch(numTwo) {
                case 0: numZeros++; break;
                case 1: numOnes++; break;
                case 2: numTwos++; break;
                case 3: numThrees++; break;
                case 4: numFours++; break;
                case 5: numFives++; break;
                case 6: numSixes++; break;
                case 7: numSevens++; break;
                case 8: numEights++; break;
                case 9: numNines++; break; }
            switch(numThree) {
                case 0: numZeros++; break;
                case 1: numOnes++; break;
                case 2: numTwos++; break;
                case 3: numThrees++; break;
                case 4: numFours++; break;
                case 5: numFives++; break;
                case 6: numSixes++; break;
                case 7: numSevens++; break;
                case 8: numEights++; break;
                case 9: numNines++; break; }
            switch(randOne) {
                case 0: randZeros++; break;
                case 1: randOnes++; break;
                case 2: randTwos++; break;
                case 3: randThrees++; break;
                case 4: randFours++; break;
                case 5: randFives++; break;
                case 6: randSixes++; break;
                case 7: randSevens++; break;
                case 8: randEights++; break;
                case 9: randNines++; break; }
            switch(randTwo) {
                case 0: randZeros++; break;
                case 1: randOnes++; break;
                case 2: randTwos++; break;
                case 3: randThrees++; break;
                case 4: randFours++; break;
                case 5: randFives++; break;
                case 6: randSixes++; break;
                case 7: randSevens++; break;
                case 8: randEights++; break;
                case 9: randNines++; break; }
            switch(randThree) {
                case 0: randZeros++; break;
                case 1: randOnes++; break;
                case 2: randTwos++; break;
                case 3: randThrees++; break;
                case 4: randFours++; break;
                case 5: randFives++; break;
                case 6: randSixes++; break;
                case 7: randSevens++; break;
                case 8: randEights++; break;
                case 9: randNines++; break; }

            // Count the matches
            if(numZeros == randZeros)
                matches = matches + numZeros;
            else
                if(numZeros < randZeros)
                    matches = matches + numZeros;
                else
                    if(numZeros > randZeros)
                        matches = matches + randZeros;
            if(numOnes == randOnes)
                matches = matches + numOnes;
            else
                if(numOnes < randOnes)
                    matches = matches + numOnes;
                else
                    if(numOnes > randOnes)
                        matches = matches + randOnes;
            if(numTwos == randTwos)
                matches = matches + numTwos;
            else
                if(numTwos < randTwos)
                    matches = matches + numTwos;
                else
                    if(numTwos > randTwos)
                        matches = matches + randTwos;
            if(numThrees == randThrees)
                matches = matches + numThrees;
            else
                if(numThrees < randThrees)
                    matches = matches + numThrees;
                else
                    if(numThrees > randThrees)
                        matches = matches + randThrees;
            if(numFours == randFours)
                matches = matches + numFours;
            else
                if(numFours < randFours)
                    matches = matches + numFours;
                else
                    if(numFours > randFours)
                        matches = matches + randFours;
            if(numFives == randFives)
                matches = matches + numFives;
            else
                if(numFives < randFives)
                    matches = matches + numFives;
                else
                    if(numFives > randFives)
                        matches = matches + randFives;
            if(numSixes == randSixes)
                matches = matches + numSixes;
            else
                if(numSixes < randSixes)
                    matches = matches + numSixes;
                else
                    if(numSixes > randSixes)
                        matches = matches + randSixes;
            if(numSevens == randSevens)
                matches = matches + numSevens;
            else
                if(numSevens < randSevens)
                    matches = matches + numSevens;
                else
                    if(numSevens > randSevens)
                        matches = matches + randSevens;
            if(numEights == randEights)
                matches = matches + numEights;
            else
                if(numEights < randEights)
                    matches = matches + numEights;
                else
                    if(numEights > randEights)
                        matches = matches + randEights;
            if(numNines == randNines)
                matches = matches + numNines;
            else
                if(numNines < randNines)
                    matches = matches + numNines;
                else
                    if(numNines > randNines)
                        matches = matches + randNines;

        // Add the money
        switch(matches) {
            case 1: moneyWon = 10; break;
            case 2: moneyWon = 100; break;
            case 3: moneyWon = 1000; break;
        }
        return moneyWon;
   }
}