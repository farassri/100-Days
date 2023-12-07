import java.util.ArrayList;


public class days60 {
    public static void main(String[] args) {
        //deklarasikan tipe data array
        ArrayList<String> nama = new ArrayList<>();
        //menambahkan 3 elemen ke dalam variabel nama
        nama.add("faras");
        nama.add("sri");
        nama.add("nurhayati");
        nama.add("nunu");
        //penggunaan fungsi get 
        String namaTerpilih = nama.get(2);
        //mencetak elemen dari variabel nama
        System.out.println("nama yang terpilih adalah: "+namaTerpilih);
        
    }  
}
