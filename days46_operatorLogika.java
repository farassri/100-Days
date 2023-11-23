public class days46 {
    public static void main(String[] args) {
    int a = 10;
    int b = 20;
    
    
    boolean hasil1 = a > 5 && b < 20; //operator AND &&
    System.out.println("hasil1 :" +hasil1); // hasil false
    
    boolean hasil2 = a > 5 || b < 20; //operator OR (||)
    System.out.println("hasil2 :" +hasil2); // hasil true
    
    boolean hasil3 = true; //operator NOT
    hasil3 = !hasil3;
    System.out.println("hasil3 :"+hasil3); //hasil false
     
    }
}
