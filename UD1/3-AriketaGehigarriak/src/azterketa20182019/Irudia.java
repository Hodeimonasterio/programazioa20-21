package azterketa20182019;
public class Irudia {

    public static void main(String[] args) {
        System.out.print("Zenbakia = 4 eta karakterea = ‘@’\n" +
"badira, zera inprimatuko du: ");
         laukiHorizontalaIrudikatu(4, '@');
         System.out.println("");
         System.out.print("Zenbakia = 6 eta karakterea = ‘#’\n" +
"badira, zera inprimatuko du: ");
        laukiHorizontalaIrudikatu(6, '#');
        

    }

    public static void laukiHorizontalaIrudikatu(int neurria, char ikurra) {

        //IDATZI ZURE KODEA HEMEN
       int altuera=neurria/2;
       int zabalera=neurria;
        for(int i=1; i<=altuera; i++){//altuera
         System.out.println(" ");
         
         
         for(int j=1; j<=zabalera; j++){//zabalera
         
             System.out.print(ikurra);
    }

}
    }
}

