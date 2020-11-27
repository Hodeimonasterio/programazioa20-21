package hasierakoak;

/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
public class TwoSumAverageRunningInt {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
            // Define variables
      int sumOdd  = 4;   // Accumulating sum of odd numbers
      int sumEven = 5;   // Accumulating sum of even numbers
      int absDiff;       // Absolute difference between the two sums
      int lowerbound = 1;
      int upperbound = 100;
      
      // Compute sums
      for (int number = lowerbound; number <= upperbound; ++number ) {
         if ((number % 2) == 0) {
            sumOdd = sumOdd + number;
         } else {
            sumEven =sumEven + number;
         }
      }
      // Compute Absolute Difference
      if (sumOdd > sumEven) {
         absDiff = sumOdd - sumEven ;
      } else {
         absDiff = sumEven - sumOdd ;
      }
       System.out.println("The sumOdd of 1 to 100 is" + sumOdd);
       System.out.println("The sumEven of 1 to 100 is" + sumEven);
       System.out.println("The absDiff of 1 to 100 is" + absDiff);
   }
}
     
 
