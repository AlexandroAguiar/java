import java.util.Scanner;
public class Uri1046{
public static void main(String args[]){
    Scanner teclado= new Scanner(System.in);
    int HI,HF,HR1;

    HI = teclado.nextInt();
    HF = teclado.nextInt();

    HR1 = HF - HI;

    if (HR1 <= 0){
        HR1 = (HR1 + 24);      
    }
    System.out.println("O JOGO DUROU "+HR1+" HORA(S)");
  }
 }