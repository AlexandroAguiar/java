import java.util.Scanner;
public class Uri1070{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);
        int x=0;
        x = teclado.nextInt();
        if (x % 2 == 0){
            x = x + 1;
        }
        for (int cont=1; cont<=6; cont++){
            System.out.println(x);
            x = x + 2;
        }
    }
}