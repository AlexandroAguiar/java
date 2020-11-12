import java.util.Scanner;
public class Uri1164{
public static void main(String args[]){
    Scanner teclado= new Scanner(System.in);
     int somaDiv;
     int num;
     int N = teclado.nextInt();


        for (int cont = 1; cont <= N; cont++){
            num = teclado.nextInt();
            somaDiv = 0;
            for (int div=1; div < num; div++){
                if (num% div == 0){
                    somaDiv = somaDiv + div;
                }
            }
            if (somaDiv == num){
                System.out.println(num+" eh perfeito");
            }
            else {
                System.out.println(num+ " nao eh perfeito");
            }
        }
    }
}