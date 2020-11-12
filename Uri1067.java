import java.util.Scanner;
public class Uri1067{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);
        int numero=0;
        
        numero = teclado.nextInt();
        for (int cont=1; cont<=numero; cont += 2){
            System.out.println(cont);
        }
    }
}        