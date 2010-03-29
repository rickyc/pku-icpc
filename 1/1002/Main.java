import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static boolean duplicateFound;

    public static void main(String[] args) throws IOException {
        //Scanner s = new Scanner(System.in);
        Scanner s = new Scanner(new File("input.txt"));
        TreeMap<String,Integer> hm = new TreeMap<String,Integer>();
        duplicateFound = false;

        int numberOfLines = s.nextInt();

        String str = "";
        for(int i=0;i<numberOfLines;i++) {
            str = s.next();

            str = str.replaceAll("-*","");
            str = str.replaceAll("(A|B|C){1}","2");
            str = str.replaceAll("(D|E|F){1}","3");
            str = str.replaceAll("(G|H|I){1}","4");
            str = str.replaceAll("(J|K|L){1}","5");
            str = str.replaceAll("(M|N|O){1}","6");
            str = str.replaceAll("(P|R|S){1}","7");
            str = str.replaceAll("(T|U|V){1}","8");
            str = str.replaceAll("(W|X|Y){1}","9");

            String k = str.substring(0,3) + '-' + str.substring(3,7);
            if (hm.containsKey(k)) {
                hm.put(k,hm.get(k)+1);
                duplicateFound = true;
            } else
                hm.put(k,new Integer(1));
        }

        if (!duplicateFound) {
            System.out.println("No duplicates.");
            System.exit(0);
        }

        for(Map.Entry<String,Integer>e : hm.entrySet()) {
            int v = e.getValue();
            if (v != 1)
                System.out.println(e.getKey() + " " + v);
        }
    }
}
