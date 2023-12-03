public class days56 {
    public static void main(String[] args) {
        //deklarsi arrayList barang
        ArrayList<String> barang = new ArrayList<>();
        
        //mengisi nilai array
        barang.add("leptop");
        barang.add("mouse");
        barang.add("printer");
        barang.add("keyboard");
        
       //menampilkan nilai arrayList
        for (String item : barang){
            System.out.println("barang : " + item);
        }
         
    }
}
