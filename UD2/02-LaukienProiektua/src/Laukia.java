
/**
 * The Laukia class models a Laukia with a altuera and zabalera.
 */
public class Laukia {    // Save as "Laukia.java"
    // Private instance variables

    private int zabalera;
    private int altuera;

    // Constructors (overloaded)
    /**
     * Constructs a Laukia instance with default altuera and zabalera
     */
    public Laukia() {                   // 1st Constructor (default constructor)
        zabalera = 5;
        altuera = 5;
    }

    public Laukia(int zab, int alt) {   // 2nd Constructor 
        zabalera = zab;
        altuera = alt;
    }

    //public methods
    public int getZabalera() {
        return zabalera;
    }

    public int getAltuera() {
        return altuera;
    }

    public int getAzalera() {
        return zabalera * altuera;
    }

    public int getPerimetroa() {
        return zabalera * 2 + altuera * 2;
    }

    public void setZabalera(int zabaleraBerria) {
        zabalera = zabaleraBerria;
    }

    public void setAltuera(int altueraBerria) {
        altuera = altueraBerria;
    }

    public String getMota() {
        String mota="";
        if (zabalera > altuera) {
            mota= "Horizontala";
        } else {
           mota= "Bertikala";
            if (zabalera == altuera) {
                mota= "Karratua";
            }

        }
     return mota;
    }
    
    public void marraztuBeteta(){
    for (int i = 1; i <= zabalera; i++) {
            System.out.println("");
            for (int j = 1; j <= altuera; j++) {
                System.out.print("*");
            }
        }
    
    }
     public void marraztuHutsik(){
    for (int i = 1; i <= zabalera; i++) {
            System.out.println("");
            for (int j = 1; j <= altuera; j++) {
            if(i==1 || i==zabalera ||j==1 || j==altuera){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }}
        }
    
    }
   

    // Return a String description of this instance
    @Override
    public String toString() {
        return "Laukia[" + zabalera + "x" + altuera + "]";
    }
}
