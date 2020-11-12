import java.util.Scanner;
public class Uri1008{
public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
        int NunFunc,HorasT;
        double Salario,RESULT;

        //entrada
        NunFunc = teclado.nextInt();
        HorasT = teclado.nextInt();
        Salario = teclado.nextDouble();
        
        //processamento
        RESULT = (HorasT * Salario);

        //saida
        
        System.out.println("NUMBER = " + NunFunc);
        System.out.printf("SALARY = U$ %.2f\n" , RESULT);

    }
}