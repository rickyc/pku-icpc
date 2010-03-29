import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws IOException {
        //Scanner s = new Scanner(System.in);
        Scanner s = new Scanner(new File("input.txt"));
        
        double balance = 0;
        while(s.hasNext())
            balance += s.nextFloat();
        
        BigDecimal bd = new BigDecimal(balance/12);
        bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println("$"+bd);
    }
}
