package arrayak;
import java.util.Scanner;

public class PrintArrayInStars {  // Save as "Add2Integers.java"
   public static void main (String[] args) {
      // Declare variables
  int numItems;
      int[] items;  // Declare array name, to be allocated after numItems is known
      Scanner in = new Scanner(System.in);
      
       // Prompt for for the number of items and read the input as "int"
       System.out.print("Enter the number of items: ");
      numItems = in.nextInt();
      // Allocate the array
      items = new int[numItems];

      // Print array in "index: number of stars" using a nested-loop
      if (items.length > 0) {
         System.out.print("Enter the value of all items (separated by space): ");
         for ( int i=0; i < items.length; ++i) {  // Read all items
             items[i] = in.nextInt();
         }
      }
      // Take note that rows are the array indexes and columns are the value in that index
      for (int idx = 0; idx < items.length; ++idx) {  // row
         System.out.print(idx + ": ");
         // Print value as the number of stars
         for (int starNo = 1; starNo <= items[idx]; ++starNo) {  // column
            System.out.print("*");
         }
          System.out.println("(" + items[idx] + ")");
         
      }}}
      