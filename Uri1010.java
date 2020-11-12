import java.util.Scanner;
public class Uri1010{
public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
        int CodPeca1,NunPeca1,CodPeca2,NunPeca2;
        double ValUnit1,ValUnit2,RESULT,RESULT1,RESULT2;

        //entrada
        CodPeca1 = teclado.nextInt();
        NunPeca1 = teclado.nextInt();
        ValUnit1 = teclado.nextDouble();
        CodPeca2 = teclado.nextInt();
        NunPeca2 = teclado.nextInt();
        ValUnit2 = teclado.nextDouble();
        
        //processamento
        RESULT1 = (NunPeca1 * ValUnit1);
        RESULT2 = (NunPeca2 * ValUnit2);
        RESULT = (RESULT1 + RESULT2);

        //saida
        
        //System.out.println("NUMBER = " + NunFunc);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n" , RESULT);

    }
}