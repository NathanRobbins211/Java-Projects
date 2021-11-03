// Filename NathanRobbinsGuessingGame.java
// Written by Nathan Robbins
// Course ITSE 2317-10z1
// Written on 04/04/2021
/* Program is similar to a Hangman game.
* Program displays a random phrase with only some? letters shown (everything else is '*').
* User enters a letter:
* - Program reveals the respective letter(s) in phrase if correct.
* - Program displays message if wrong.
* Program displays winning message if phrase is completed.
*/

// Import the Scanner and Random class
import java.util.Scanner;
import java.util.Random;

public class NathanRobbinsGuessingGame {
    public static void main(String args[])
    {
        // Create Scanner and Random object
        Scanner inputDevice = new Scanner(System.in);
        Random randomNumber = new Random();
        // Create variables
        String secretPhrase = "";
        String hiddenPhrase = "";
        String userInput = "";
        char input;
        char charCheck;
        int currentAsters = 0;
        int prevAsters = 0;
        boolean isPhraseComplete = false;
        int isPlayAgain = 0;
        
        // Start game loop
        do {
            // Generate secret phrase
            int randNum = randomNumber.nextInt(6); //number between 0 and 5
            secretPhrase = createPhrase(randNum);

            // Hide phrase and display it
            for(int i = 0; i < secretPhrase.length(); i++)
            {
                charCheck = secretPhrase.charAt(i); //grab each char
                if(charCheck != ' ')
                {
                    hiddenPhrase += "*";
                } else { hiddenPhrase += " "; }
            }
            System.out.println(" ");
            System.out.println("\t" + "Below is your randomly selected secret phrase:");
            System.out.println("\t\t\t" + hiddenPhrase);

            // Start phrase loop
            do {
                // Count asters (see if any letters were correct)
                for(int i = 0; i <= hiddenPhrase.length() - 1; i++)
                {
                    if(hiddenPhrase.charAt(i) == '*') { prevAsters++; }
                }

                // Ask user for input
                System.out.println(" ");
                System.out.println("Enter a letter or group of letters you think might be in the phrase: ");
                userInput = inputDevice.nextLine();


                // Go through userInput (sending chars to method), replacing each one at a time, then displaying
                for(int i = 0; i < userInput.length(); i++)
                {
                    input = userInput.charAt(i); //grab each char
                    if(input != ' ')
                    {
                        // Replace phrase with exception chars
                        secretPhrase = secretPhrase.replace(input, '~');
                        // Give exception chars to hidden phrase
                        hiddenPhrase = hide(1, secretPhrase, 'x');
                        // Replace exception chars in hidden phrase
                        hiddenPhrase = hiddenPhrase.replace('~', input);
                        // Convert to CAPS so not replaced (BOTH PHRASES)
                        hiddenPhrase = hide(2, hiddenPhrase, 'x');
                        secretPhrase = hide(3, secretPhrase, input);
                    }
                }
                System.out.println("\t\t\t" + hiddenPhrase);

                // Check to see if phrase is finished
                for(int i = 0; i <= hiddenPhrase.length() - 1; i++)
                {
                    if(hiddenPhrase.charAt(i) == '*') { currentAsters++; }
                }

                // Display message and reset requirements
                if(currentAsters <= 0) { isPhraseComplete = true; System.out.println("You completed the phrase!"); }
                else if(currentAsters >= prevAsters) { System.out.print("Sorry, no letters matched."); }
                else { System.out.println("You got some. Keep going!"); }
                prevAsters = 0;
                currentAsters = 0;
                userInput = "";

            } while(isPhraseComplete == false);

            // Reset variables to possibly play again
            isPhraseComplete = false;
            secretPhrase = "";
            hiddenPhrase = "";
            System.out.print("Would you like to play again? Press '0' to play again, another number to quit: ");
            isPlayAgain = inputDevice.nextInt();

        } while (isPlayAgain == 0);
        System.out.println("Goodbye!");
    }

    public static String createPhrase(int randNum)
    {
        // Create variables
        String secretPhrase = "";
        String phrase0 = "game over";
        String phrase1 = "x marks the spot";
        String phrase2 = "no i in team";
        String phrase3 = "son of a gun";
        String phrase4 = "broke as a joke";
        String phrase5 = "all is fair in love and war";

        // Pick a secret phrase
        switch(randNum) {
            case 0: secretPhrase = phrase0; break;
            case 1: secretPhrase = phrase1; break;
            case 2: secretPhrase = phrase2; break;
            case 3: secretPhrase = phrase3; break;
            case 4: secretPhrase = phrase4; break;
            case 5: secretPhrase = phrase5; break;
        }
        return secretPhrase;
    }

