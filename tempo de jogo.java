import java.io.IOException;
import java.util.Scanner; 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int priHora = scan.nextInt();
        int priMinuto = scan.nextInt();
        int segHora = scan.nextInt();
        int segMunuto = scan.nextInt();
        int tempo1 = (priHora*60) + priMinuto;
        int tempo2 = (segHora*60) + segMunuto;
        int h = (24*60);
        int r = 0;
        if( tempo2>tempo1 ){
            r = tempo2 - tempo1;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(r/60), (r%60));
        }else if(tempo1>tempo2){
            r = (h - tempo1)+(tempo2);
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(r/60), (r%60));
        }else if(tempo2 == tempo1){
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",24, 0);
        }
       
    }
}