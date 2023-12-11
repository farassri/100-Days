public class days64 {

    
    public static void main(String[] args) {
    //deklarasi variabel long
     long a, b, c;
     
     Scanner input = new Scanner(System.in);
        //memasukkan nilai a
        System.out.println("masukkan angka a: ");
        a = input.nextLong();
        //memasukkan nilai b
        System.out.println("masukkan angka b: ");
        b = input.nextLong();
        //penjumlahan
        c = a+b;
        //hasil 
        System.out.println("hasil penjumlahan a+b adalah "+c);
    }
}
