package javaapplication156;

import java.util.Scanner;


public class days66 {
    public static void main(String[] args) {
        //deklarasi variabel
        int hargaBarang = 10000;
        int jumlahBarang = 10;
        double totalHarga = hargaBarang * jumlahBarang;
        //mengecek apakah jumlah barang lebih dari 5
        if (jumlahBarang > 5){
            //berikan potongan harga 
            totalHarga = totalHarga * 0.8;
            
            System.out.println("total harga: "+totalHarga);
        }
                
    }
    }
