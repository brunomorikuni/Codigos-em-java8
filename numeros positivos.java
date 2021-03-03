import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double x;
        int f= 0;

        for (int i = 0; i < 6; i++) {
            x = sc.nextDouble();
            if (x > 0) {
                f += 1;
            }
        }
        System.out.print(f+ " valores positivos\n");

    }

}