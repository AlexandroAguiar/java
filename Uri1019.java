import java.util.Scanner;
public class Uri1019{
public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
        int N, horas, minu, seg, resto;
        double ValUnit1,ValUnit2,RESULT,RESULT1,RESULT2;

        //entrada
        N = teclado.nextInt();
        
        //processamento
        horas = N / 3600; // 1h = 3600 segundos
        //resto = N % 3600;
        minu = resto / 60; // 1min = 60 segundos
        seg = resto % 60;
        
        //saida
        
        //System.out.println("NUMBER = " + NunFunc);
        System.out.println(horas+":"+minu+":"+seg);

    }
}