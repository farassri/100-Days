public class array2Dimensidays58 {
    public static void main(String[] args) {
        //deklarasikan array menggunakan tipe data string dimensi 3x2
       String [][] mahasiswa = new String [3][2];
       
       //mengisi array
       mahasiswa [0][0] ="linda";
       mahasiswa [0][1] ="ani";
       mahasiswa [1][0] ="sila";
       mahasiswa [1][1] ="nunu";
       mahasiswa [2][0] ="faras";
       mahasiswa [2][1] ="sri";
       
        //mencetak array menggunakan perulangan for untuk mengulang baris
       for(int i = 0; i < mahasiswa.length; i++) {
          
           //mencetak array mennunakan perulangan for untuk mengulang kolom
           for(int j = 0; j < mahasiswa[i].length; j++) {
           System.out.print(mahasiswa[i][j] +" ");
       }
           System.out.println();
       }
    }
}
