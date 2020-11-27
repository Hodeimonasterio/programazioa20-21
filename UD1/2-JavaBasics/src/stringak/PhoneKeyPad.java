package stringak;

import java.util.Scanner;

/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
public class PhoneKeyPad {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
      // Define variables
      String inStr;        // input String
      int inStrLen;        // length of the input String
      int i; 
      Scanner in = new Scanner(System.in);  // Scan the String 

      // Prompt and read input as "String"
      System.out.print("Enter a String: ");
      inStr = in.next().toLowerCase();   // use next() to read a String
      inStrLen = inStr.length();
   
      // Use inStr.charAt(index) in a loop to extract each character
      // The String's index begins at 0 from the left.
      // Process the String from the right
      for(i = 0 ; i < inStrLen ; ++i){
      switch (inStr.charAt(i)) {
   case 'a': case 'b': case 'c':  // No break for 'a' and 'b', fall thru 'c'
      System.out.print(2); break;
   case 'd': case 'e': case 'f':
      System.out.print(3); break;
   case 'g': case 'h': case 'i':
      System.out.print(4); break;
   case 'j': case 'k': case 'l':
       System.out.print(5); break;
   case 'm': case 'n': case 'o':
       System.out.print(6); break;
   case 'p': case 'q': case 'r': case 's':
       System.out.print(7); break; 
   case 't': case 'u': case 'v':
       System.out.print(8); break;
   case 'w': case 'x': case 'y': case 'z':
       System.out.print(9); break;
       
   default:
       
      } System.out.print("");
      
    }
  }
}
