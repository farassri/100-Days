
package javaapplication158;


public class day96_NonPrimitifLong {
    public static void main(String[] args) {
        long [] data = {10,20,35,40,50};//deklarasi variabel long
        Long max = data[0];//menetukan nilai max
        for(Long i : data){
            if (i > max){
                max = i;
            }
        }
        System.out.println("nilai maksimumnya adalah : "+max);
    }
}
