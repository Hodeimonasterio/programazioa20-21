package hasierakoak;

/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
public class SumAveragedoWhileRunningInt {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
      // Define variables
        int sum = 0;
         double average;
        int lowerbound = 1;
      int number = lowerbound;         // declare and init loop index variable
      int upperbound = 100;
      do {
         sum += number;
         ++number;                     // update
      } while (number <= upperbound);  // test
    
      // Compute average in double. Beware that int / int produces int!
      average = (double)sum / upperbound ; 
      // Print sum and average
       System.out.println("The sum of 1 to 100 is" + sum);
     System.out.println("The average is" + average);
       
             
   }
}
