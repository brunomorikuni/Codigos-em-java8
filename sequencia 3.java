import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int i, j;
        i = 1;
        j = 7;
        
        
        
       
        while( i<=9 && i!=11){
            System.out.print("I=" + i + " J=" + j + "\n");
            j-=1;
            
            if(j == 5 ){
                System.out.print("I=" + i + " J=" + j + "\n");
                i+=2;
                
                
                j=7;
                
            }
            
        }
        
       