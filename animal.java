import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        String X, Y, W;
  Scanner scan =new Scanner(System.in);
  X = scan.next();
  Y = scan.next();
  W = scan.next();

  if (X.equals("vertebrado")  && Y.equals("ave") && W.equals("carnivoro")) {
   System.out.print("aguia\n");
  }
  if (X.equals("vertebrado") && Y.equals("ave") && W.equals("onivoro")) {
   System.out.print("pomba\n");
  }
  if (X.equals("vertebrado") && Y.equals("mamifero") && W.equals("onivoro")) {
   System.out.print("homem\n");
  }
  if (X.equals("vertebrado") && Y.equals("mamifero") && W.equals("herbivoro")) {
   System.out.print("vaca\n");
  }
  if (X.equals("invertebrado") && Y.equals("inseto") && W.equals("hematofago")) {
   System.out.print("pulga\n");
  }
  if (X.equals("invertebrado") && Y.equals("inseto") && W.equals("herbivoro")) {
   System.out.print("lagarta\n");
  }
  if (X.equals("invertebrado") && Y.equals("anelideo") && W.equals("hematofago")) {
   System.out.print("sanguessuga\n");
  }
  if (X.equals("invertebrado") && Y.equals("anelideo") && W.equals("onivoro")) {
   System.out.print("minhoca\n");
  }
 
    }
 
}