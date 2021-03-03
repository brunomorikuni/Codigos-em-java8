import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int A , B ;
        A = scan.nextInt();
        B = scan.nextInt();
        if(A%B==0 || B%A==0){
            System.out.println("Sao Multiplos");
        }else {
            System.out.println("Nao sao Multiplos");
        }
 
    }
 
}