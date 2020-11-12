import java.util.Scanner;
public class Uri1114V2{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);
        int senha,numd;
        senha = 2000;

        do{
            senha = teclado.nextInt();
        if (senha != 2002){
            System.out.println("Senha Invalida");
        }
        else{
        System.out.println("Acesso Permitido");
        }
        }
        while (senha != 2002);
    }
}