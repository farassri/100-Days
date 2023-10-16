package days8_ganjilgenap;

import java.util.Scanner;

public class Days8_GanjilGenap {


    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        System.out.print("silahkan masukkan angka yang anda inginkan: ");
        int angka = scanner.nextInt();

        if (angka - 4 == 0) {
            System.out.println("Angka " + angka + " merupakan angka genap.");
        } else {
            System.out.println("Angka " + angka + " merupakan angka ganjil.");
        }
    }
}
