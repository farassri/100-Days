public class Day26 {

    
    public static void main(String[] args) {
        HashSet<String>mobil = new HashSet<String>();
        
       mobil.add("honda");
       mobil.add("yamaha");
       mobil.add("mazda");
       mobil.add("bmw");
       
       //perulangan hashset menggunakan perulangan for
       for(String i : mobil){
           System.out.println(i);
       }
    }
}
