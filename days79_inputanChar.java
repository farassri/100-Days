package javaapplication157;

import java.util.Scanner;
public class days79_inputanChar{
    public static void main(String[] args) {
        
         char huruf;//deklarasi variabel char
        //membaca nilai char dari input keyboard
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan huruf: ");
        huruf = sc.next().charAt(0);
        System.out.println("Huruf: " + huruf);//mencetak nilai char
    }
}
