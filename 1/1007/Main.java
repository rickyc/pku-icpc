import java.util.Hashtable;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hashtable<Character,Integer> ht = new Hashtable<Character,Integer>();
        ht.put('A',1);
        ht.put('C',2);
        ht.put('G',3);
        ht.put('T',4);

        Scanner sn = new Scanner(System.in);
        int dnaLength = sn.nextInt();
        int dnaCount = sn.nextInt();
 
        PriorityQueue<DNA> pq = new PriorityQueue<DNA>();

        while(sn.hasNext()) {
            String dna = sn.next();
            
            int[] costs = new int[dnaLength];

            for(int i=0;i<dna.length();i++)
                costs[i] = ht.get(dna.charAt(i));

            DNA d = new DNA();
            d.sequence = dna; 

            for(int i=0;i<dnaLength;i++) {
                int fc = costs[i];
                
                // check all values on the left
                for (int j=i-1;j>=0;j--) {
                    int nc = costs[j];
                    int c = (fc > nc) || (fc == nc) ? 0 : 1;
                    d.cost += c;
                }

                // check all values on the right
                for(int j=i+1;j<dnaLength;j++) {
                    int nc = costs[j];
                    int c = (fc > nc) ? 1 : 0;
                    d.cost += c;
                }

            }
            pq.add(d);
        }

        while(pq.size() != 0) {
            DNA d = pq.poll();
            System.out.println(d.sequence);
        }
    }

    public static class DNA implements Comparable<DNA> {
        public String sequence;
        public int cost;

        public int compareTo(DNA d) {
            return cost > d.cost ? 1 : cost == d.cost ? 0 : -1;
        }

    }
}
