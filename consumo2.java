import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner d = new Scanner(System.in);
        int X = d.nextInt();
        double Y = d.nextDouble();
        
        double cons = (X/Y);
        
        System.out.printf("%.3f km/l%n", cons);
       
    }
 
}