package arrayak;
import java.util.Scanner;

public class GradesStatistics {  // Save as "Add2Integers.java"
   public static void main (String[] args) {
      // Declare variables
  int numItems;
  int average;
      int[] items;  // Declare array name, to be allocated after numItems is known
      Scanner in = new Scanner(System.in);
      
       // Prompt for for the number of items and read the input as "int"
       System.out.print("Enter the number of students: ");
      numItems = in.nextInt();
      // Allocate the array
      items = new int[numItems];

      // Print array in "index: number of stars" using a nested-loop
         for ( int i=0; i < items.length; ++i) {  // Read all items
             System.out.print("Enter the grade for student " + (i + 1) + ":");
             items[i] = in.nextInt();
         }
         
       
         System.out.println("The average is:" + );
         System.out.println("The minimum is:" + );
         System.out.println("The maximum is:" + );
      }
      
   }
