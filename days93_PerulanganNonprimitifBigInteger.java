
package javaapplication158;

import java.math.BigInteger;


public class day93_PerulanganBigInteger {
    public static void main(String[] args) {
        BigInteger a  = BigInteger.valueOf(10);//mendeklarasikan variabel bigInteger
        BigInteger b  = BigInteger.valueOf(20);
        
        for(int i = 0; i < 10; i++){//perulangan for
            BigInteger c = a.add(b);//operasi aritmetika
            System.out.println("c : "+c);//hasil
         // memperbaharui nilai a dan b untuk iterasi berilutnya  
            a = b; 
            b = c;
        } 
    }
}
