import java.util.Scanner;
public class Uri1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();

        for (int num=2; num <= N; num = num + 2){
            System.out.println(num+"^2 = "+ (num*num) );
        }
    }
}