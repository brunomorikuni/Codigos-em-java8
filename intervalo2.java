import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);
         int N , x , in=0 , out=0;
         N = sc.nextInt();
         int intervalo1=10 , intervalo2=20;
         
         for (int i = 1; i <= N; i++) {
             x = sc.nextInt(); 
            if (x>=intervalo1 && x<=intervalo2){
                in  +=1;
            }else{
                out  +=1;
            }      
         }  
         
         
         System.out.print(in+" in\n"+out +" out\n");
         
         
         
    }
}
   