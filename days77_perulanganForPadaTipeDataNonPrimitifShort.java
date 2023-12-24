package javaapplication157;

public class days77 {
    public static void main(String[] args) {
        //deklarasi variabel non primitif ke tipe data short
        Short[] nilaiShort = new Short[10];
        
        //Menginisialisasikan nilai Variabel non primitif tipe data short
        for (int i = 0; i < nilaiShort.length; i++){
            nilaiShort[i] = (short)(i + 1);
            
        // mencetak niali variabel non primitif tipe data short    
        }
      for ( int i = 0; i < nilaiShort.length; i++){
          System.out.println("nilai variabel nilaiShort["+ i +"]:" + nilaiShort[i]);
      }
    }
}
