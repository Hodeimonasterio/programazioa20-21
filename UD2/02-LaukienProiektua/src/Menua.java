
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 */
public class Menua{
    public static void main(String[] args) {      
        Scanner in = new Scanner(System.in);
        int aukera = 0;
        int Laukizenbakia;
        int Laukimota;
        int zabalera;
        int altuera;
        Laukia l1 = new Laukia(2,4);
        do {
            System.out.println();
            System.out.println("MENUA");
            System.out.println("====================================");
            System.out.println("1.- Lehen aukera");
            System.out.println("2.- Bigarren aukera");
            System.out.println("3.- Hirugarren aukera");
            System.out.println("4.- Laugarren aukera");
            System.out.println("5.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();
            switch (aukera) {
                case 1:
                    System.out.println("LAUKI BERRIA SORTZEN...");
                    System.out.print("Sartu zabalera:");
                    zabalera= in.nextInt();
                    System.out.print("Sartu altuera:");
                    altuera= in.nextInt();
                    break;
                case 2:
                    System.out.println("Laukia    Zabalera     Altuera     Azalera     Perimetroa     Mota");
System.out.println("====================================================================");
System.out.println("1            " + l1.getZabalera() + "           "+ l1.getAltuera()+ "           " + l1.getAzalera()+"         " + l1.getPerimetroa()+"         " + l1.getMota() );
                    break;
                case 3:
                    System.out.print("Zenbatgarren laukia nahi duzu marraztu?");
                    Laukizenbakia= in.nextInt();
                    System.out.println("Beteta ala Hutsik(B/H)?");
                    break;
                case 4:
                    System.out.println("Laugarren aukera aukeratu duzu.");
                    break;
                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
            
        } while (aukera != 5);
    }
    
    
}
