import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner e = new Scanner(System.in);
        
        
        
        double pii = 3.14159;
        double raio = e.nextDouble();
        
        double volume = pii * raio * raio * raio * (4/3.0);
        
        System.out.printf("VOLUME = " + "%.3f%n" , volume );
        
    }
 
}