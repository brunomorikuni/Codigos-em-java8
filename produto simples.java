import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner p = new Scanner(System.in);
        int X = p.nextInt();
        int Y = p.nextInt();
        
        int prod = X*Y;
        
        System.out.println("PROD = " + prod );
    }
 
}