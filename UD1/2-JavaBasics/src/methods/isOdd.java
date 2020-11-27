package methods;
import java.util.Scanner;
public class isOdd {
   public static void main(String[] args) {
      // Declare variables
      int num;    // exponent (non-negative integer)
     
      Scanner in = new Scanner(System.in);
      // Prompt and read exponent and base
      System.out.print("Enter a number:");
      num = in.nextInt();
     
      // Print result
      if ( num % 2 == 0 ) {
         System.out.println(num + " is an even number" );   // even number
      } else {
         System.out.println(num+  " is an odd number" );   // odd number
      }
       
   }

   
   public static boolean isOdd(int number) {
       
   
       if(number % 2 ==0){
           return true; 
       }else{
           return false;
       }
   }
}
   
  
   
   
  

