import java.io.IOException;
 

import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner p = new Scanner(System.in);

 
        int A = p.nextInt();
        int B = p.nextInt();
        int C = p.nextInt();
        int maiorAB = (A+B+Math.abs(A-B))/2;
        int maiorBC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;
        
        System.out.printf(maiorBC +" eh o maior\n");
        
 
       
 
    }
 
}