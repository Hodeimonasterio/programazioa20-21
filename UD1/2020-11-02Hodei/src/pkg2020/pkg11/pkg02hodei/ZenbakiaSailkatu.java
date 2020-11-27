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
public class ZenbakiaSailkatu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int zenbakia=0;
        Scanner in = new Scanner(System.in);
        
        while(zenbakia<=0){
            System.out.print("Sartu zenbaki oso positibo bat: ");
        zenbakia= in.nextInt();
        if(zenbakia<=0){
            System.out.println("zenbaki ezegokia");
            
        }else{
        if(zenbakia%2==0 && zenbakia>100){
            System.out.println("Sartu duzun zenbaki handia bikoita da");
        }else{
            if(zenbakia%2!=0 && zenbakia>100){
            System.out.println("Sartu duzun zenbaki handia bakoita da");
        }
        }
       if(zenbakia%2==0 && zenbakia<=100){
        System.out.println("Sartu duzun zenbaki txikia bikoitia da");
        }else{
        
           if(zenbakia%2!=0 && zenbakia<100){
        System.out.println("Sartu duzun zenbaki txikia bakoitia da");
        }
        
        }
        
        }
       
    }
    
}}

