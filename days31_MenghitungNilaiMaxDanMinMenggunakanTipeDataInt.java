public class Days31 {

   
    public static void main(String[] args) {
       int nilaiMax = Integer.MIN_VALUE; //Proses awal variabel  nilai Maksimum Ke nilai Minimum
       int nilaiMin = Integer.MAX_VALUE; //proses awal variabel  nilai Minimum Ke nilai Maksimum
       
       int[] data = {20,30,40,50,60};
       
       for (int i = 0; i <data.length; i++){
           if (data[i] > nilaiMax){
               nilaiMax = data [i];
           }
      
           if (data[i] < nilaiMin) {
               nilaiMin = data [i];
           }
       }
        System.out.println("nilai max = "+nilaiMax);
        System.out.println("nilai min = "+nilaiMin);
    }

}
