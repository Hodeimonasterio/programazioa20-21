/*
 * Print the area and circumference of a circle, given its radius.
 */
public class CylinderComputation {  // Save as "CircleComputation.java"
   public static void main(String[] args) {
      // Declare 3 double variables to hold radius, area and circumference.
      // A "double" holds floating-point number with an optional fractional part.
      double radius, height, Surfacearea, Basearea, volume;
      // Declare a double to hold PI.
      // Declare as "final" to specify that its value cannot be changed (i.e. constant).
      final double PI = 3.14159265;
      // Assign a value to radius. (We shall read in the value from the keyboard later.)
      radius = 1;
      height = 2;
      // Compute area and circumference
      Surfacearea = 2 * PI * radius * height   ;
      Basearea= PI * radius;
      volume = PI * radius * radius * height ;
      
      // Print results
      System.out.print("The radius is ");  // Print description
      System.out.println(radius);          // Print the value stored in the variable
      System.out.print("The height is ");  // Print description
      System.out.println(height);          // Print the value stored in the variable
      System.out.print("The Surfacearea is ");  // Print description
      System.out.println(Surfacearea);          // Print the value stored in the variable
     System.out.print("The Basearea is ");  // Print description
      System.out.println(Basearea); 
      System.out.print("The volume is ");
      System.out.println(volume);
   }
}
