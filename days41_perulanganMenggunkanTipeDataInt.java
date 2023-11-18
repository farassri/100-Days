public class Days41 {

    
    public static void main(String[] args) {
        //perulangan,
        int nilai;
        Scanner Sc = new Scanner(System.in);
        System.out.println("masukkan nilai  : ");
        nilai = Sc.nextInt();
        System.out.println("====angka yang habis di bagi 4=====");
        for (int i = 1; i <= nilai; i++) {
            if (i % 4 == 0) {
                
                System.out.println(i);
            }
            
        }
                
    }
    
}
