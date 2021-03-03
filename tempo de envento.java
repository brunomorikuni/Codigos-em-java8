import java.io.IOException;
import java.util.Scanner; 


public class Main {
 
    public static void main(String[] args) throws IOException {
 
        
  Scanner sc =new Scanner(System.in);
  String string;
  int dia1, dia2, hora1, hora2, minuto1, minuto2, segundo1, segundo2;
  int dia = 0, hora = 0, minuto = 0, segundo = 0;
  boolean boD = false, boM = false, boS = false;

  
  string =sc.next();
  dia1 =sc.nextInt();
  hora1 =sc.nextInt();
  string =sc.next();
  minuto1 =sc.nextInt();
  string =sc.next();
  segundo1 =sc.nextInt();
  string =sc.next();
  dia2 =sc.nextInt();
  hora2 =sc.nextInt();
  string =sc.next();
  minuto2 =sc.nextInt();
  string =sc.next();
  segundo2 =sc.nextInt();
  

  if(hora1 > hora2)
   boD = true;

  if(minuto1 > minuto2)
   boM = true;

  if(segundo1 > segundo2)
   boS = true;

     while(dia1 != dia2){
      dia++;
      dia1++;
  }

     while(hora1 != hora2){
       hora++;
       hora1++;
       if(hora1 == 25)
        hora1 = 1;
  }

     while(minuto1 != minuto2){
       minuto++;
       minuto1++;
       if(minuto1 == 61)
        minuto1 = 1;
  }

      while(segundo1 != segundo2){
       segundo++;
       segundo1++;
       if(segundo1 == 61)
        segundo1 = 1;
  }

    if(boD == true)
    dia--;

    if(boM == true)
    hora--;

    if(boS == true)
    minuto--;

  System.out.print(dia+" dia(s)\n");
  System.out.print(hora+" hora(s)\n");
  System.out.print(minuto+" minuto(s)\n");
  System.out.print(segundo+" segundo(s)\n");
 
    }
 
}