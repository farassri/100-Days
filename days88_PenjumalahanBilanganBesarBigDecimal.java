
import java.math.BigDecimal;


public class days88_PenjumlahanBigDecimal {
    public static void main(String[] args) {
      BigDecimal a = BigDecimal.valueOf(1234567890.123456789);
      BigDecimal b = BigDecimal.valueOf(9876543210.987654321);
      
      BigDecimal c = a.add(b);
        System.out.println(c);
    }
}
