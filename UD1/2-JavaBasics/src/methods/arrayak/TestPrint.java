package methods.arrayak;
public class TestPrint {

    public static void main(String[] args) {
        int[] arrai1 = { 6, 5, 48, 10 };
        int[] arrai2 = { };
        int[] arrai3 = { 4 };
        double[] arrai4 = { 6.5, 4.2 } ;
        float[] arrai5 = { 6.3f, 4.1f, 5.0f } ;
       
        System.out.println("print() metodoei deituta:\n ============================");
        print(arrai1);
        print(arrai2);
        print(arrai3);
        print(arrai4);
        print(arrai5);
        
        System.out.println("\narrayToString() metodoari deituta:\n ====================================");
        System.out.println(arrayToString(arrai1));
        System.out.println(arrayToString(arrai2));
        System.out.println(arrayToString(arrai3));
        
    }

    public static void print(int[] array) {
        System.out.print("[");
        for(int i=0; i< array.length; i++){
    if(i==array.length- 1){
        System.out.print(array[i]);
    }else{
              System.out.print(array[i]+", ");
   }
 }
     System.out.println("]"); 
    }
    
    public static void print(double[] array) {
           System.out.print("[");
        for(int i=0; i< array.length; i++){
    if(i==array.length- 1){
        System.out.print(array[i]);
    }else{
              System.out.print(array[i]+", ");
   }
 }
     System.out.println("]"); 
       
    }
    public static void print(float[] array) {
                System.out.print("[");
        for(int i=0; i< array.length; i++){
    if(i==array.length- 1){
        System.out.print(array[i]);
    }else{
              System.out.print(array[i]+", ");
   }
 }
     System.out.println("]"); 
     
    }
    
    public static String arrayToString(int[] array) {
                System.out.print("[");
        for(int i=0; i< array.length; i++){
    if(i==array.length- 1){
        System.out.print(array[i]);
    }else{
              System.out.print(array[i]+", ");
   }
 }
     System.out.println("]"); 
        
      return("");  
 }

}
