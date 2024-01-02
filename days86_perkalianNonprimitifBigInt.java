package javaapplication157;

import java.math.BigInteger;


public class days86_PerkalianBigInt {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("1234567890");
        BigInteger b = new BigInteger("1234567891");

        BigInteger c = a.multiply(b);
        System.out.println("hasil perkaliannya adalah = " +c); // 1524150328531801901

        
    }
