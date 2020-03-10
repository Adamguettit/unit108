//Created by: Adam Guettit
//Created on: Feb 12
// Unit 1-02
// Mr. Coxall (ICS4U)

// This program is supposed to ask the user for the size of his logs and then it will print out the
// the number of logs he carry on his truck


import java.util.Scanner;

class MaxMin {
  
  private static Scanner input;

  public static void main(String[]args) {

    input = new Scanner(System.in);

    // Defining variables:
    double logSize;
    //double weight = 20;
    //double answer;

    // Asking for user input and storing it into "double each":
    System.out.println("Ener the lengh of logs in meters. (0.25, 0.5, 1)");
    logSize = input.nextDouble();
    
    // Asking for user input and storing it into "double each":
    System.out.println("");
    logSize = input.nextDouble();

    // Calculations:
    answer = 1100 / weight / logSize;

    // Printing the answer:
    System.out.println("The answer is: " + answer + " logs");

  }
}