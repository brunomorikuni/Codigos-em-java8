import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int velo = sc.nextInt();
        int temp = sc.nextInt();
        double dist = velo * temp;
        double cons = dist / 12;

        System.out.printf("%.3f\n", cons);

    }
}