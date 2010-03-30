import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        while(sn.hasNext()) {
            BigDecimal bd = new BigDecimal(sn.next());
            bd = bd.pow(sn.nextInt());
            bd = bd.stripTrailingZeros();
            System.out.println( bd.toPlainString().replaceFirst("^0{1}",""));
        }
    }
}
