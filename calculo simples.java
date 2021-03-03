import java.io.IOException;
import java.util.Scanner;

public class Main {
	
       public static void main(String[] args) throws IOException {
       
        Scanner g = new Scanner(System.in);
		
		
        int c = g.nextInt();
        int n = g.nextInt();
        double v = g.nextDouble();
		
        
        
        int c2 = g.nextInt();
        
        int n2 = g.nextInt();
        
        double v2 = g.nextDouble();
        
		
        double total = (n * v) + (n2 * v2);
        
        
        
        System.out.printf("VALOR A PAGAR: R$ " + "%.2f%n", total);   
    }
	
}