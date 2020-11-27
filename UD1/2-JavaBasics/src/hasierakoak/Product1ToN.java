package hasierakoak;

/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
public class Product1ToN {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
  // Define variables
      int product = 1;      // The accumulated product, init to 1
      int lowerbound = 1;
      int upperbound = 10;
      
      
      for (int number = lowerbound ; number <= upperbound ; ++number  ){
              
         
         product = product * number;     
      
      }
       System.out.println("Product" + product);
     
   }
}
      
      
      
      
      
      

   
   
   
   
   
      