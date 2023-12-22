package javaapplication157;

public class days75_OperatorLogika {
    public static void main(String[] args) {
       double nilai1  = 50.0;
       double nilai2  = 80.0;
       
       //OPERATOR LOGIKA AND
       boolean hasilAND = nilai1 < nilai2 && nilai2> 0;
       System.out.println("hasil AND : "+hasilAND);//HASIL DARI OPERATOR AND TRUE
        
       //OPERATOR LOGIKA OR
        boolean hasilOR = nilai1 < nilai2 || nilai2 > 0;
        System.out.println("hasil OR: "+hasilAND);//HASIL DARI OPERATOR OR TRUE
        //OPERATOR LOGIKA NOT
        boolean hasilNOT = ! (nilai1 < nilai2);
        System.out.println("hasil NOT: "+hasilNOT);//HASIL DARI OPERATOR NOT FALSE
    }
}

