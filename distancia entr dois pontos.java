import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double con = ((x2 - x1)* (x2 - x1)) +((y2 - y1)*(y2 - y1));
        double dis = Math.sqrt(con);
        System.out.printf("%.4f\n",dis);

    }

}