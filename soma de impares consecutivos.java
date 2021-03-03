import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x, y, t = 0;
		Scanner sc =new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x > y) {
			for (int i = x - 1; i > y; i--) {
				if (i % 2 != 0) {
					t += i;
				}
			}
		}else {
			for (int i = y - 1; i > x; i--) {
				if (i % 2 != 0) {
					t += i;
				}
			}
		}
		
		System.out.print(t+"\n");

	}

}