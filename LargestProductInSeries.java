import java.util.*; 
import java.io.*;

public class LargestProductInSeries {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("/Users/mosasaki/Documents/coding/project-euler/largest-prod-file.txt"));
        int [] tall = new int [100];
        int i = 0;
        while(scanner.hasNextInt()){
           tall[i++] = scanner.nextInt();
        }

        
        System.out.println(tall[1]);
        System.out.println(tall[2]);

    }
}