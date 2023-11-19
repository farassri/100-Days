public class Days42 {

   
    public static void main(String[] args) {
     int nilai;
     String nama;
     Scanner Sc = new Scanner(System.in);
     
     //mengambil inputan
        System.out.println("nama : ");
        nama = Sc.nextLine();
        System.out.println("nilai : ");
        nilai = Sc.nextInt();
        
        if (nilai > 70){
            System.out.println("selamat " + nama  + "  anda Lulus");
        }else{
            System.out.println("maaf " + nama + " anda tidak lulus");
           
        }
    }
}      
