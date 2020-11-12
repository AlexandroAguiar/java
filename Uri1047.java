import java.util.Scanner;
public class Uri1047{
public static void main(String args[]){
    Scanner teclado= new Scanner(System.in);
    int HI,HF,MI, MF, DURT, DURH, DURM;

    HI = teclado.nextInt();
    MI = teclado.nextInt();
    HF = teclado.nextInt();
    MF = teclado.nextInt();

    DURT = (HF * 60 + MF)- (HI * 60 + MI);

    if (DURT <= 0){
        DURT = (DURT + (60*24));      
    }
    DURH = DURT / 60;
    DURM = DURT % 60;
    System.out.println("O JOGO DUROU "+DURH+" HORA(S) E "+DURM+" MINUTO(S)");
  }
 }