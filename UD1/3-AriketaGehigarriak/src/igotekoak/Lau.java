package igotekoak;
import java.util.Scanner;
public class Lau{

 public static void main(String args[]){
//variableak sartu
char karakterea;
int zenbat;
char letra='b';
Scanner in = new Scanner(System.in);
while(letra=='b'){
System.out.print("Aukeratu karaktere bat: ");
     karakterea = in.next().charAt(0);
     System.out.print("Zenbat aldiz inprimatu nahi duzu? ");
     zenbat = in.nextInt();
     karaktereakInprimatu(karakterea,zenbat);
    System.out.println("");   
 System.out.print("Jarraituko dugu(b/e)? ");
letra= in.next().charAt(0);
}
     System.out.println("AGUR!!!!");
 }
 
public static void karaktereakInprimatu(char karakterea, int zenbat){
for(int i=0; i<zenbat;i++){
    System.out.print(karakterea);
    System.out.print(" ");


}
}


}
        
