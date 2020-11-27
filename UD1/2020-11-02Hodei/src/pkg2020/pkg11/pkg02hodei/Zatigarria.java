/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2020.pkg11.pkg02hodei;

import java.util.Scanner;

/**
 *
 * @author monasterio.hodei
 */
public class Zatigarria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   int zatikizuna;
   int zatitzailea;
    Scanner in = new Scanner(System.in);
    
        System.out.print("Sartu zatikizuna (zenbaki handia): ");
          zatikizuna= in.nextInt();
    System.out.print("Sartu zatitzailea (zenbaki txikia): ");
          zatitzailea= in.nextInt();
    
    zatigarriaDa(zatikizuna,zatitzailea);
    
    }
    
    
    
    
    public static boolean zatigarriaDa(int zatikizuna, int zatitzailea){
       
        
    if(zatikizuna%zatitzailea==0){
        System.out.println(zatikizuna+ " zenbakia zatigarria da "+ zatitzailea+ " zenbakiarekin.");
    }else{
    System.out.println(zatikizuna+ " zenbakia ez da zatigarria "+ zatitzailea+ " zenbakiarekin");
    }
    return true;
   }
    

}
   
