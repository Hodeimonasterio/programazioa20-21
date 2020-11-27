
import java.util.Scanner;

/**
 * A Test Driver for the "Laukia" class
 */
public class LaukiAskoSortu {    // Save as "LaukiAskoSortu.java"
   public static void main(String[] args) {   // Program entry point
       int zabalera;
       int altuera;
       int zenbat;
       Scanner in = new Scanner(System.in);
       Laukia l1 = new Laukia(4,4);
       Laukia l2 = new Laukia(5,6);
       Laukia l3 = new Laukia(6,4);
       Laukia l4 = new Laukia(2,2);
       
       System.out.print("Zenbat lauki sortu nahi dituzu?");
       zenbat = in.nextInt();
       System.out.println("1.LAUKIAREN DATUAK:");
       System.out.println("Zabalera:"); l1.getZabalera();
       System.out.println("Altuera:"); l1.getAltuera();
       System.out.println("2.LAUKIAREN DATUAK:");
       System.out.println("Zabalera:"); l2.getZabalera();
       System.out.println("Altuera:"); l2.getAltuera();
       System.out.println("3.LAUKIAREN DATUAK:");
       System.out.println("Zabalera:"); l3.getZabalera();
       System.out.println("Altuera:"); l3.getAltuera();
       System.out.println("4.LAUKIAREN DATUAK:");
       System.out.println("Zabalera:"); l4.getZabalera();
       System.out.println("Altuera:"); l4.getAltuera();
   
      
System.out.println("Laukia    Zabalera     Altuera     Azalera     Perimetroa     Mota");
System.out.println("====================================================================");
System.out.println("1            " + l1.getZabalera() + "           "+ l1.getAltuera()+ "           " + l1.getAzalera()+"         " + l1.getPerimetroa()+"         " + l1.getMota() );
System.out.println("2            " + l2.getZabalera() + "           "+ l2.getAltuera()+ "           " +  l2.getAzalera()+"         " + l2.getPerimetroa()+"         " + l2.getMota());
System.out.println("3            " + l3.getZabalera() + "           "+ l3.getAltuera()+ "           " + l3.getAzalera()+"         " + l3.getPerimetroa()+"         " + l3.getMota() );
System.out.println("4            " + l4.getZabalera() + "           "+ l4.getAltuera()+ "           " + l4.getAzalera()+"          " + l4.getPerimetroa()+"          " + l4.getMota() );
       
       
      
       

   }
}
