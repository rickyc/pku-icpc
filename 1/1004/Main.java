import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double balance = 0;
        while(s.hasNext())
            balance += s.nextFloat();
        
        BigDecimal bd = new BigDecimal(balance/12);
        bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println("$"+bd);
    }
}
