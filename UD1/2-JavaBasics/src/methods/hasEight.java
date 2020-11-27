package methods;

import java.util.Scanner;

public class hasEight {

    public static void main(String[] args) {
        final int SENTINEL = -1;  // Terminating input
        int number;
        int magicsum=0;
        Scanner in = new Scanner(System.in);
// Read first input to "seed" the while loop
        System.out.print("Enter a positive integer (or -1 to end): ");
        number = in.nextInt();

        while (number != SENTINEL) {  // Repeat until input is -1
          if(hasEight(number)){
            magicsum = magicsum + number;
            }
            // Read next input. Repeat if the input is not the SENTINEL 
            // Take note that you need to repeat these codes!
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = in.nextInt();
            
          }
        System.out.println("The magic sum is: " + magicsum);
        
    }

    public static boolean hasEight(int number) {
      boolean encontrar=false;
      while (number > 0 && encontrar==false){
         if(number == 8){
         encontrar=true;
         }
         if(number%10==8){
             encontrar=true;
    }
         else{
         encontrar= false;
         } 
         number= number/10;
      }
        return encontrar;
    }
}
