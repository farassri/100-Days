import java.util.Scanner;


public class days45 {
    public static void main(String[] args) {
        //mendeklarasikan variabel
        int jumlahNilai;
        int nilai;
        int totalNilai = 0;
        //membaca jumlah nilai
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan jumlah nilai : ");
        jumlahNilai = input.nextInt();
        //memasukkan nilai dengan menggunkan perulangan for
        for (int i = 0; i < jumlahNilai; i++){
           System.out.print("masukkan nilai ke-"+(i+1+ ": "));
           nilai = input.nextInt();
           totalNilai += nilai;
         //menghitung  rata-rata
        float rataRata = (float) totalNilai/jumlahNilai;
        System.out.println("nilai rata-rata "+rataRata);
    }
    }
            
}
