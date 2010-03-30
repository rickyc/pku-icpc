import java.lang.Character;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static char[] alpha = { '2','2','2','3','3','3','4','4','4','5','5','5','6','6','6','7','0','7','7','8','8','8','9','9','9'};

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
        boolean duplicateFound = false;

        int numberOfLines = s.nextInt();

        for(int i=0;i<numberOfLines;i++) {
            String str = s.next();

            StringBuffer key = new StringBuffer();
            for(int j=0;j<str.length();j++) {
                char c = str.charAt(j);

                if(Character.isLetter(c))
                    key.append(alpha[c-'A']);
                else if(Character.isDigit(c))
                    key.append(c);
            }

            String sKey = key.toString();
            if (tm.containsKey(sKey)) {
                tm.put(sKey,tm.get(sKey)+1);
                duplicateFound = true;
            } else
                tm.put(sKey,1);
        }

        if (!duplicateFound) {
            System.out.println("No duplicates.");
            System.exit(0);
        }

        for(Map.Entry<String,Integer>e : tm.entrySet()) {
            int v = e.getValue();
            if (v != 1) {
                String key = e.getKey();
                System.out.println(key.substring(0,3) + "-" + key.substring(3,7) + " " + v);
            }
        }
    }
}
