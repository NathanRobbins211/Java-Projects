// Filename VariableDemo.java
// Written by Nathan Robbins
// Written on 01/19/2021

// Import Scanner class and JOptionPane
import java.util.Scanner;
import javax.swing.JOptionPane;

public class DialogDemo
{
 public static void main(String[] args)
 {
  // Ask for an input
  String result;
  result = JOptionPane.showInputDialog(null, "What is your name?", "DialogBox Title", JOptionPane.QUESTION_MESSAGE);
  JOptionPane.showMessageDialog(null, "Hello, " + result + "!");

  // Ask for a YES or NO
  JOptionPane.showConfirmDialog(null, "Question goes here.", "DialogBox Title", YES_NO_CANCEL_OPTION, QUESTION_MESSAGE);

 }
}