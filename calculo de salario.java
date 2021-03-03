import java.io.IOException;
import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) throws IOException {
       Scanner s = new Scanner(System.in);
       
       int trab = s.nextInt();
       
       int hora = s.nextInt();
       
       double porHora = s.nextDouble();
       
       
       double salarioFun = hora * porHora;
       
       System.out.println("NUMBER = "+ trab);
       System.out.printf("SALARY = U$ " + "%.2f%n" , salarioFun );
       
    }
 
}