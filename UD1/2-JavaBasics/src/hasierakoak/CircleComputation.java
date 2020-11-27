package hasierakoak;

import java.util.Scanner;   // For keyboard input
/**
 * 1. Prompt user for 2 integers
 * 2. Read inputs as "int"
 * 3. Compute their sum in "int"
 * 4. Print the result
 */
public class CircleComputation {  // Save as "Add2Integers.java"
   public static void main (String[] args) {
      // Declare variables
      double radius, diameter, circumference, area;  // inputs and results - all in double
      double Pi = 3.14;
       Scanner in = new Scanner(System.in);  // Scan the keyboard

      // Prompt and read inputs as "double"
      System.out.print("Enter the radius: ");
      radius = in.nextDouble();  // read input as double // read input as double
      // Compute in "double"
      
      diameter = 2.0 * radius;
      area = Pi * radius * radius;
      circumference = 2.0 * Pi *radius;
      

      // Print results using printf() with the following format specifiers:
      //   %.2f for a double with 2 decimal digits
      //   %n for a newline
      System.out.printf("Diameter is: %.2f%n", diameter);
      System.out.println("Area is: " + area);
       System.out.println("Circumference is: " + circumference);
   } 
}
      

