import java.util.Scanner;
import java.io.IOException;
public class Main{
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int  n , x;
        
       
        
        n = sc.nextInt();
        
        for (int i=0; i<n; i++) {
            
        x = sc.nextInt();
            if (x == 0) {
                System.out.println("NULL");
            }
            else {
            if (x % 2 == 0) {
                System.out.print("EVEN ");
            }
            else {
                System.out.print("ODD ");
            }
            if (x > 0) {
                System.out.println("POSITIVE");
            }
            else {
                System.out.println("NEGATIVE");
            }}
        }
    }
}