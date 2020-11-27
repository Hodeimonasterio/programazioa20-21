package azterketa20192020;
import java.util.Scanner;
public class Marrazkia {

    public static void main(String[] args) {
     //IDATZI HEMEN ZURE KODEA
int altuera=0;
int zabalera=0;
int zenb=1;
Scanner in = new Scanner(System.in);
 



    while(altuera<=0){
 System.out.print("Altuera: ");
    altuera= in.nextInt();
    
   }
    
    
      while(zabalera<=0){
    System.out.print("Zabalera: ");
    zabalera= in.nextInt();
   }
      
  for(int i=0; i< altuera; i++){
  
      System.out.println("");
      
  for(int j=0; j< zabalera; j++){
  
      System.out.print(" " + zenb + " "); 
      zenb++;
     }
  }
    }

}

