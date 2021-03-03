import java.io.IOException;
import java.util.Scanner;


public class Main{

 
    public static void main(String[] args) throws IOException {
 
        Scanner p = new Scanner(System.in);
        
        double pii = 3.14159;
        
        double raiocil = p.nextDouble();
        
        
        double area = raiocil * pii * raiocil ;
        
        System.out.printf("A=" +"%.4f%n",area );
 
    }
 
}