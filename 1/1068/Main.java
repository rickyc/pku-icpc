import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //Scanner s = new Scanner(System.in);
        Scanner s = new Scanner(new File("input.txt"));

        int numberOfLines = s.nextInt();

        for(int i=0;i<numberOfLines;i++)
            String str = s.next();
    }
}
