import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner m = new Scanner(System.in);
        
        double A = m.nextDouble();
        double B = m.nextDouble();
        double C = m.nextDouble();
          
        double media = ( 2*A + 3*B + 5*C) / 10 ;
        
        System.out.printf("MEDIA = " + "%.1f%n", media);
    }
 
}