import java.util.Scanner;
public class Uri1114{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);
        int senha,numd;
        senha = 2000;
        numd = teclado.nextInt();
        if (numd != senha){
            System.out.println("Senha Invalida");
        }
        else{
        System.out.println("Acesso Permitido");
        }
       
    }
}