import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        int a ;
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextInt();
        for(int i = 2; i<=a ;i+=2){
                System.out.print(i+ "^2 = " + (i * i)+"\n"); 
           
            
        }
    }
}