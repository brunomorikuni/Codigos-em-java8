import java.io.IOException;
import java.util.Scanner; 
public class Main {
    
   
    public static void main(String[] args) throws IOException {
 
		Scanner scan = new Scanner(System.in);
		int g, f, d;

		g = scan.nextInt();
		f = scan.nextInt();
		d = scan.nextInt();

		if ((g < f) & (f < d)) {
			System.out.println(g);
			System.out.println(f);
			System.out.println(d);
		}
		else if ((g < d) & (d < f)) {
			System.out.println(g);
			System.out.println(d);
			System.out.println(f);
		}
		else if ((f < g) & (g < d)) {
			System.out.println(f);
			System.out.println(g);
			System.out.println(d);
		}
		else if ((f < d) & (d < g)) {
			System.out.println(f);
			System.out.println(d);
			System.out.println(g);
		}
		else if ((d < g) & (g < f)) {
			System.out.println(d);
			System.out.println(g);
			System.out.println(f);
		}
		else {
			System.out.println(d);
			System.out.println(f);
			System.out.println(g);
		}

			System.out.println("\n" + g);
			System.out.println(f);
			System.out.println(d);


    }
}