import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        TreeSet<nInt> ts = new TreeSet<nInt>(new TSComparator());

        double previous = 0;
        for(int i=1;i<274;i++) {
            previous += 1.0/(1.0+i);
            nInt j = new nInt(i,previous);
            ts.add(j);
     //       System.out.println(i + " " + previous);
        }


        //Scanner s = new Scanner(System.in);
        Scanner s = new Scanner(new File("input.txt"));
        
        while(s.hasNext()) {
            float f = s.nextFloat();
            if(f == 0.0) break;
            System.out.println(ts.tailSet(new nInt(0,f)).first().getCard() + " card(s)");
        }
    }

    public static class TSComparator implements Comparator<nInt> {
        public int compare(nInt o1, nInt o2) {
            return (o1.value < o2.value) ? -1 : (o1.value > o2.value) ? 1 : 0;
        }
    }

    public static class nInt {
        private int card;
        private double value;

        public nInt(int card, double value) {
            this.card = card;
            this.value = value;
        }

        public int getCard() { return card; }
    }

}

