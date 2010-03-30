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
            int i = sn.nextInt();
            bd = bd.pow(i);
            bd = bd.stripTrailingZeros();
            String str = bd.toPlainString().replaceFirst("^0{1}","");
            System.out.println(str);
        }
    }
}
