package azterketa20182019;

import java.util.Scanner;

public class Maximoa {

    public static void main(String[] args) {
        int zenbakia=0;
        int handiena=0;
        
        Scanner in = new Scanner(System.in);
    //IDATZI HEMEN ZURE KODEA
       System.out.println("MAXIMOAREN KALKULUA\n" +
"=============================");
    while(zenbakia!=-1){
        System.out.print("Sartu zenbaki positibo bat (Bukatzeko, -1): ");
        zenbakia=in.nextInt();
        
        
       if(handiena<zenbakia){
        handiena=zenbakia;
            
        } 
    }  
    
    System.out.println("Sartu dituzun zenbaki guztien artean handiena "+ handiena +" izan da");
    }
}
