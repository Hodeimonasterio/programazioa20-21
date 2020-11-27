package hasierakoak;

/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
public class SumAverageWhiledoRunningInt {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
      // Define variables
     int sum = 0;
     int lowerbound = 1;
      int number = lowerbound;
      double average;
      int upperbound = 100;// declare and init loop index variable
      while (number <= upperbound) {  // test
         sum += number;
         ++number;                    // update
      }
      // Compute average in double. Beware that int / int produces int!
      average = (double)sum / upperbound ; 
      // Print sum and average
       System.out.println("The sum of 1 to 100 is" + sum);
     System.out.println("The average is" + average);
       
             
   }
}
