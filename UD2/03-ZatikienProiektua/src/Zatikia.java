/**
 * The Zatikia class models a Zatikia with a zenbakitzailea and izendatzailea.
 */
public class Zatikia {    // Save as "Zatikia.java"
    // Private instance variables

    private int zenbakitzailea;
    private int izendatzailea;

    // Constructors (overloaded)
    /**
     * Constructs a Zatikia instance with default zenbakitzailea and izendatzailea
     */
    public Zatikia() {                   // 1st Constructor (default constructor)
        
    }

    public Zatikia(int zenbakitzailea, int izendatzailea) {
        this.zenbakitzailea = zenbakitzailea;
        this.izendatzailea = izendatzailea;
    }

    public int getZenbakitzailea() {
        return zenbakitzailea;
    }
    


public int getIzendatzailea(){
      return izendatzailea;

}

public void setZenbakitzailea(int zenbakitzailea) {
        this.zenbakitzailea = zenbakitzailea;
    }
public void setIzendatzailea(int izendatzailea) {
        this.izendatzailea = izendatzailea;
    }


   // Return a String description of this instance
    @Override
    public String toString() {
        return "Zatikia[" + zenbakitzailea + "/" + izendatzailea + "]";
    }
public static Zatikia biderkatu(Zatikia zat1,Zatikia zat2){
    Zatikia zatikiberria= new Zatikia(zat1.zenbakitzailea * zat2.zenbakitzailea , zat1.izendatzailea * zat2.izendatzailea);
    
return zatikiberria;
}

public static Zatikia batu(Zatikia zat1, Zatikia zat2){
    Zatikia zati= new Zatikia();
    zati.zenbakitzailea= zat1.zenbakitzailea * zat2.izendatzailea + zat2.zenbakitzailea * zat1.izendatzailea;
    zati.izendatzailea= zat1.izendatzailea * zat2.izendatzailea;
return zati;
}


public void batu(Zatikia besteZatikiBat){
this.zenbakitzailea= this.zenbakitzailea * besteZatikiBat.izendatzailea + besteZatikiBat.zenbakitzailea * this.izendatzailea;
this.izendatzailea= this.izendatzailea * besteZatikiBat.izendatzailea;
    

}


public double hamartarBaliokidea(){
   
return(double)zenbakitzailea/izendatzailea;
}


public boolean isBiggerThan(Zatikia besteZatikiBat){
double zatikia=(double)zenbakitzailea/izendatzailea;
double besteZatiki=(double)besteZatikiBat.getZenbakitzailea()/besteZatikiBat.getIzendatzailea();

return zatikia>besteZatiki;

}

 public Zatikia sinplifikatu() {
        int i =2;
        while(i<=(zenbakitzailea|izendatzailea)){
        if(zenbakitzailea % i==0 && izendatzailea % i == 0){
        zenbakitzailea = zenbakitzailea / i;
        izendatzailea= izendatzailea / i;
      }else{
        i++;
        }
      }
return this;
}

    public Zatikia(String zatIdatzita) {
        zenbakitzailea = Integer.parseInt("" + zatIdatzita.charAt(0));
        izendatzailea = Integer.parseInt("" + zatIdatzita.charAt(2));

    }

    public void zatikiakOrdenatu(Zatikia[] array) {

        Zatikia aux = new Zatikia();
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {

                if (array[j - 1].isBiggerThan(array[j])) {
                    aux = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = aux;
                }

            }

        }

    }

    public boolean isBaliokidea(Zatikia besteZatikiBat) {
   
            return this.hamartarBaliokidea()==besteZatikiBat.hamartarBaliokidea();
            }



}

