
/**
 * A Test Driver for the "LaukiBatSortu" class
 */
import java.util.Scanner;

public class LaukiBatSortu {    // Save as "LaukiBatSortu.java"

    public static void main(String[] args) {// Program entry point
        int zabalera;
        int altuera;
        Scanner in = new Scanner(System.in);
        
        Laukia l1 = new Laukia(); 
               

        System.out.print("Sartu laukiaren zabalera:");
        zabalera = in.nextInt();
        System.out.print("Sartu laukiaren altuera:");
        altuera = in.nextInt();
        System.out.println("Lauki " + l1.getMota() + " sortu duzu: => " + l1.toString());
        System.out.print("Hona marrazkia beteta:");
        l1.marraztuBeteta();
        System.out.println("");
        System.out.print("Hona marrazkia hutsik:");
        l1.marraztuHutsik();
        

    }
}
