import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        float acumu = 0;
        for (int i = 0; i < 6; i++) {
            float num = sc.nextFloat();
            if (num > 0) {
                cont = cont + 1;
                acumu = acumu + num;
            }
        }
        System.out.println(cont+ " valores positivos");
        System.out.printf("%.1f\n", (acumu / cont));
    }
}