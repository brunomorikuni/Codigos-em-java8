import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x, y;
		Scanner sc =new Scanner(System.in);
		
		while (((x = sc.nextInt()) > 0 )&&((y = sc.nextInt()) > 0 )) {
			int soma = 0;
			if (x > y) {
				for (y = y; y <= x; y++) {
					soma+=y;
					System.out.print(y+" ");
				}
				System.out.print("Sum="+soma+"\n");
			}else {
				for (x = x; x <= y; x++) {
					soma+=x;
					System.out.print(x+" ");
				}
				System.out.print("Sum="+soma+"\n");
			}
		}

	}