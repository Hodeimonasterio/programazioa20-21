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
public class Izenak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   String[] izenak = {"Jon" , "Jone" , "June" , "Julian" , "Julen" };
        Scanner in = new Scanner(System.in);
        String izn;
        int i=0;

        //hemen zure kodigoa
        
        System.out.print("Noren bila zabiltza? ");
        izn= in.next();
        
        
       
         if(i<izenak.length){ 
           
        System.out.println(izn + " zerrendako "+ (i) + ".a da");}
         else{
         System.out.println(izn + "ez dago zerrendan" );
}}

}
