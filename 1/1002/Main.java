import java.io.File;
import java.io.IOException;
import java.lang.Character;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        //Scanner s = new Scanner(System.in);
        Scanner s = new Scanner(new File("input.txt"));
        TreeMap<String,Integer> hm = new TreeMap<String,Integer>();
        boolean duplicateFound = false;

        int numberOfLines = s.nextInt();

        for(int i=0;i<numberOfLines;i++) {
            String str = s.next();

            StringBuffer key = new StringBuffer();
            for(int j=0;j<str.length();j++) {
                key.append(convert(str.charAt(j)));
                if (key.length() == 3) key.append('-');
            }

            String sKey = key.toString();
            if (hm.containsKey(sKey)) {
                hm.put(sKey,hm.get(sKey)+1);
                duplicateFound = true;
            } else
                hm.put(sKey,new Integer(1));
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

    public static String convert(char c) {
        if (Character.isDigit(c)) return c + "";
        else {
            switch(c) {
                case 'A': case 'B': case 'C': return "2"; 
                case 'D': case 'E': case 'F': return "3"; 
                case 'G': case 'H': case 'I': return "4"; 
                case 'J': case 'K': case 'L': return "5"; 
                case 'M': case 'N': case 'O': return "6"; 
                case 'P': case 'R': case 'S': return "7"; 
                case 'T': case 'U': case 'V': return "8"; 
                case 'W': case 'X': case 'Y': return "9"; 
            }
        }
        return ""; 
    }
}

