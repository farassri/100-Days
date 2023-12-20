
package Latihanku;

import java.util.Scanner;


public class Day73_inputmasukan {
    public static void main(String[] args) {
        int angka1;
        int angka2;
        int angka3;
        int hasil;
        Scanner input = new Scanner (System.in);
        System.out.print("masukan angka pertama:");
        angka1 = input.nextInt();
        System.out.print("Masukan angka kedua:");
        angka2 = input.nextInt();
        
        //menjumlah angka
        hasil = angka1 + angka2;
        //menentukan hasil
        if(hasil % 2 ==0){
            hasil = hasil + 1;
        }else{
            hasil = hasil + 2;
        }
        //menampilkan hasil
        System.out.println("hasil"+ hasil);
        
    }
    
}
