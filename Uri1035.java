import java.util.Scanner;
public class Uri1035{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);

        int A,B,C,D;
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();
//            Cond1      Cond2       Cond3              Cond4     Cond4       Cond5  
        if ( (B > C) && (D > A) && (C + D > A + B) && (C > 0) && (D > 0) && (A % 2 == 0) ){
            System.out.println("Valores Aceitos");
        }
        else{
            System.out.println("Valores nao aceitos");
        }
    }
}