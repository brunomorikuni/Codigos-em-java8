import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);
        double X = scan.nextDouble(), B = scan.nextDouble(), R = scan.nextDouble();
        double Y = Math.max(X, Math.max(B, R));
        double W = 0;
        double T = 0;
        
        if (Y == X) {
            W = Math.max(B, R);
            T = Math.min(B, R);
            
        }
        if (Y == B) {
            W = Math.max(X, R);
            T = Math.min(X, R);
            
        }
        
        if (Y == R) {
            W = Math.max(B, X);
            T = Math.min(B, X);
        }
        
        if (Y >= (W + T)) {
            System.out.print("NAO FORMA TRIANGULO\n");

        } else if (Y * Y > ((W * W) + (T * T))) {
            System.out.print("TRIANGULO OBTUSANGULO\n");
        }
        if (Y * Y == ((W * W) + (T * T))) {
            System.out.print("TRIANGULO RETANGULO\n");
        }


        if (Y * Y < ((W * W) + (T * T))) {
            System.out.print("TRIANGULO ACUTANGULO\n");
        }
        if ((Y == W) && (Y == T)) {
            System.out.print("TRIANGULO EQUILATERO\n");
        }
        if (((Y == W) && (Y != T)) || ((Y == T) && (Y != W)) || ((W == T) && (W != Y))) {
            System.out.print("TRIANGULO ISOSCELES\n");
        }
    }

}