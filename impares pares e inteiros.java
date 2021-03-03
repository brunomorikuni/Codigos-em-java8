import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int x, e = 0,o = 0,p = 0,n = 0;
		Scanner sc =new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			x = sc.nextInt();
			if (x % 2 == 0) {
				e += 1;
			}
			if (x % 2 != 0) {
				o += 1;
			}
			if (x > 0) {
				p+= 1;
			}
			if (x < 0) {
				n += 1;
			}
			
		}
		System.out.print(e+" valor(es) par(es)\n");
		System.out.print(o+" valor(es) impar(es)\n");
		System.out.print(p+" valor(es) positivo(s)\n");
		System.out.print(n+" valor(es) negativo(s)\n");
	}

}