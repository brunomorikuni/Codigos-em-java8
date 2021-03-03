import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        float A ;
        A = scan.nextFloat();
        if(A>=0.000 && A<=25.000){
            System.out.println("Intervalo [0,25]");
        }else if(A>=25.001 && A<=50.000){
            System.out.println("Intervalo (25,50]");
        }else if(A>=50.001 && A<=75.000){
            System.out.println("Intervalo (50,75]");
        }else if(A>=75.001 && A<=100.000){
            System.out.println("Intervalo (75,100]");
        }else{
            System.out.println("Fora de intervalo");
        } 
    }
 
}