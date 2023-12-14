package javaapplication156;


public class days67 {
    public static void main(String[] args) {
        
        int[] angka = {25,7,9,15,10};
        //merubah nilai array dengan indeks 3 menjadi 25
        angka[3] = 25;
        //mencetak array yg telah diubah
        for(int i = 0; i < angka.length; i++){
            System.out.println(angka[i]);
        }
    }
}
