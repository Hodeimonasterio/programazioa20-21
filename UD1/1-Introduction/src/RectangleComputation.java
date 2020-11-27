/*
 * Print the area and circumference of a circle, given its radius.
 */
public class RectangleComputation {  // Save as "CircleComputation.java"
   public static void main(String[] args) {
      // Declare 4 double variables to hold legth, width, perimeter area.
      // A "double" holds floating-point number with an optional fractional part.
      double length, width, perimeter, area;      
      // Assign a value to radius. (We shall read in the value from the keyboard later.)
      length = 2;
      width = 6;
      // Compute area and circumference
      perimeter = length * 2 + width * 2;
      area = length * width;
      
      // Print results
      System.out.print("The perimeter is ");  // Print description
      System.out.println(perimeter);          // Print the value stored in the variable
      System.out.print("The area is ");
      System.out.println(area);
      
   }
}
