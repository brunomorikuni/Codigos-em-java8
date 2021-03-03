import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double X = scan.nextDouble();
        double A1 = X + (X * 0.15), B1 = (X * 0.15);
        double A2 = X + (X * 0.12), B2 = (X * 0.12);
        double A3 = X + (X * 0.10), B3 = (X * 0.10);
        double A4 = X + (X * 0.07), B4 = (X * 0.07);
        double A5 = X + (X * 0.04), B5 = (X * 0.04);
        if (X >= 0.00 && X <= 400.00) {
            System.out.printf("Novo salario: %.2f\n", A1);
            System.out.printf("Reajuste ganho: %.2f\n", B1);
            System.out.println("Em percentual: 15 %");
        } else if (X >= 400.01 && X <= 800.00) {
            System.out.printf("Novo salario: %.2f\n", A2);
            System.out.printf("Reajuste ganho: %.2f\n", B2);
            System.out.println("Em percentual: 12 %");
        } else if (X >= 800.01 && X <= 1200.00) {
            System.out.printf("Novo salario: %.2f\n", A3);
            System.out.printf("Reajuste ganho: %.2f\n", B3);
            System.out.println("Em percentual: 10 %");
        } else if (X >= 1200.01 && X <= 2000.00) {
            System.out.printf("Novo salario: %.2f\n", A4);
            System.out.printf("Reajuste ganho: %.2f\n", B4);
            System.out.println("Em percentual: 7 %");
        } else if (X >= 2000.01) {
            System.out.printf("Novo salario: %.2f\n", A5);
            System.out.printf("Reajuste ganho: %.2f\n", B5);
            System.out.println("Em percentual: 4 %");
        }
    }
}