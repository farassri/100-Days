public class Days_13 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("masukkan panjang persegi panjang:");
        double panjang = sc.nextDouble();
        System.out.println("masukkan lebar persegi panjang:");
        double lebar = sc.nextDouble();
        
        //panjang*lebar
        double area = panjang*lebar;
        System.out.println("Luas persegi panjang adalah: "+area);
                    
        }
    }
