import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner s = new Scanner(System.in);
        
        String nome = s.next();
        
        double sA = s.nextDouble();
        double vE = s.nextDouble();
        
        double bonus  =  (vE*0.15);
        
        double salarioTotal = bonus + sA ;
        
        
        
      
        System.out.printf("TOTAL = R$ "+ "%.2f%n", salarioTotal);
        
    }
 
}