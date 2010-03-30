import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws IOException {
        //Scanner sn = new Scanner(System.in);
        Scanner sn = new Scanner(new File("input.txt"));
        
        while(sn.hasNext()) {
            BigDecimal bd = new BigDecimal(sn.next());
            bd = bd.pow(sn.nextInt());
            bd = bd.stripTrailingZeros();
            System.out.println( bd.toPlainString().replaceFirst("^0{1}",""));
        }
    }
}
