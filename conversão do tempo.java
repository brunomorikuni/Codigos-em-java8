        import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws IOException {

            int hora, min, N, restoH;
            Scanner e = new Scanner(System.in);
            N = e.nextInt();

            hora = N/3600;

            min =  N / 60 - hora *60 ;

            N = N - min * 60-hora*60*60;



            System.out.printf("%d:%d:%d\n",hora,min,N);



        }
}
