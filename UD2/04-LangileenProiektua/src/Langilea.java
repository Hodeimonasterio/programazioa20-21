
/**
 * The Zatikia class models a Langilea with id, izena, abizena, soldata.
 */
public class Langilea {    // Save as "Zatikia.java"
    // Private instance variables

    private int id;
    private String izena;
    private String abizena;
    private double soldata;

    public Langilea(int id, String izena, String abizena, double soldata) {
        this.id = id;
        this.izena = izena;
        this.abizena = abizena;
        this.soldata = soldata;
    }

    public int getId() {
        return id;
    }

    public String getIzena() {
        return izena;
    }

    public String getAbizena() {
        return abizena;
    }

    public String getIzenOsoa() {
        return izena + " " + abizena;
    }

    public double getSoldata() {
        return soldata;
    }

    public double gatUrtekoSoldata() {
        return soldata * 12;
    }

    public void setSoldata(double soldata) {
        this.soldata = soldata;
    }

    public double soldataIgo(int portzentaia) {
        soldata = soldata * (portzentaia + 100) / 100;

        return soldata;
    }

// Return a String description of this instance
    @Override
    public String toString() {
        return "Langilea[id=" + id + ", izena=" + izena +" "+abizena + ", soldata=" + soldata + "]";
    }

    public static Langilea[] nireHamarLagunLangile() {
        Langilea[] hamarLagunLangile = {new Langilea(1, "Josu", "Rodriguez", 800), new Langilea(2, "Mikel", "Zabala", 200), new Langilea(3, "Ferran", "Torres", 750),
            new Langilea(4, "David", "Villa", 950), new Langilea(5, "Tomas", "Aguirre", 530), new Langilea(6, "Julen", "Aizpurua", 780), new Langilea(7, "Ane", "Etxeberria", 430),
            new Langilea(8, "Gorka", "Arribas", 390), new Langilea(9, "Maider", "Sasuola", 800), new Langilea(10, "Manu", "Bilbao", 800)};
        return hamarLagunLangile;
    }

    public static Langilea bilatu(Langilea[] hamarLagunLangile, String izena) {
        boolean aurkitua = false;
        int i;
        for (i = 0; i < hamarLagunLangile.length; i++) {
            if (hamarLagunLangile[i].getIzena().equals(izena)) {
                aurkitua = true;
                break;
            }
        }
        if (aurkitua == true) {
            return hamarLagunLangile[i];
        } else {
            return null;
        }
    }

    
     public static Langilea bilatu(Langilea[] hamarLagunLangile, String bilatu, String eremua) {
        boolean aurkitua = false;
        int i;
        
        for (i = 0; i < hamarLagunLangile.length; i++) {
            if(eremua.equals("id")){
               int id = Integer.parseInt(bilatu); 
             if (hamarLagunLangile[i].getId()== id) {
                 
                aurkitua = true;
                break;
              }
            }
           
            if(eremua.equals("izena")){
             if (hamarLagunLangile[i].getIzena().equals(bilatu)) {
                aurkitua = true;
                break;
              }
            }
           if(eremua.equals("abizena")){
             if (hamarLagunLangile[i].getAbizena().equals(bilatu)) {
                aurkitua = true;
                break;
              }
            } 
           
            if(eremua.equals("soldata")){
               double soldata= Double.parseDouble(bilatu);
             if (hamarLagunLangile[i].getSoldata()== soldata) {
                aurkitua = true;
                break;
              }
            }
            
        }
        if (aurkitua == true) {
            return hamarLagunLangile[i];
        } else {
            return null;
        }
    }
}
