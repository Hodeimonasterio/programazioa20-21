package methods.arrayak;

public class TestBilaketa {

    public static void main(String[] args) {
        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i * 2;
        }
        System.out.println(Arrays.toString(array1));

        int zenbakia = 5;
        if (contains(array1, zenbakia)) {
            System.out.println("Arrayean bai agertzen da " + zenbakia + " zenbakia.");
        } else {
            System.out.println("Arrayean ez dago " + zenbakia + " zenbakia.");
        }

        int posizioa = search(array1, zenbakia);
        if (posizioa == -1) {
            System.out.println("Arrayean ez dago " + zenbakia + " zenbakia.");
        } else {
            System.out.println("Arrayaren " + posizioa + " posizioan dago " + zenbakia + " zenbakia.");
        }

    }

    public static boolean contains(int[] array, int key) {    
    
    
    
    }
    
    public static int search(int[] array, int key) { 
    
    
    
    }
}
