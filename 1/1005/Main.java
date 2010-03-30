import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static final int SQ_MILE_CORROSION = 50;

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
           
        int cycles = sn.nextInt();
        for(int i=0;i<cycles;i++) {
            float x = sn.nextFloat();
            float y = sn.nextFloat();
            double dist = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
            int yrs = (int)Math.ceil((Math.pow(dist,2)*Math.PI)/100.0);
            System.out.println("Property " + (i+1) + ": This property will begin eroding in year " + yrs + ".");
        }
        System.out.println("END OF OUTPUT.");
    }
}
