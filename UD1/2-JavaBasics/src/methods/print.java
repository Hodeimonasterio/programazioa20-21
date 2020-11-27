package methods;

import java.util.Scanner;

public class print {

    public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);
// Read first input to "seed" the while loop
        int[] arrayint={1, 2, 3, 4, 5, 6, 7, 8};
       print(arrayint);
       double[] arraydouble={23.2, 22.3, 56.8, 23.5};
        print(arraydouble);
            
            // Read next input. Repeat if the input is not the SENTINEL 
            // Take note that you need to repeat these codes!
         
    
    
    }
    
    
public static void print(int[] array){
    System.out.print("The int values are: [");
    for(int i=0; i< array.length; i++){
    if(i==array.length- 1){
        System.out.print(array[i]);
    }else{
              System.out.print(array[i]+", ");
   }
 }
     System.out.println("]");  
}
public static void print(double[] array){
    System.out.print("The double values are: [");
    for(int i=0; i< array.length; i++){
    if(i==array.length- 1){
        System.out.print(array[i]);
    }else{
              System.out.print(array[i]+", ");
    
                }
    
    
    
    
 }
     System.out.println("]");  
}

}

    