    public static String hide(int letterCase, String phrase, char letter)
    {
        switch(letterCase) {
            case 1:
                // Replace phrase with '*'s
                phrase = phrase.replace('a', '*');
                phrase = phrase.replace('b', '*');
                phrase = phrase.replace('c', '*');
                phrase = phrase.replace('d', '*');
                phrase = phrase.replace('e', '*');
                phrase = phrase.replace('f', '*');
                phrase = phrase.replace('g', '*');
                phrase = phrase.replace('h', '*');
                phrase = phrase.replace('i', '*');
                phrase = phrase.replace('j', '*');
                phrase = phrase.replace('k', '*');
                phrase = phrase.replace('l', '*');
                phrase = phrase.replace('m', '*');
                phrase = phrase.replace('n', '*');
                phrase = phrase.replace('o', '*');
                phrase = phrase.replace('p', '*');
                phrase = phrase.replace('q', '*');
                phrase = phrase.replace('r', '*');
                phrase = phrase.replace('s', '*');
                phrase = phrase.replace('t', '*');
                phrase = phrase.replace('u', '*');
                phrase = phrase.replace('v', '*');
                phrase = phrase.replace('w', '*');
                phrase = phrase.replace('x', '*');
                phrase = phrase.replace('y', '*');
                phrase = phrase.replace('z', '*');
                break;
            case 2:
                // Replace phrase with CAPS
                phrase = phrase.replace('a', 'A');
                phrase = phrase.replace('b', 'B');
                phrase = phrase.replace('c', 'C');
                phrase = phrase.replace('d', 'D');
                phrase = phrase.replace('e', 'E');
                phrase = phrase.replace('f', 'F');
                phrase = phrase.replace('g', 'G');
                phrase = phrase.replace('h', 'H');
                phrase = phrase.replace('i', 'I');
                phrase = phrase.replace('j', 'J');
                phrase = phrase.replace('k', 'K');
                phrase = phrase.replace('l', 'L');
                phrase = phrase.replace('m', 'M');
                phrase = phrase.replace('n', 'N');
                phrase = phrase.replace('o', 'O');
                phrase = phrase.replace('p', 'P');
                phrase = phrase.replace('q', 'Q');
                phrase = phrase.replace('r', 'R');
                phrase = phrase.replace('s', 'S');
                phrase = phrase.replace('t', 'T');
                phrase = phrase.replace('u', 'U');
                phrase = phrase.replace('v', 'V');
                phrase = phrase.replace('w', 'W');
                phrase = phrase.replace('x', 'X');
                phrase = phrase.replace('y', 'Y');
                phrase = phrase.replace('z', 'Z');
                break;
            case 3:
                switch(letter)
                {
                    case 'a': phrase = phrase.replace('~', 'A'); break;
                    case 'b': phrase = phrase.replace('~', 'B'); break;
                    case 'c': phrase = phrase.replace('~', 'C'); break;
                    case 'd': phrase = phrase.replace('~', 'D'); break;
                    case 'e': phrase = phrase.replace('~', 'E'); break;
                    case 'f': phrase = phrase.replace('~', 'F'); break;
                    case 'g': phrase = phrase.replace('~', 'G'); break;
                    case 'h': phrase = phrase.replace('~', 'H'); break;
                    case 'i': phrase = phrase.replace('~', 'I'); break;
                    case 'j': phrase = phrase.replace('~', 'J'); break;
                    case 'k': phrase = phrase.replace('~', 'K'); break;
                    case 'l': phrase = phrase.replace('~', 'L'); break;
                    case 'm': phrase = phrase.replace('~', 'M'); break;
                    case 'n': phrase = phrase.replace('~', 'N'); break;
                    case 'o': phrase = phrase.replace('~', 'O'); break;
                    case 'p': phrase = phrase.replace('~', 'P'); break;
                    case 'q': phrase = phrase.replace('~', 'Q'); break;
                    case 'r': phrase = phrase.replace('~', 'R'); break;
                    case 's': phrase = phrase.replace('~', 'S'); break;
                    case 't': phrase = phrase.replace('~', 'T'); break;
                    case 'u': phrase = phrase.replace('~', 'U'); break;
                    case 'v': phrase = phrase.replace('~', 'V'); break;
                    case 'w': phrase = phrase.replace('~', 'W'); break;
                    case 'x': phrase = phrase.replace('~', 'X'); break;
                    case 'y': phrase = phrase.replace('~', 'Y'); break;
                    case 'z': phrase = phrase.replace('~', 'Z'); break;
                }
                break;
        }
            return phrase;
    }
}
