// Filename VariableDemo.java
// Written by Nathan Robbins
// Written on 01/19/2021

// Import the Scanner class
import java.util.Scanner;

public class VariableDemo
{
 public static void main(String[] args)
 {
  // Create constant int
  final int THIS_IS_CONSTANT = 12; //Change 'int' to desired type
  
  // Create variable types
  byte aByte = 1;      // -128 to 127 (1 byte)
  short aShort = 2;    // -32_768 to 32_767 (2 bytes)
  int anInt = 4;       // -2_147_483_648 to 2_147_483_647 (4 bytes)
  long aLong = 8L;     // -9_223_372_036_854_775_808 to 9_223_372_036_854_775_808 (8 bytes)

  String aString = "Hello";   // "" is null
  boolean isThisTrue = (6 < 7); // Can be stored directly ('true'/'false')
  char aChar = 'N';             // Can be letter, digit, or symbol ('\' is an escape sequence) ['\n' = newline]['\t' = tab]

  // Create floating-point variables
  float aFloat = 1.1F;  // –3.4 * 10^38 to 3.4 * 10^38 (4 bytes)
  double aDouble = 2.2; // –1.7 * 10^308 to 1.7 * 10^308 (8 bytes)

  // Print on console
  System.out.println("The constant is " + THIS_IS_CONSTANT);
  System.out.println("The byte is " + aByte);
  System.out.println("The short is " + aShort);
  System.out.println("The int is " + anInt);
  System.out.println("The long is " + aLong);
  System.out.println("The string is " + aString);
  System.out.println("The float is " + aFloat);
  System.out.println("The double is " + aDouble);

  // Declare a 'Scanner' object as (programmer-chosen) inputDevice and connect it to the 'System.in' object (the default input device)
  Scanner inputDevice = new Scanner(System.in);
  // Input to console (if asking for a digit input then a string input, add an 'inputDevice.nextLine()' between to use up the 'Enter' key)
  String name;
  System.out.println("What is your name?");
  name = inputDevice.nextLine();
  System.out.println("Your name is " + name + ".");
 }
}