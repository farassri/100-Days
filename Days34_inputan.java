
package biodata2;

import java.util.Scanner;


public class Inputan {
    public static void main(String[] args) {
        Scanner dini = new Scanner (System.in);

        System.out.println("INPUT");
        System.out.println("masukan nilai pertama:");
        int input1 = dini.nextInt();
        System.out.println("masukan nilai kedua:");
        int input2 = dini.nextInt();
        
        int hasil = input1 + input2;
         
        
         if (hasil > 5){
             hasil -= 3;
             System.out.println("jika hasil lebih dari lima maka nilainya di kurang3"+ hasil);
         }else{
             hasil +=3;
             System.out.println("jika hasil kurang dari lima maka nilainya di di gtambah dengan tiga" + hasil);
         }
         
          
       
      
        
    }
}

        
    
    

