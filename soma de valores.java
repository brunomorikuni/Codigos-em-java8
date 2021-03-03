import java.io.IOException;
import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) throws IOException {
        
        
        Scanner  j = new Scanner(System.in);
        
        
        int numeroPri = j.nextInt();
        
        int numeroSeg = j.nextInt();
        
        
        int somatorio = (numeroPri + numeroSeg);
        
        System.out.println("X = " + somatorio);
 
    }
 
}