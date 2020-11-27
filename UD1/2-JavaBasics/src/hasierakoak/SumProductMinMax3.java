package hasierakoak;

import java.util.Scanner;   // For keyboard input
/**
 * 1. Prompt user for 2 integers
 * 2. Read inputs as "int"
 * 3. Compute their sum in "int"
 * 4. Print the result
 */
public class SumProductMinMax3 {  // Save as "Add2Integers.java"
   public static void main (String[] args) {
      // Declare variables
       int number1, number2, number3;  // The 3 input integers
      int sum, product, min, max;     // To compute these
      Scanner in = new Scanner(System.in);  // Scan the keyboard
      
      // Prompt and read inputs as "int"
       System.out.print("Enter 1st integer:");
      number1 = in.nextInt();
       System.out.print("Enter 2nd integer:");
      number2 = in.nextInt();
       System.out.print("Enter 3rd inetger:");
      number3 = in.nextInt();
      
      // Compute sum and product
      
      sum = number1 + number2 + number3;
      product = number1 * number2 * number3;

      // Compute min
      // The "coding pattern" for computing min is:
      // 1. Set min to the first item
      // 2. Compare current min with the second item and update min if second item is smaller
      // 3. Repeat for the next item
      min = number1;        // Assume min is the 1st item
      if (number2 < min) {  // Check if the 2nd item is smaller than current min
         min = number2;     // Update min if so
      }
      if (number3 < min) {  // Continue for the next item
         min = number3;
      }
      
      // Compute max - similar to min
      max = number1;        // Assume min is the 1st item
      if (number2 > max) {  // Check if the 2nd item is smaller than current min
         max = number2;     // Update min if so
      }
      if (number3 > max) {  // Continue for the next item
         max = number3;
      }
      
      // Print results
      System.out.println("The sum is: " + sum);
       System.out.println("The product is: " + product);
        System.out.println("The min is: " + min);
         System.out.println("The max is: " + max);
       
   }
}
