import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int x;
        Scanner scan =new Scanner(System.in);
        x =scan.nextInt();
        System.out.print(1+"\n");
        for (int i = 1; i < x-1; i+=2) {
           int numero = i + 2;
            System.out.print(numero+"\n");
        }
    }
 
}
